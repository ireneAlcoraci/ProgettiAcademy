package it.corso.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.time.LocalDateTime;

import it.corso.dto.UtenteAggiornamentoDto;
import it.corso.dto.UtenteDto;
import it.corso.dto.UtenteLoginRequestDto;
import it.corso.dto.UtenteLoginResponceDto;
import it.corso.dto.UtenteRegistrazioneDto;
import it.corso.model.Ruolo;
import it.corso.model.Utente;
import it.corso.service.BlackListService;
import it.corso.service.UtenteService;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotAuthorizedException;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Controller
@Path("/utente")
public class UtenteController {
	
	@Autowired
	private UtenteService utenteService;
	
	@Autowired
	private BlackListService blackList;

	@POST
	@Path("/registra")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registrazioneUtente(@Valid @RequestBody UtenteRegistrazioneDto utenteDto) {
		
		try {
			if (!Pattern.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,20}",utenteDto.getPassword())) {
				return Response.status(Response.Status.BAD_REQUEST).build();
			} 
			
			if(utenteService.esisteUtenteTramiteEmail(utenteDto.getEmail())) {
				return Response.status(Response.Status.BAD_REQUEST).build();
			}
						
			utenteService.registrazioneUtente(utenteDto);
			return Response.status(Response.Status.OK).build();
			
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	
	@DELETE
	@Path("/delete/{email}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response eliminaUtente(@PathParam(value = "email") String email) {
		
		try {
			utenteService.eliminaUtente(email);
			return Response.status(Response.Status.OK).build(); 
			
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	
	@GET
	@Path("/find")
	@Produces(MediaType.APPLICATION_JSON)
	public Response selezionaUtentePerEmail(@QueryParam("email") String email) {
		 try {
			   if (email != null && !email.isEmpty()) {

			    UtenteDto utenteDto = utenteService.prendiUtentePerEmail(email);
			    if (utenteDto != null) {
			     return Response.ok().entity(utenteDto).build();
			    }
			   }

			   return Response.status(Response.Status.BAD_REQUEST).build();

			  } catch (Exception e) {

			   return Response.status(Response.Status.BAD_REQUEST).build();
			  }
	}
	
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response aggiornaUtente(@RequestBody UtenteAggiornamentoDto utenteDto) {
		
		try {
			
			utenteService.aggiornaUtente(utenteDto);
			return Response.status(Response.Status.OK).build();
			
		} catch (Exception e) {
			
			return Response.status(Response.Status.BAD_REQUEST).build();

		}
		
		
	}
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public Response ottieniUtenti() {
		 try {

			   List<UtenteDto> listaUtenti = utenteService.ottieniUtenti();

			   return Response.status(Response.Status.OK).entity(listaUtenti).build();
			   

			  } catch (Exception e) {

				  return Response.status(Response.Status.BAD_REQUEST).build();
			  }
	}
	
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response loginUtente(@RequestBody UtenteLoginRequestDto utenteLoginRequestDto) {
		try {
			
			if (utenteService.loginUtente(utenteLoginRequestDto)) {
				return Response.ok(creaToken(utenteLoginRequestDto.getEmail())).build();
			}  
			
			 return Response.status(Response.Status.BAD_REQUEST).build();

			  } catch (Exception e) {

			   return Response.status(Response.Status.BAD_REQUEST).build();
			  }
	}
	
	
	private UtenteLoginResponceDto creaToken(String email) {
		//eseguiamo una cifratura attraverso l'algoritmo di crittografia HMAC
		byte[] chiaveSegreta = "chiaveSegretaImportante3452793865425781598484481561527".getBytes();
		
		//crittografia
		Key chiave = Keys.hmacShaKeyFor(chiaveSegreta);
		
		Utente utente = utenteService.restituisceUtenteDaEmail(email);
		
		//informazioni utente passate tramite una mappa
		Map<String, Object> map = new HashMap<>();
		map.put("email", email);
		map.put("nome", utente.getNome());
		map.put("cognome", utente.getCognome());
		List<String> ruoli = new ArrayList<>();
		
		for (Ruolo ruolo : utente.getRuoli()) {			
			ruoli.add(ruolo.getTipologia().name());			
		}
		
		map.put("ruoli", ruoli);
		//data di creazione e ttl(time to live)
		Date creationDate = new Date();		
		Date end = java.sql.Timestamp.valueOf(LocalDateTime.now().plusMinutes(15L));
		
		//creazione del token firmato con la chiave segreta
		String jwtToken = Jwts.builder()
		.setClaims(map)
		.setIssuer("http://localhost:8080")
		.setIssuedAt(creationDate)
		.setExpiration(end)
		.signWith(chiave)
		.compact();
		
		UtenteLoginResponceDto token = new UtenteLoginResponceDto();
		token.setToken(jwtToken);
		token.setTokenCreationTime(creationDate);
		token.setTtl(end);		
		
		return token;
		
	}
	
	@GET
	@Path("/logout")
	public Response logoutUtente(ContainerRequestContext requestContext) {
		try {
			String authorizationHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
			String token = authorizationHeader.substring("Bearer".length()).trim();
			
			blackList.invalidateToken(token);
			return Response.status(Response.Status.OK).build();
			
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
}
