/* criando um banco de dados*/
create database generation;

/*exemplo de erro de sintaxe */
create databas generation;

/* indicando qual banco de dados iremos usar */
use generation;

/* criando uma tabela */
create table alunos (
	id int(11) primary key auto_increment not null,
    nome varchar(30),
    sobrenome varchar(30),
    email varchar(30),
    idade int(3),
);