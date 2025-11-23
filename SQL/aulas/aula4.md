tags: [[SQL/aulas/index|index]]

use basevendas;
SELECT descricao, endereco FROM fornecedores WHERE estado="SP" and (cidade = "DIADEMA" or cidade = "BARUERI");
SELECT * from fornecedores 

SELECT * from fornecedores WHERE estado = "SP" and (cidade <> "BOTAS" or cidade <> "SAO PAULO"); 

SELECT descricao, telefone FROM fornecedores WHERE (estado="SP" or estado="MG") and (cidade is not NULL or cidade <> "");

SELECT * from  fornecedores ORDER BY descricao limit 5,8;


use basevendas;

SELECT descricao, pcusto, concat(pcusto * 1.3) as pvenda from produtos where (estoque > 0);

select descricao, pcusto, estoque, concat(pcusto * 1.25 * estoque) as balanco  from produtos;


---------------------------------------------------------------------


SELECT * from produtos WHERE pcusto * 1.30 > 8 and pcusto * 1.30 < 10;
SELECT * FROM produtos order by pcusto DESC;

SELECT * FROM clientes WHERE datacadastro > "2002/10/01";

SELECT * FROM clientes WHERE (datacadastro > "2002/10/01" and datacadastro < "2002/10/16");

SELECT valorTotal * 0.3 as lucro from vendas where (valorTotal * 0.3 > 100);

SELECT valorTotal, valorTotal * 0.03 as comissao from vendas;

-----------------------------------------------------------------


Valida��es


% (por cento) substitui qualquer subcadeia.
_ (sublinhado) substitui qualquer caractere.


Select * from fornecedores WHERE (telefone like "(21%" or telefone like "(11%");

SELECT * from produtos WHERE principio like "______%";

SELECT * from produtos WHERE principio like "A% %" or principio like "A% % %";

SELECT * from clientes WHERE cidade like "M%" and datacadastro like "____-11%";

SELECT nome, datacadastro,  concat( substring(datacadastro, 6, 2),"/", substring(datacadastro, 1, 4)  )  as "mes/ano" from clientes where cidade <> "FRIBURGO" and cidade <> "CORDEIRO";

SELECT concat(cidade, "-", bairro) as "cidade-bairro" from clientes where (cidade is not NULL and cidade <> "") and (bairro is not NULL and bairro <> "");


SELECT (pcusto * 0.5) as lucro from produtos where (pcusto * 0.5) > 30;

select * from produtos WHERE (estoque > 0) and (apresentacao <> "" and apresentacao is not NULL);


------------------------------------------------------------------------


SELECT tabela1.coluna1, tabela2.coluna2 from tabela1 inner join tabela2 on tabela1.coluna1 = tabela2.coluna2








