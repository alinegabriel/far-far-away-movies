package br.quarkus.ms.core.services;

import br.quarkus.ms.core.entity.Movie;
import br.quarkus.ms.core.entity.Movies;
import br.quarkus.ms.core.ports.in.MoviesServicePort;
import br.quarkus.ms.core.ports.out.ClientPort;
import br.quarkus.ms.core.ports.out.MoviesRepositoryPort;

public class MoviesService implements MoviesServicePort {
	
	private MoviesRepositoryPort moviesRepositoryPort;
	private ClientPort clientPort;
	
	public MoviesService(final MoviesRepositoryPort moviesRepositoryPort, ClientPort clientPort) {
        this.moviesRepositoryPort = moviesRepositoryPort;
        this.clientPort = clientPort;
    }
	
	@Override
	public Movies listarFilmes(int page) {		
	        return clientPort.buscarFilmes(page);
		}

	@Override
	public Movies salvarFilmes(int page) {
		
		Movies movies = listarFilmes(page);
	
		for (Movie movie : movies.getResults()) {
			moviesRepositoryPort.save(movie);
		}
		
		return movies;
	}
}
