use cadastro;

describe pessoas; 

-- ddl: Definição
-- Adicionando uma coluna
ALTER TABLE pessoas
ADD column profissao varchar(10);

select * from pessoas;

-- ddl: Definição
-- Excluindo uma coluna
ALTER TABLE pessoas
drop column profissao;

-- ddl: Definição
-- Adicionando uma coluna após a coluna nome
ALTER TABLE pessoas
ADD column profissao varchar(10) AFTER nome;

-- ddl: Definição
-- Adicionando uma coluna em primeiro (na frente de todas as outras)
ALTER TABLE pessoas
ADD column codigo INT first;

-- ddl: Definição
-- Modificando tipos e constraints
ALTER TABLE pessoas
MODIFY column profissao varchar(20) NOT NULL default'';

-- ddl: Definição
-- Modificando tipos, constraints e Nome da coluna
ALTER TABLE pessoas
CHANGE column profissao prof varchar(20);

-- ddl: Definição
-- Renomear o nome da tabela inteira
ALTER TABLE pessoas
RENAME TO gafanhotos;

-- descreva tabela
desc gafanhotos;

-- Nova tabela --
CREATE TABLE IF NOT EXISTS cursos(
nome VARCHAR(30) NOT NULL UNIQUE,
descricao TEXT,
carga INT UNSIGNED,
totaulas INT UNSIGNED,
ano YEAR DEFAULT '2016') DEFAULT CHARSET = utf8;

desc cursos;

-- ddl: Definição
-- Adicionando uma coluna em primeiro
ALTER TABLE cursos
ADD column idcurso INT first;

-- ddl: Definição
-- Adicionando a chave primaria
ALTER TABLE cursos
ADD PRIMARY KEY (idcurso);


-- Nova tabela --
CREATE TABLE IF NOT EXISTS teste(
id INT,
nome varchar(10),
idade int);

insert into teste value
('1', 'Pedro', '22'),
('2','Maria', '12'),
('3', 'Maricota', '77');

select * from teste;

-- ddl: Definição
-- Apaga 
drop table if exists teste;

