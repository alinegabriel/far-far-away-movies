package br.quarkus.ms.core.services;

import br.quarkus.ms.core.entity.Movies;
import br.quarkus.ms.core.ports.in.MoviesServicePort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
public class MoviesService implements MoviesServicePort {
	
	 String API_URL = "https://api.themoviedb.org/3/movie/popular";
	 String API_KEY = "a3b81cdc33c4b9999cd2a5e5bbd7581c";

	private Client entrada = ClientBuilder.newClient();

	@Override
	public Movies listarFilmes(int page) {
		
	        String url = API_URL + "?api_key=" + API_KEY + "&language=en-US&page=" + page;

	        Movies response = entrada
	            .target(url)
	            .request(MediaType.APPLICATION_JSON)
	            .get(Movies.class);	        
	        
	       return new Movies(page, response.getResults(), response.getTotal_pages(), response.getTotal_results());
		}
}
