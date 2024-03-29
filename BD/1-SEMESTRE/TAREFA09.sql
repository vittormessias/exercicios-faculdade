-- DROP DATABASE TAREFA09;

CREATE DATABASE TAREFA09;

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
(1,'JOAO',3,2,'MANH�'),
(2,'MARIA',1,1,'NOITE'),
(3,'PEDRO',5,5,'TARDE'),
(4,'MARIANA',1,3,'MANH�'),
(5,'GUILHERME',3,7,'NOITE');

--INSERIR 5 REGISTROS EM CADA TABELA
INSERT INTO NOTAS VALUES
(1,3,7,5),
(2,1,10,3),
(3,5,2,8),
(4,1,4,6),
(5,2,10,6);

--MOSTRAR NOME, PER�ODO E S�RIE DOS ALUNOS DE INFORM�TICA.
SELECT NOME, PERIODO, SERIE FROM ALUNOS WHERE CURSO = 1;

--MOSTRAR NOME ALUNO, CURSO, NOME DA DISCIPLINA, NOTA1 E NOTA2, DE TODOS OS ALUNOS.
SELECT ALUNOS.NOME, ALUNOS.CURSO, DISCIPLINAS.NOME, NOTAS.NOTA1, NOTAS.NOTA2 FROM ALUNOS, NOTAS, DISCIPLINAS;

-- Selecionar todas as notas do aluno  (Seu nome);
SELECT NOME, NOTA1, NOTA2 FROM NOTAS, ALUNOS WHERE NOME = 'JOAO';

-- Selecionar RM, nome e curso de todos os alunos com nota1 superior a 8 na disciplina Matem�tica;
SELECT ALUNOS.RM, ALUNOS.NOME, ALUNOS.CURSO, NOTAS.NOTA1, DISCIPLINAS.NOME FROM NOTAS, DISCIPLINAS, ALUNOS WHERE NOTA1 > 8 AND DISCIPL = 4;

-- Quantas notas (nota1) inferior a 6,0, em Banco de Dados,  temos no Cadastro de Notas?
SELECT * FROM NOTAS WHERE NOTA1 < 6 AND DISCIPL = 3;

-- Qual a m�dia de Notas (Nota2) na disciplina LPII?
SELECT avg(NOTAS.NOTA2) as 'media' FROM NOTAS WHERE DISCIPL = 2;

-- Quantos alunos temos no curso de  Inform�tica?
SELECT COUNT(*) AS 'TOTAL' FROM ALUNOS WHERE CURSO = 1;

-- Quantos alunos temos no curso de  Pl�stico?
SELECT COUNT(*) AS 'TOTAL' FROM ALUNOS WHERE CURSO = 5;

-- Selecionar todos os alunos que n�o possuem Nota1.
SELECT * FROM ALUNOS, NOTAS WHERE NOTAS.NOTA1 = Null;

-- Selecionar todos os alunos que n�o possuem Nota2.
SELECT * FROM ALUNOS, NOTAS WHERE NOTAS.NOTA2 = Null;

-- Selecionar todos os alunos que n�o possuem Nota1 em Matem�tica.
SELECT ALUNOS.NOME, NOTAS.NOTA1 FROM ALUNOS, NOTAS WHERE DISCIPL = 4 AND NOTAS.NOTA1 = Null;
