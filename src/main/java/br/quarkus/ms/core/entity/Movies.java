package br.quarkus.ms.core.entity;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Movies {

	private int page;
	
	private List<Movie> results;
	
    private int totalResults;
    
    private int totalPages;
}
