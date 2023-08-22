package br.quarkus.ms.core.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "movie")
@NoArgsConstructor
public class Movie {

	@Column(name = "adult")
   	private boolean adult;

	@Column(name = "backdrop_path")
    private String backdrop_path;
	
	@Column()
    private List<Integer> genre_ids;

    @Id
    private long id;
	
	@Column(name = "original_language")
    private String original_language;

	@Column(name = "original_title")
    private String original_title;

	@Column(name = "overview")
    private String overview;
    
	@Column(name = "popularity")
    private double popularity;

	@Column(name = "poster_path")
    private String poster_path;

	@Column(name = "release_date")
    private LocalDate release_date;

	@Column(name = "title")
    private String title;
    
	@Column(name = "video")
    private boolean video;

	@Column(name = "vote_average")
    private double vote_average;
  
	@Column(name = "vote_count")
    private int vote_count;

}
