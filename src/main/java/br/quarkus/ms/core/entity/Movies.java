package br.quarkus.ms.core.entity;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Movies {

	private int page;
	
	private List<Movie> results;
    
    private int total_pages;
    
    private int total_results;

	public Movies(int page, List<Movie> results, int total_pages, int total_results) {
		this.page = page;
		this.results = results;
		this.total_pages = total_pages;
		this.total_results = total_results;
	}
	
    
}
