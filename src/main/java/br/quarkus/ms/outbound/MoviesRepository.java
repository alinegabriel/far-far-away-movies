package br.quarkus.ms.outbound;

import br.quarkus.ms.core.entity.Movie;
import br.quarkus.ms.core.ports.out.MoviesRepositoryPort;
import br.quarkus.ms.outbound.spring.MoviesSpringRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class MoviesRepository implements MoviesRepositoryPort{

	@Inject
	private MoviesSpringRepository moviesSpringRepository;
	
	@Override
	public void save(Movie movie) {
		moviesSpringRepository.save(movie);
		
	}

}
