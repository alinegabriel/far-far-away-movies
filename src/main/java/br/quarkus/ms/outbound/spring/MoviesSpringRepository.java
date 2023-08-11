package br.quarkus.ms.outbound.spring;

import org.springframework.data.repository.CrudRepository;

import br.quarkus.ms.core.entity.Movies;

public interface MoviesSpringRepository extends CrudRepository <Movies, Long> {
}
