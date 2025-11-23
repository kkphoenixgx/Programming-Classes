# Aula 6
2025-01-28
tags: [[SQL/aulas/index|index]]

~~~sql
SET @valor = 1000
~~~

~~~sql
SET SESSION AUTOCOMMIT = 0
~~~ 

~~~sql
UPDATE conta SET saldo = saldo + @valor WHERE id = 2
~~~

~~~ sql 
ROLLBACK
~~~ 

~~~sql
COMMIT
~~~ 

~~~sql
SET SESSION AUTOCOMMIT = 1
~~~

 vez dado o commit, já era

~~~sql
ALTER TABLE filme ADD CONSTRAINT fk_filme_genero FOREGIN KEY (genero_id) REFERENCES generos(id)
~~~ 

## View


~~~sql
CREATE OR REPLACE VIEW vw_nome as <consulta>
~~~



