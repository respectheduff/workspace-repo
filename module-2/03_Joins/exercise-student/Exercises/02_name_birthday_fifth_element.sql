-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)
SELECT person.person_name, person.birthday
FROM person INNER JOIN movie_actor ON person.person_id = movie_actor.actor_id
INNER JOIN movie ON movie_actor.movie_id = movie.movie_id
WHERE movie.title = 'The Fifth Element';

