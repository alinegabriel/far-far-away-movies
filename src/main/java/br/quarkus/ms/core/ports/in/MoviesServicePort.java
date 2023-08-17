package br.quarkus.ms.core.ports.in;

import java.util.List;

import br.quarkus.ms.core.entity.Movie;

public interface MoviesServicePort {

	List<Movie> listarFilmes();
	
}
