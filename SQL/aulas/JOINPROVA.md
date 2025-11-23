tags: [[SQL/aulas/index|index]]

--------- Exercicio 1 ----------

--cliente bairro cidade 
Select cliente.nome from cliente join bairro on(cliente.bairro_id = bairro.id) join cidade on(cidade.id = bairro.cidade_id) where cidade.nome = "NOVA FRIBURGO" and cliente.nome not like "% % % % %" and cliente.nome like "A%A" 

--------- Exercicio 2 ----------

--produto_vendido produto fornecedor cidade uf

select distinct produto.nome from produto_vendido join produto on(produto.id = produto_vendido.produto_id) join fornecedor on(produto.fornecedor_id = fornecedor.id) join cidade on(fornecedor.cidade_id = cidade.id) join uf on(cidade.uf_id = uf.id) where concat(produto_vendido.valor_unitario * 1,3 ) > 50 and uf.sigla in("SP", "MG", "RS")

--------- Exercicio 3 ----------
--vendas cliente

select vendas from venda join cliente on( venda.cliente_id = cliente.id ) where venda.datavenda like "2006%" and cliente.nome like "____ %" order by cliente.name  limit 15,5

--------- Exercicio 4 ----------
-- vendedor → cliente ← venda
-- cliente ← bairro ← cidade

select cliente.nome, vendedor.nome, venda.valor_total from vendedor join cliente on (vendedor.id = cliente.vendedor_id) join venda on(venda.cliente_id = cliente.id) join bairro on(cliente.bairro_id = bairro.id) join cidade on(bairro.cidade_id = cidade.id) join uf on(cidade.uf_id = uf.id) where uf.sigla <> 'RJ' and uf.sigla <> 'SP' and vendedor.nome like '% %'

--------- Exercicio 5 ----------


-- venda → produto_vendido → produto → fornecedor → cidade → uf

select distinct uf.sigla from venda join produto_vendido on(venda.id = produto_vendido.venda_id) join produto on(produto_vendido.produto_id = produto.id) join fornecedor on (produto.fornecedor_id = fornecedor.id) join cidade on(fornecedor.cidade_id = cidade.id) join uf on(cidade.uf_id = uf.id) where venda.datavenda like '2006%' and produto.estoque > 20


--------- Exercicio 6 ----------


--vendedor ← cliente ← venda 
--cliente → bairro ← cidade

select vendedor.nome, vendedor.id from vendedor join cliente on(cliente.vendedor_id = vendedor.id) join venda on(cliente.id = venda.cliente_id) join bairro on(bairro.id = cliente.bairro_id) join cidade on(bairro.cidade_id = cidade.id) where cliente.nome like '%HOSPITAL%' and cidade.nome in("CARMO", "SUMIDOURO", "NOVA FRIBURGO") and venda.valor_total > 2000


-------------------------------------Lista 2-------------------------------------


--------- Exercicio 1 ----------

-- cidade ← aluno  → emprestimo → exemplar → livro → assunto

select distinct aluno.nome from cidade join aluno on(cidade.id = aluno.cidade_id) join emprestimo on(aluno.matricula = emprestimo.aluno_matricula) join exemplar on(emprestimo.exemplar_id = exemplar.id) join livro on(livro.id = exemplar.livro_id) join assunto on(livro.assunto_id = assunto.id) where aluno.data_nascimento >= "2002/01/01" and aluno.data_nascimento <= "2002/12/31" and cidade.nome <> "CARMO" and cidade.nome <> "MACUCO"  and exists(select 1 from emprestimo as emprestimo2 join exemplar as exemplar2 on(emprestimo2.exemplar_id = exemplar2.id ) join livro as livro2 on(livro2.id = exemplar2.livro_id) join assunto as assunto2 on(assunto2.id = livro2.assunto_id) where  emprestimo2.aluno_matricula = aluno.matricula and assunto2.nome = "HISTÓRIA"  ) and exists(select 1 from emprestimo as emprestimo2 join exemplar as exemplar2 on(emprestimo2.exemplar_id = exemplar2.id ) join livro as livro2 on(livro2.id = exemplar2.livro_id) join assunto as assunto2 on(assunto2.id = livro2.assunto_id) where  emprestimo2.aluno_matricula = aluno.matricula and assunto2.nome = "GEOGRAFIA"  )

--------- Exercicio 2 ----------


-- editora  ← livro → livro_autor → autor
	-- livro → exemplar ← emprestimo → aluno

	select livro.titulo, editora.nome 
	from aluno 
		join emprestimo on(emprestimo.aluno_matricula = aluno.matricula) 
		join exemplar on(emprestimo.exemplar_id = exemplar.id) 
		join livro on(exemplar.livro_id = livro.id)
		join livro_autor on( livro.id = livro_autor.livro_id ) 
		join autor on(autor.id = livro_autor.autor_id)
		join editora on(livro.editora_id = editora.id)

	 where autor.nome not like 'A%'  and autor.nome not like 'F%'  and autor.nome not like 'G%' and 
	exists(
		 select 1
		 from emprestimo as emprestimo2
			join aluno as aluno2 on(emprestimo2.aluno_matricula = aluno2.matricula)
			join cidade as cidade2 on(aluno2.cidade_id = cidade2.id)
		 where aluno2.matricula =  aluno.matricula and cidade2.nome not like '% %' ) 


--------- Exercicio 3 ----------

	funcionarios ← emprestimo → exemplar → livro

	select distinct funcionario.nome from funcionario
		join emprestimo on(funcionario.id = emprestimo.funcionario_id)
		join exemplar on(exemplar.id = emprestimo.exemplar_id)
		join livro on(livro.id = exemplar.livro_id)
	where emprestimo.data_emprestimo like '2002-09%'

--------- Exercicio 4 ----------


	--  assunto ← livro ← exemplar ← emprestimo  ← aluno

	select assunto.nome, livro.titulo from aluno
		join emprestimo on(aluno.matricula = emprestimo.aluno_matricula)
		join exemplar on(exemplar.id = emprestimo.exemplar_id)
		join livro on(livro.id = exemplar.livro_id)
		join assunto on(assunto.id = livro.assunto_id)
	where assunto.nome in("REDES", "PROGRAMAÇÃO") and livro.ano_publicacao = "2010" and( substring(aluno.nome, 1, 1) = "M" or substring(aluno.nome, 1, 1) = "P" or substring(aluno.nome, 1, 1) = "R")  order by assunto.nome asc limit 10,10 


-------------------------------------Lista 3-------------------------------------

--------- Exercicio 1 ----------

cliente vendas 

select cliente.nome, venda.datavenda, venda.valor_total 
from cliente
	join venda on(cliente.id = venda.cliente_id)
where venda.datavenda like '2005%' and cliente.nome like '% %'
	order by cliente.nome limit 10,5

--------- Exercicio 2 ----------

-- venda ← cliente →  vendedor 

select venda.datavenda, vendedor.nome, venda.valor_total 
from venda
	join cliente on(venda.cliente_id = cliente.id)
	join vendedor on(vendedor.id = cliente.vendedor_id)
where (substring(cliente.nome, 1, 1) = "A" or substring(cliente.nome, 1, 1) = "C" or substring(cliente.nome, 1, 1) = "D")

--------- Exercicio 3 ----------

--cliente bairro cidade

select distinct cliente.nome 
from cliente
	join bairro on(cliente.bairro_id = bairro.id)
	join cidade on(cidade.id = bairro.cidade_id)
where cidade.nome = "CORDEIRO" and cliente.nome like "% %" and cliente.nome not like "% % % % %"




