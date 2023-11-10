package br.quarkus.ms.core.ports.out;

import br.quarkus.ms.core.entity.Movie;

public interface MoviesRepositoryPort {

	void save(Movie movie);

}
