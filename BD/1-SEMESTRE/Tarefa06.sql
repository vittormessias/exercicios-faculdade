CREATE DATABASE TAREFA06;

USE TAREFA06;

CREATE TABLE EMPREGADOS(
MATR CHAR(6),
NOME VARCHAR(12),
SOBRENOME VARCHAR(25),
DEPT VARCHAR(20),
FONE VARCHAR(14),
DATA_ADM DATETIME,
CARGO VARCHAR(20),
SEXO CHAR(1),
IDADE INT,
SALARIO NUMERIC(10,2),
COMISSAO NUMERIC(10,2)
);

SELECT * FROM EMPREGADOS;

-- Inserir 10 registros --
INSERT INTO EMPREGADOS VALUES 
('AAA001', 'Olivia', 'Cardoso', 'Administrativo', '(63)3407-3248', 2019/03/20, 'Auxiliar', 'F', 26, 2361.00, 100.00),
('AAB002', 'Maysa', 'Gonçalves', 'Financeiro', '(99) 2483-4678', 2019-01-18, 'Analista', 'F', 24, 3361.00, 200.00),
('AAC003', 'João', 'Costela', 'Recursos humanos', '(22) 3725-5852', 2019-02-25, 'Supervisor', 'M', 32, 2561.00, 500.00),
('AAD004', 'João', 'Miguel', 'Comercial', '(82) 2656-2795', 2019-13-09, 'Gerente', 'M', 35, 5301.00, 700.00),
('AAE005', 'Milena', 'Freitas', 'Marketing', '(69) 2296-5771', 2019-09-18, 'Assistente', 'F', 26, 1361.00, 100.00),
('AAF006', 'Lavínia', 'Costa', 'Jurídico', '(47) 2800-4725', 2019-10-24, 'Procurador', 'F', 29, 4361.00, 300.00),
('AAG007', 'Camila', 'Dias', 'Operacional', '(98) 3047-9088', 2019-08-21, 'Auxiliar', 'F', 21, 1261.00, 100.00),
('AAH008', 'Alana', 'Moreira', 'TI', '(86) 2472-1534', 2019-09-29, 'Programador', 'F', 23, 4761.00, 500.00),
('AAI009', 'Yasmin', 'Porto', 'TI', '(67) 2838-0137', 2019-07-01, 'Desenvolvedor', 'F', 27, 3481.00, 500.00),
('AAJ010', 'Beatriz', 'Teixeira', 'TI', '(88) 3487-4815', 2019-09-19, 'Programador', 'F', 18, 2461.00, 500.00);


SELECT * FROM EMPREGADOS;

-- DELETE FROM EMPREGADOS; --

-- Selecionar o sobrenome, primeiro nome, departamento,data de admissão e salário de todos os empregados que ganham mais que R$ 5000. --
SELECT SOBRENOME, NOME, DEPT, DATA_ADM, SALARIO FROM EMPREGADOS WHERE SALARIO > 5000;

-- Qual a média de salários dos funcionários? --
SELECT avg(SALARIO) as 'media' FROM EMPREGADOS;

-- Quantos funcionários pertencem ao departamento de TI? --
SELECT count(*) as 'total' FROM EMPREGADOS WHERE DEPT = 'TI';

-- Quantos funcionários temos com cargo igual a PROGRAMADOR? --
SELECT count(*) as 'total' FROM EMPREGADOS WHERE CARGO = 'PROGRAMADOR';

-- Qual o somatório dos salários? --
SELECT sum(SALARIO) as 'soma' FROM EMPREGADOS;

-- Qual o valor do maior salário? --
SELECT max(SALARIO) as 'Maior Salario' FROM EMPREGADOS;

-- Qual o valor do menor salário? --
SELECT min(SALARIO) as 'Menor Salario' FROM EMPREGADOS;

-- Atribuir um aumento de 5% aos funcionários do departamento de TI. --
UPDATE EMPREGADOS SET SALARIO = SALARIO * 0.5 WHERE DEPT = 'TI';

-- Selecionar os cargos (sem duplicidade).
SELECT distinct CARGO FROM EMPREGADOS;

-- Selecionar os funcionários com idade entre 30 e 40 anos (inclusive). --
SELECT * FROM EMPREGADOS WHERE IDADE BETWEEN 30 AND 40; 

-- Qual a média de idades? --
SELECT avg(IDADE) as 'Media de Idade' FROM EMPREGADOS;

-- Selecionar todos os funcionários com idade entre 20 e 30 anos (inclusive) do departamento de TI. --
SELECT * FROM EMPREGADOS WHERE (IDADE BETWEEN 20 AND 30) AND DEPT = 'TI';

-- Selecionar todos os funcionários cujo nome inicia-se pela letra ‘J’. --
SELECT * FROM EMPREGADOS WHERE NOME LIKE 'J%';

-- Selecionar todos os funcionários dos departamentos de TI, Vendas e Marketing. --
SELECT * FROM EMPREGADOS WHERE DEPT IN ('TI', 'VENDAS', 'MARKETING');