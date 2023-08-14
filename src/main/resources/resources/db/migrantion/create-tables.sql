create table movie (
	adult boolean,
	backdrop_path varchar,
	genre_ids bigint,
	id bigint not null,
	original_title varchar,
	overview varchar,
	popularity double precision,
	poster_path varchar,
	release_date date,
	title varchar,
	video boolean,
	vote_average double precision,
	vote_count bigint,
	primary key(id)
)