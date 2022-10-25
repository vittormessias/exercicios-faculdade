CREATE DATABASE TAREFA07;

USE TAREFA06;

--  Criar as seguintes tabelas:(com os relacionamentos)
CREATE TABLE CLIENTES
(CODCLI int,
NOME varchar(30),
ENDER varchar(40),
BAIRRO varchar(20),
CIDADE varchar(20),
IDADE int,
CONSTRAINT PK_CLIENTES PRIMARY KEY(CODCLI));

--  Criar as seguintes tabelas:(com os relacionamentos)
CREATE TABLE PRODUTOS
(CODPROD INT,
DESCRICAO VARCHAR(20),
PRECO NUMERIC(9,2),
CONSTRAINT PK_PRODUTOS PRIMARY KEY(CODPROD));

--  Criar as seguintes tabelas:(com os relacionamentos)
CREATE TABLE PEDIDOS
(CODPED INT,
CODCLI INT,
DATA DATETIME,
CONSTRAINT PK_PEDIDOS PRIMARY KEY(CODPED));

--  Criar as seguintes tabelas:(com os relacionamentos)
CREATE TABLE ITENS_PEDIDOS
(CODPED INT,
CODPROD INT,
QTDE INT,
CONSTRAINT PK_ITENS_PEDIDOS PRIMARY KEY(CODPED, CODPROD),
CONSTRAINT FK_PEDIDOS FOREIGN KEY(CODPED)
REFERENCES PEDIDOS(CODPED),
CONSTRAINT FK_PRODUTOS FOREIGN KEY(CODPROD)
REFERENCES PRODUTOS(CODPROD));


-- Inserir 5 registros em cada tabela.
INSERT INTO CLIENTES VALUES
(1,'OLIVIA','RUA BEATRIZ TEXEIRA','PORTO ALEGRE','SCS',19),
(2, 'MILENA','RUA GONÇALVES COMERCIAL','LAVINIA','SÃO PAULO',26),
(3, 'CAMILA','RUA PORTO MOREIRA','JARDIM DIAS','SANTO ANDRÉ',32),
(4, 'ALANA','RUA MIGUEL CARDOSO','JARDIM DOLORES','MAUÁ',52),
(5, 'YASMIM','RUA FREITAS COSTAS','PEIXOTO','SBC',12);

SELECT * FROM CLIENTES;

-- Inserir 5 registros em cada tabela.
INSERT INTO PRODUTOS VALUES
(1,'AÇUCAR', 3.50),
(2, 'SAL',3.50),
(3, 'ARROZ',3.50),
(4, 'FEIJÃO',15.50),
(5, 'CAFÉ',50.00);

SELECT * FROM PRODUTOS;

-- Inserir 5 registros em cada tabela.
INSERT INTO PEDIDOS VALUES
(1,1,2022-08-10),
(2,2,2022-03-23),
(3,3,2022-11-13),
(4,4,2022-12-16),
(5,5,2022-09-17);

SELECT * FROM PEDIDOS;

-- Inserir 5 registros em cada tabela.
INSERT INTO ITENS_PEDIDOS VALUES
(1,1,15),
(2,2,12),
(3,3, 20),
(4,4,8),
(5,5,30);

SELECT * FROM ITENS_PEDIDOS;

-- Selecionar todos os produtos com preço entre 10 e 70. 
SELECT * FROM PRODUTOS WHERE PRECO BETWEEN 10 AND 70;

-- Qual a média de idade dos clientes
SELECT AVG(IDADE) AS 'MÉDIA DE IDADE' FROM CLIENTES;

-- Qual a média de preços dos produtos 
SELECT AVG(PRECO) AS 'MÉDIA DE PREÇO' FROM PRODUTOS;

-- Quantos pedidos temos no cadastro? 
SELECT COUNT(*) AS 'TOTAL' FROM PEDIDOS;

-- Selecionar todos os clientes que moram em Santo André, SBC, SCS ou Mauá
SELECT * FROM CLIENTES WHERE CIDADE IN ('SANTO ANDRÉ', 'SBC','SCS','MAUÁ');

-- Qual o preço do produto mais caro?
SELECT MAX(PRECO) AS 'MAIOR PREÇO' FROM PRODUTOS ;

-- Quantos itens tem o pedido 01
SELECT QTDE AS 'Itens' FROM ITENS_PEDIDOS WHERE CODPED = 1;

-- Qual o valor total de produtos que temos no cadastro?
SELECT COUNT(PRECO) AS 'TOTAL' FROM PRODUTOS ;

-- Selecionar todas as cidades que temos clientes, sem duplicidade.
SELECT distinct CIDADE FROM CLIENTES;

--  Quantos clientes temos no cadastro com idade maior que 30?
SELECT * FROM CLIENTES WHERE IDADE > 30;