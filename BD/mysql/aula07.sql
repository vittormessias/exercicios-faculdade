select * from cursos;

-- Inserindo valores --
insert into cursos values
('1','HTML4','Curso de HTML5','40','37','2014'),
('2','Algoritmos','Lógica de Programação','20','15','2014'),
('3','Photoshop','Dicas de Photoshop CC','10','8','2014'),
('4','PGP','Curso de PHP para iniciantes','40','20','2010'),
('5','Jarva','Introdução á linguagem Java','10','29','2000'),
('6','MySQL','Bancos de Dados MySQL','30','15','2016'),
('7','Word','Curso completo de Word','40','30','2016'),
('8','Sapateado','Danças Rítmicas','40','30','2018'),
('9','Cozinha Árabe','Aprenda a fazer kibe','40','30','2018'),
('10','Youtuber','Gerar polêmica e ganhar inscritos','5','2','2018');

select * from cursos;
-- DML: Data Manipulation Language --
-- Fazendo atualizações nos dados --
UPDATE cursos set nome = 'HTML5' WHERE idcurso = '1';

UPDATE cursos set nome = 'PHP', ano = '2015' WHERE idcurso = '4';

-- O comando 'limit' limita a ação do comando para uma certa quantidade de linhas --
UPDATE cursos set nome = 'JAVA', carga = '40', ano = '2015' WHERE idcurso = '5' limit 1;

UPDATE cursos set ano = '2018', carga = '0' WHERE ano = '2050' limit 1;

select * from cursos;

-- DML: Data Manipulation Language --
-- Apagar linhas -- 
DELETE FROM cursos WHERE idcurso = '8';

-- Apagar linhas com limit --
DELETE FROM cursos WHERE ano = '2050' limit 2;

-- DML: Data Manipulation Language --
-- Remover todos os registros --
TRUNCATE TABLE cursos;
