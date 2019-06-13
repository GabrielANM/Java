-- 2: criando database
CREATE DATABASE sistema;

-- 3: deficindo database
USE sistema;

-- 6: criando a tabela
CREATE TABLE departamento (
	id_departamento INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR (100),
    telefone CHAR (15)
);

-- 7: visualizar a tabela
SHOW TABLES;
DESCRIBE departamento;

-- 8: criando a tabela funcionario
CREATE TABLE funcionario (
	id_funcionario INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR (100),
    id_departamento INTEGER,
    FOREIGN KEY (id_departamento) REFERENCES departamento (id_departamento),
    data_cadastro DATE
);
    
-- 9: deletar a tabela funcionario
DROP TABLE funcionario;
    
-- 10: criar a tabela funcionario sem a FK
CREATE TABLE funcionario (
	id_funcionario INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR (100),
    data_cadastro DATE
);

-- 11: adicionando a FK na tabela funcionario
ALTER TABLE funcionario ADD id_departamento INTEGER;
ALTER TABLE funcionario ADD FOREIGN KEY (id_departamento) REFERENCES departamento (id_departamento);

-- 12: inserir registro
INSERT INTO departamento VALUES (
	"financeiro",
    '123456789123456'
);