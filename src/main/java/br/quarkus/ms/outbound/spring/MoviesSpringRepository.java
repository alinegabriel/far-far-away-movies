package br.quarkus.ms.outbound.spring;

import org.springframework.data.repository.CrudRepository;

import br.quarkus.ms.core.entity.Movie;

public interface MoviesSpringRepository extends CrudRepository <Movie, Long> {

}
