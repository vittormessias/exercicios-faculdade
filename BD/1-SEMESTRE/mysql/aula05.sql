use cadastro;

-- DML: DATA MANIPULATION LANGUAGE --
insert into pessoas
(id, nome, nascimento, sexo, peso, altura, nacionalidade)
values
(DEFAULT,'Creusa','1920-12-30','F','50.2','1.65', default);

select * from pessoas;

-- DML: DATA MANIPULATION LANGUAGE --
insert into pessoas values
(DEFAULT,'Adalgiza','1930-11-2','F','63.2','1.75', 'Irlanda');

select * from pessoas;

-- DML: DATA MANIPULATION LANGUAGE --
insert into pessoas values
(DEFAULT,'Claudio','1975-4-22','M','99.0','2.15', 'Brasil'),
(default, 'Pedro', '1999-12-3','M','87', '2', default),
(default, 'Janaína', '1987-11-12', 'F', '75.4', '1.66', 'EUA');

