# Comandos SQL
2024-10-08
tags: [[🐬 indexSQL]]

DML = INSERT, DELETE, UPDATE

DDL= CREATES, DROPS, 
DCL = 
TC = COMANDOS DE CONTROLE, COMMIT, ROLLBACK


## DDL

> `CREATE DATABASE <db>`

Cria o db

> `SHOW <db>`

Mostra o db

> `USE <db>`

Entra para utilizar o db

> `DROP <db>`

Deleta o db

Criando um db prático: 

![[20241008_202925.jpg]]

`CREATE TABLE IF NOT EXISTS funcionario(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(60) NOT NULL, sexo ENUM('M', 'F') NOT NULL, salario DECIMAL(9,2) NOT NULL DEFAULT 980.00, INDEX idx_funcionario_nome(nome)) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT = 1`



## DDL

ALTER TABLE 
ADD COLUMN
AFTER TABLE
CHANGE COLUMN


RENAME TABLE X to Y
ALTER TABLE 


## Atributos, Opções

NOT NULL = defult nas PRIMARY KEY
SET= mais de um valor dentro do universo de possíveis

VarChar não reserva o máximo 

![[20241008_205027.jpg]]

![[20241008_205642.jpg]]

AAAA-MM-DD HH:MM:SS

## DML 

A ordem dos comandos deve ser respeitada.

INSERT 
* No id