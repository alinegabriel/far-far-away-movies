package br.quarkus.ms.outbound.client;

import br.quarkus.ms.core.entity.Movies;
import br.quarkus.ms.core.ports.out.ClientPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
public class TMDBClient implements ClientPort {

	@Override
	public Movies buscarFilmes(int page) {
		String API_URL = "https://api.themoviedb.org/3/movie/popular";
		String API_KEY = "a3b81cdc33c4b9999cd2a5e5bbd7581c";

		Client entrada = ClientBuilder.newClient();
		
		
		String url = API_URL + "?api_key=" + API_KEY + "&language=en-US&page=" + page;

	    Movies response = entrada
	        .target(url)
	        .request(MediaType.APPLICATION_JSON)
	        .get(Movies.class);

		 return new Movies(page, response.getResults(), response.getTotal_pages(), response.getTotal_results());
	}	        
}
