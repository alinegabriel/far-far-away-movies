package br.quarkus.ms.core.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Movies {

	@Column(name = "adult")
   	private boolean adult;

	@Column(name = "backdrop_path")
    private String backdropPath;
	
	@Column(name = "genre_ids")
    private List<Integer> genreIds;

	@Id
    private long id;
	
	@Column(name = "original_language")
    private String originalLanguage;

	@Column(name = "original_title")
    private String originalTitle;

	@Column(name = "overview")
    private String overview;
    
	@Column(name = "popularity")
    private double popularity;

	@Column(name = "poster_path")
    private String posterPath;

	@Column(name = "release_date")
    private String releaseDate;

	@Column(name = "title")
    private String title;
    
	@Column(name = "video")
    private boolean video;

	@Column(name = "vote_average")
    private double voteAverage;
  
	@Column(name = "vote_count")
    private int voteCount;
}
