CREATE TABLE movie (
  adult boolean,
  backdrop_path text,
  genre_ids int[],
  id bigint,
  original_language text,
  original_title text,
  overview text,
  popularity double precision,
  poster_path text,
  release_date date,
  title text,
  video boolean,
  vote_average double precision,
  vote_count integer,
  primary key(id)

);
