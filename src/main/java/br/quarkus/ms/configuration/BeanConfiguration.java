package br.quarkus.ms.configuration;

import br.quarkus.ms.core.ports.out.MoviesRepositoryPort;
import br.quarkus.ms.core.services.MoviesService;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;

@Dependent
public class BeanConfiguration {

	@Produces
	public MoviesService moviesService(MoviesRepositoryPort moviesRepositoryPort) {
		return new MoviesService(moviesRepositoryPort);
	}
}
