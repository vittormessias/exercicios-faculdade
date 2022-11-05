CREATE DATABASE TARREFA09;

USE TAREFA09;

-- Criar as tabelas e Relacionamentos.
CREATE TABLE CURSOS(
CODCURSO INT,
NOME VARCHAR(20),
CONSTRAINT PK_CURSOS PRIMARY KEY(CODCURSO));

CREATE TABLE ALUNOS(
RM INT,
NOME VARCHAR(45),
CURSO INT,
SERIE INT,
PERIODO VARCHAR(20),
CONSTRAINT PK_ALUNOS PRIMARY KEY(RM),
CONSTRAINT FK_CURSOS FOREIGN KEY(CURSO)
REFERENCES CURSOS(CODCURSO));

CREATE TABLE DISCIPLINAS(
CODISC INT,
NOME VARCHAR(20),
CONSTRAINT PK_DISCIPLINAS PRIMARY KEY(CODISC));

CREATE TABLE NOTAS(
RM INT,
DISCIPL INT,
NOTA1  NUMERIC (10,2),
NOTA2 NUMERIC (10,2),
CONSTRAINT PK_NOTAS PRIMARY KEY(RM, DISCIPL),
CONSTRAINT FK_ALUNOS FOREIGN KEY(RM)
REFERENCES ALUNOS(RM),
CONSTRAINT FK_DISCIPLINAS FOREIGN KEY(DISCIPL)
REFERENCES DISCIPLINAS(CODISC));

--INSERIR 5 REGISTROS EM CADA TABELA
INSERT INTO DISCIPLINAS VALUES
(1,'INFORM�TICA'),
(2,'LPII'),
(3,'BANCO DE DADOS'),
(4,'MATEM�TICA'),
(5,'PL�STICO');

--INSERIR 5 REGISTROS EM CADA TABELA
INSERT INTO CURSOS VALUES
(1,'INFORM�TICA'),
(2,'LPII'),
(3,'BANCO DE DADOS'),
(4,'MATEM�TICA'),
(5,'PL�STICO');

--INSERIR 5 REGISTROS EM CADA TABELA
INSERT INTO ALUNOS VALUES
(1,'JOAO','BANCO DE DADOS',2,'MANH�'),
(2,'MARIA','INFORM�TICA',1,'NOITE'),
(3,'PEDRO','PL�STICO',5,'TARDE'),
(4,'MARIANA','INFORM�TICA',3,'MANH�'),
(5,'GUILHERME','BANCO DE DADOS',7,'NOITE');

--INSERIR 5 REGISTROS EM CADA TABELA
INSERT INTO NOTAS VALUES
(1,3,7,5),
(2,1,10,3),
(3,5,2,8),
(4,1,4,6),
(5,2,10,6);

--MOSTRAR NOME, PER�ODO E S�RIE DOS ALUNOS DE INFORM�TICA.
SELECT NOME, PERIODO, SERIE FROM ALUNOS WHERE CURSO IN ('INFORM�TICA')

--MOSTRAR NOME ALUNO, CURSO, NOME DA DISCIPLINA, NOTA1 E NOTA2, DE TODOS OS ALUNOS.
SELECT ALUNOS.NOME, ALUNOS.CURSO, DISCIPLINAS.NOME, NOTAS.NOTA1, NOTAS.NOTA2 FROM ALUNOS, NOTAS, DISCIPLINAS;

-- Selecionar todas as notas do aluno  (Seu nome);

-- Selecionar RM, nome e curso de todos os alunos com nota1 superior a 8 na disciplina Matem�tica;

-- Quantas notas (nota1) inferior a 6,0, em Banco de Dados,  temosno Cadastro de Notas? 

-- Qual a m�dia de Notas (Nota2) na disciplina LPII? 

-- Quantos alunos temos no curso de  Inform�tica? 

-- Quantos alunos temos no curso de  Pl�stico?

-- Selecionar todos os alunos que n�o possuem Nota1.

-- Selecionar todos os alunos que n�o possuem Nota2.

-- Selecionar todos os alunos que n�o possuem Nota1 emMatem�tica.