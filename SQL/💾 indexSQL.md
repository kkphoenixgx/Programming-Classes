# SQL
2025-02-15
tags: #SQL

SQL (Structured Query Language) é uma linguagem de programação usada para gerenciar e manipular bancos de dados relacionais. Foi desenvolvida na década de 1970 e tornou-se uma linguagem padrão para interagir com sistemas de gerenciamento de banco de dados (SGBDs) como o MySQL, Oracle, SQL Server, PostgreSQL, entre outros.

* Definir padrão que o usuário escolha é fica mais fácil os query 

![[Screenshot_20241022_182959_Obsidian.jpg]]

Sobre normalização de Modelagem de Dados:
> **Eliminar atributos compostos e multivalorados**

**SGBD** = Sistema Gerenciador de Banco de Dados

![[Screenshot_20241008_185730_Teams.jpg]]

A entidade fraca sempre recebe a chave estrangeira. Quando temos N para N, criamos uma entidade associativa com aa Fk. E quando temos 1 para 1, tanto faz.

## CONCEITOS DE MODELAGEM DE DADOS:

**Atributo simples** = valor simples
**Atributo composto** = o que pode ser decomposto em varios atributos existentes.
**Atributo multivalorado** = que pode obter vários valores, como telefone, que pode ser mudado com o tempo, você cria uma entidade que terá os possíveis valores de telefone.
**Atributo Derivado** = 

**Atributo chave** = que é diferente.
    * *Natural* = que é diferente por natureza, CPF, CNPJ
    * *Artificial* = gerado artificialmente
**Chave composta** = uma chave que tem diversos "identificadores" mas que pode se repetir.

*  2NF = não pode haver atributos dependentes, compostos. 
* 3FN = Um atributo não chave não pode depender de outro atributos não chave 







