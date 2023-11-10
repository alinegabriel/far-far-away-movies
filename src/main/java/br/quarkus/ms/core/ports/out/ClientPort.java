package br.quarkus.ms.core.ports.out;

import br.quarkus.ms.core.entity.Movies;

public interface ClientPort {

	Movies buscarFilmes(int page);
}
