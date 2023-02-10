select * from cursos
where nome like 'a%'; -- No inicio 

select * from cursos
where nome like '%a'; -- No final

select * from cursos
where nome like '%a%'; -- Em qualquer lugar

select * from cursos
where nome not like '%a%';

-- update
update cursos set nome = 'PáOO' where idcurso = '9';

select * from gafanhotos
where nome like '%silva';

-- distinct
select distinct carga from cursos;

-- Agregação
select count(*) 'total' from cursos where carga > 40;

select max(totaulas) from cursos where ano = '2016';

select nome, min(totaulas) from cursos where ano = '2016';

select sum(totaulas) from cursos where ano = '2016';

select avg(totaulas) from cursos where ano = '2016';