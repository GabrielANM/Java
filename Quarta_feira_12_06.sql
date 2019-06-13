/* criando um banco de dados*/
create database generation;

/*exemplo de erro de sintaxe */
create databas generation;

/* indicando qual banco de dados iremos usar */
use generation;

/* criando uma tabela */
create table alunos (
	id int(11) primary key auto_increment not null,
    nome varchar(50),
    sobrenome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf varchar(11) unique
);

INSERT INTO alunos (
	nome, 
	sobrenome, 
	email, 
	data_nascimento, 
	cpf
) VALUES (
	"João", 
	"Camargo", 
	"joão@digitalhouse.com", 
	"2001-05-22", 
	"12345678900"
);

SELECT id, nome, sobrenome, email, data_nascimento, cpf
FROM alunos;

SELECT * FROM alunos;

SELECT nome, sobrenome FROM alunos;

SELECT * FROM alunos WHERE nome = "João";
SELECT * FROM alunos WHERE id = 2 OR cpf = "47077779882";

DELETE FROM alunos WHERE id = 1;

UPDATE alunos SET sobrenome = "Da Galera" WHERE id = 2;

SELECT sobrenome FROM alunos WHERE id = 2;

create table professores (
	id int(11) primary key auto_increment not null,
    nome varchar(50),
    sobrenome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf varchar(11) unique
);

INSERT INTO professores (
	nome,
    sobrenome,
    email,
    data_nascimento,
    cpf
) VALUES (
	"Jorge",
    "Ferreira",
    "jorge@digitalhouse.com",
    "1980-08-30",
    12345678900
);

create table cursos (
	id int(11) primary key auto_increment not null,
    nome varchar(50)
);

INSERT INTO cursos (
    nome
) VALUE (
	"Generation"
);

create table turmas (
	id int(11) primary key auto_increment not null,
    descricao varchar(50),
    periodo varchar(20),
    id_alunos int(11),
    id_professores int(11),
    id_cursos int(11)
);

INSERT INTO turmas (
	descricao,
    periodo,
    id_alunos,
    id_professores,
    id_cursos
) VALUE (
	"É UMA TURMA FODA!!",
    "INTEGRAL",
    1,
    1,
    1
);

-- DROP TABLE turmas;

SELECT * FROM turmas;

/* exibindo todas as tabelas do meu banco de dados */
show tables;

/* descrever os detalhes de uma tabela */
describe alunos;

-- DROP DATABASE generation;
SHOW TABLES;

ALTER TABLE turmas ADD FOREIGN KEY (id_alunos) REFERENCES alunos (id);
ALTER TABLE turmas ADD FOREIGN KEY (id_professores) REFERENCES professores (id);
ALTER TABLE turmas ADD FOREIGN KEY (id_cursos) REFERENCES cursos (id);

DESCRIBE turmas;

ALTER TABLE turmas DROP FOREIGN KEY turmas_ibfk_2;

ALTER TABLE alunos RENAME TO aluno;
ALTER TABLE cursos RENAME TO curso;
ALTER TABLE professores RENAME TO professor;
ALTER TABLE turmas RENAME TO turma;