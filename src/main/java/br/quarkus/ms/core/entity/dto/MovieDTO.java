package br.quarkus.ms.core.entity.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieDTO {

	   	private boolean adult;

	    private String backdrop_path;
		
	    private List<Integer> genre_ids;

	    private long id;
		
	    private String original_language;

	    private String original_title;

	    private String overview;
	    
	    private double popularity;

	    private String poster_path;

	    private LocalDate release_date;

	    private String title;
	    
	    private boolean video;

	    private double vote_average;
	  
	    private int vote_count;

}
