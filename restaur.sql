CREATE DATABASE restaurante;

USE restaurante;

CREATE TABLE cliente (
	id_cliente INTEGER NOT NULL,
    nome VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_cliente)
);

DESCRIBE cliente;

INSERT INTO cliente (
	id_cliente,
    nome
) VALUES (
	1,
	"Maria"
), (
	2,
    "João"
);

SELECT * FROM cliente;