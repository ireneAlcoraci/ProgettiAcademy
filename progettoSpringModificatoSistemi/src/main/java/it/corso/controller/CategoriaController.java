package it.corso.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import it.corso.dto.CategoriaAggiornamenoDto;
import it.corso.dto.CategoriaCreazioneDto;
import it.corso.dto.CategoriaDto;
import it.corso.service.CategoriaService;
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

@Controller
@Path("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCategoriaById(@PathParam(value = "id") Integer id) {
		 try {
			   if (id != 0) {
				   CategoriaDto categoriaDto = categoriaService.getCategoriaById(id);
				   
				   if (categoriaDto != null) {
					   return Response.ok().entity(categoriaDto).build();
				   } 
			}
			   
			return Response.status(Response.Status.NOT_FOUND).build();

		 } catch (Exception e) {

			   return Response.status(Response.Status.BAD_REQUEST).build();
		 }
	}
	
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllOfCategoria(@QueryParam("categoria") String nome ) {
		 
			 try {				   
					
					List<CategoriaDto> listaCategorie = categoriaService.getAllCategorie(nome);

					return Response.status(Response.Status.OK).entity(listaCategorie).build();
				
			} catch (Exception e) {
				return Response.status(Response.Status.BAD_REQUEST).build();
			}
			   

	}
	
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCategoria(@RequestBody CategoriaCreazioneDto categoriaCreazioneDto) {
		
		try {					
									
			categoriaService.createCategoria(categoriaCreazioneDto);
			return Response.status(Response.Status.OK).build();
			
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response eliminaCategoria(@PathParam(value = "id") int id) {
		
		try {
			categoriaService.deleteCategoria(id);
			return Response.status(Response.Status.OK).build(); 
			
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateCategoria(@RequestBody CategoriaAggiornamenoDto categoriaDto) {
		
		try {
			
			categoriaService.updatecategoria(categoriaDto);
			return Response.status(Response.Status.OK).build();
			
		} catch (Exception e) {
			
			return Response.status(Response.Status.BAD_REQUEST).build();

		}
		
		
	}
	
	
}
