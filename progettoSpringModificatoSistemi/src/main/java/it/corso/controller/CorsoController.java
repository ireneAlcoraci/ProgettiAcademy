package it.corso.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import it.corso.dto.CorsoDto;
import it.corso.jwt.JWTTokenNeeded;
import it.corso.jwt.Secured;
import it.corso.service.CorsoService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Secured(role = "Admin")
@JWTTokenNeeded
@Path("/corso")
public class CorsoController {
	
	@Autowired
	private CorsoService corsoService;
	

	@GET
	 @Path("/corsi")
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.APPLICATION_JSON)
	 public Response getCourses() {

	  try {

	   List<CorsoDto> listaCorsi = corsoService.ottieniCorsi();
	   return Response.status(Response.Status.OK).entity(listaCorsi).build();

	  } catch (Exception e) {

	   return Response.status(Response.Status.BAD_REQUEST).entity("Errore caricamento utenti").build();
	  }
	 
	}
	
	@POST
	@Path("/insert")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertCorse(@RequestBody CorsoDto corsoDto) {
		try {
			if (!corsoService.esisteCorso(corsoDto.getNomeCorso()) && corsoService.inserisciCorso(corsoDto)) {
				return Response.status(Response.Status.OK).build();
			}
			
			return Response.status(Response.Status.BAD_REQUEST).build();	
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	@DELETE
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteCorse(@QueryParam("nome") String nomeCorso) {
		try {
			if (corsoService.esisteCorso(nomeCorso)) {
				corsoService.eliminaCorso(nomeCorso);
				return Response.status(Response.Status.OK).build();
			}
			
			return Response.status(Response.Status.BAD_REQUEST).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	@GET
	@Path("/find/{nome}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findCourse(@PathParam(value = "nome") String nomeCorso) {
		try {
			
			if (corsoService.esisteCorso(nomeCorso)) {
				CorsoDto corso = corsoService.trovaCorso(nomeCorso);
				return Response.status(Response.Status.OK).entity(corso).build();
			}
			
			return Response.status(Response.Status.BAD_REQUEST).build();
			
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateCorse(@RequestBody CorsoDto corsoDto) {
		try {
			
			if (corsoService.esisteCorso(corsoDto.getNomeCorso())) {
				corsoService.aggiornaCorso(corsoDto);
				return Response.status(Response.Status.OK).build();
			}
			
			return Response.status(Response.Status.BAD_REQUEST).build();
			
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		
	}
}