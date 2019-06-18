SHOW databases;
DESCRIBE users;
USE movies_db;

SELECT COUNT(*) FROM movies;

SELECT * FROM movies;

SELECT COUNT(id) AS total FROM movies WHERE genre_id = 3;

SELECT * FROM movies;

SELECT AVG (rating) FROM movies;

SELECT SUM(length) AS total FROM movies;

SELECT SUM(length) AS total FROM movies WHERE rating >= 9;

SELECT MIN(rating) AS mais_ruim FROM movies;

SELECT MAX(rating) AS mais_bom FROM movies;

UPDATE movies SET rating = 10 WHERE id = 10;

SELECT * FROM movies;

SELECT title FROM movies GROUP BY genre_id;

SELECT * FROM series;
SELECT COUNT(title) FROM series GROUP BY genre_id;


