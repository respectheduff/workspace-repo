-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)
SELECT DISTINCT genre_name
FROM person
JOIN movie_actor ON person.person_id = movie_actor.actor_id
JOIN movie_genre ON movie_genre.movie_id = movie_actor.movie_id
JOIN genre ON genre.genre_id = movie_genre.genre_id
JOIN movie ON movie_actor.movie_id = movie.movie_id
WHERE person_name LIKE 'Robert De Niro' AND release_date >='2010-01-01';
