package br.quarkus.ms.core.dto;

import java.time.LocalDate;

//import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MoviesDTO {

   	private boolean adult;

    private String backdropPath;
	
    private int genreIds;

    private long id;
	
    private String originalLanguage;

    private String originalTitle;

    private String overview;
    
    private double popularity;

    private String posterPath;

    private LocalDate releaseDate;

    private String title;
    
    private boolean video;

    private double voteAverage;
  
    private int voteCount;
}
