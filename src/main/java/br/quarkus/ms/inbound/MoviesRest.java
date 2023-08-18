package br.quarkus.ms.inbound;

import br.quarkus.ms.core.entity.Movies;
import br.quarkus.ms.core.ports.in.MoviesServicePort;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

@Path("/listagem")
public class MoviesRest {
	
	@Inject
	private MoviesServicePort moviesServicePort;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarFilmes(@QueryParam("page") int page) {
		try {
			Movies listarFilmesPopulares = moviesServicePort.listarFilmes(page);
			return Response.status(200).entity(listarFilmesPopulares).build();
		} catch (Exception ex) {
			return Response.status(400).entity(ex.getMessage()).type("application/json").build();
		}
	}
}
