CREATE DATABASE gfood;
USE gfood;
CREATE TABLE cliente (
id INTEGER NOT NULL AUTO_INCREMENT,
nome VARCHAR(100),
address VARCHAR(200),
PRIMARY KEY (id)
);

INSERT INTO cliente (nome, address)
VALUES ("Valeria Carolina", "Principe, 255");