-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)
SELECT title, release_date
FROM movie INNER JOIN movie_actor on movie.movie_id = movie_actor.movie_id
INNER JOIN person ON movie_actor.actor_id = person.person_id
WHERE person_name LIKE 'Tom Hanks';


