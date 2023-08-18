package br.quarkus.ms.core.ports.in;

import br.quarkus.ms.core.entity.Movies;

public interface MoviesServicePort {

	Movies listarFilmes(int page);
	
}
