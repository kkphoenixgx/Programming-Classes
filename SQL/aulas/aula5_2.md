tags: [[SQL/aulas/index|index]]


select fabricante, sum(pcusto) as total from produto group by fabricante 


select fabricante, sum(pcusto) as total from produto where substring(nome, 1,1) <> 'S' group by fabricante 


select fabricante, count(*) as qtde from produto group by fabricante having count(*) > 1


3 - select
    from
1 - where
2 - group by
4 - having
5 - order by
6 - limit

select fabricante from produto order by fabricante having sum(*) > 15




