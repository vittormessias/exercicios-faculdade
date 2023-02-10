-- selecione do sexo feminino
select * from gafanhotos where sexo = 'F'; 

-- liste os dados de todos que ansceram entre 1/jan/2000 e 31/Dez/2015
select * from gafanhotos where nascimento between '2000-01-01' and '2015-12-31';

-- Liste o nome de todos homens que trabalham como programadores
select nome from gafanhotos where sexo = 'M' and profissao = 'Programador';

-- liste os dados das mulheres que nasceram no BR e que tem seu nome iniciando com a letra J
select * from gafanhotos where nome like 'J%' and sexo = 'F' and nacionalidade = 'Brasil';

-- liste o nome e nacionalidade de todos os homens q tem silva no nome, não nasceram no BR e pesam menos de 100Kg
select nome, nacionalidade from gafanhotos where nome like '%Silva%' and not nacionalidade = 'Brasil' and peso < 100;

-- maior altura entre homens que moram no BR
select nome, max(altura) from gafanhotos where nacionalidade = 'Brasil' and sexo = 'M';

-- media de peso 
select min(peso) from gafanhotos; 

-- menor peso entre as mulheres que nacionalidade fora do BR e entre 01/01/1990 e 31/12/200
select min(peso) from gafanhotos where sexo = 'F' and not nacionalidade = 'Brasil' and nascimento between '1990-01-01' and '2000-12-31';

-- qnts mulheres tem mais de 1.90 de altura
select count(*) 'mulheres com mais de 1.90 de altura' from gafanhotos where sexo = 'F' and altura > 1.90;
