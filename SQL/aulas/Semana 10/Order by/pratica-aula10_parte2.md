[[SQL/aulas/index|index]]

1-

select fabricante, count(*) as qtd from produto group by fabricante;


2-

select fabricante, sum(pcusto) as total from produto group by fabricante; 

3-
select fabricante, sum(pcusto) as total from produto where nome like 'S%' group by fabricante; 


4-
select fabricante, sum(pcusto) as total from produto group by fabricante order by total desc; 


5-
select fabricante, sum(pcusto) as total from produto group by fabricante order by total desc limit 3; 

6-
select fabricante, count(*) as qtd from produto group by fabricante having count(*) > 1


7-
select fabricante, sum(pcusto) as total from produto group by fabricante having total > 15;

8- 

select fabricante from produto group by fabricante having sum(pcusto) > 16;

9-

select sum(*) as qtd from produto where nome not like "S%" group by fabricante having qtd > 1;


10-

SELECT principio,fabricante, COUNT(*) AS TOTAL FROM produto GROUP BY fabricante, principio