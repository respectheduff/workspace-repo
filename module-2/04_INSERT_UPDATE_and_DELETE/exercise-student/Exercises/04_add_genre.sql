-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)
INSERT INTO genre ( genre_name) VALUES ('Sports')
INSERT INTO genre (title) VALUES ('Coach Carter')
WHERE genre_name = 'Sports';
