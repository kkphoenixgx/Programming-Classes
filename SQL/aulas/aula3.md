[[SQL/aulas/index|index]]

// --------- CRIANDO UM BANCO DE DADOS ---------



CREATE DATABASE IF NOT EXISTS  cinecefet CHARSET=utf8 COLLATE=utf8_unicode_ci;
USE cineCefet;

CREATE TABLE IF NOT EXISTS Filme(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(40) NOT NULL,
    genero VARCHAR(20) NOT NULL DEFAULT 'DESCONHECIDO',
    imdb DECIMAL(9,1) NOT NULL,
    ano CHAR(4),
    UNIQUE INDEX uidx_filme_titulo(titulo)
) ENGINE = INNODB;


---------------------------------


DROP DATABASE IF EXISTS empresa_kaua;
CREATE DATABASE empresa_kaua CHARSET=utf8 COLLATE=utf8_unicode_ci ;
USE empresa_kaua;

CREATE TABLE IF NOT EXISTS funcionario(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    sexo ENUM('M', 'F') NOT NULL,
    salario DECIMAL(9,2) NOT NULL DEFAULT 980.00,
    INDEX idx_funcionario__nome(nome)
) ENGINE=INNODB AUTO_INCREMENT=1; 

DESCRIBE funcionario;



// --------- ADD ---------


// TABLE


USE cinecefet;

INSERT INTO filme(ID, TITULO, GENERO, ANO, INODB) VALUES
	(1, "INTERESTELEAR", "FIC��O", '2014', 9.7),
        (2, "SHERK", "ANIMA��O", '2001', 10.0);


SELECT = FROM Filme;



// COLUMN

* ALTER TABLE <x>


USE cinecefet;
ALTER TABLE filme ADD COLUMN data_cadastro DATE AFTER ano;
UPDATE filme SET data_cadastro = now();
SELECT * FROM filme;

USE empresa_kaua;
ALTER TABLE funcionario ADD COLUMN datanascimento DATE AFTER sexo,
ADD COLUMN departamento VARCHAR(30) NOT NULL DEFAULT "Vendas" AFTER salario;


INSERT INTO funcionario values 
(6, 'CICLANO', 'M', '1990-10-20', 3700.00, 'RH'),
(7, 'ALBERTO', 'M', '1985-11-06', 4500.00, 'VENDAS'),
(8, 'MARIANA', 'F', '1980-09-06', 2000.00, 'RH');





// --------- UPDATE ---------



UPDATE X SET salario = salario * 3


USE cinecefet;

/*UPDATE filme SET data_cadastro = '2024-09-01' WHERE (id=2 OR id=4 OR id=6);*/
UPDATE filme SET data_cadastro = '2024-09-01' WHERE id IN(2, 4, 6);
SELECT * FROM filme;

ALTER TABLE funcionario CHANGE COLUMN datanascimento data_nascimento DATE;
SHOW COLUMNS FROM funcionario;

ALTER TABLE funcionario MODIFY COLUMN data_nascimento date NOT NULL;

ALTER TABLE funcionario drop index idx_funcionario__nome;
alter table funcionario add unique index idx_funcionario__nome(nome);


UPDATE funcionario set salario = salario * 1.5  WHERE sexo ='F' and salario < 4000

update funcionario set salario = salario * 1.20 where SUBSTRING(data_nascimento, 1, 7) = '1985-11';



// --------- DELETE ---------


USE cinecefet;
DELETE FROM filme WHERE titulo = "SHERK";
SELECT * FROM filme;
describe filme;


DELETE TABLE <table>
TRUNCATE TABLE <table> // Limpa tudo


delete from table // deleta tudo;
drop table <table>; // deleta tudo mas mant�m a estrutura



// --------- SHOW --------- 


SELECT * FROM X WHERE ()

select * from funcionario

/* Primeira p�gina */
order by nome limit 0,5

/* P�gina 2 */
order by nome limit 5,5

/* P�gina 3 */
order by nome limit 10,5

select distinct // Mostra apenas os distintos


select * from funcionario;
order by nome ASC
order by sexo DESC, salario desc
order by nome limit 0,5
order by nome limit 5,5

WHERE SUBSTRING(data_nascimento, 6,2) in ('09', '11');



/* String come�a com 1 */

select * from funcionario where substring(campo, inicio, fim)

/* Ou '09' ou '11' */
select * from funcionario where substring(campo, inicio, fim) in ('09', '11');

concat(x, y, z...)


-- SELECT id, nome, sexo, departamento from funcionario WHERE(sexo = 'F') AND (departamento = 'ADMINISTRATIVO' or departamento = 'RH') ;
SELECT nome, sexo, departamento from funcionario WHERE(sexo = 'M') AND (departamento = 'ADMINISTRATIVO' or departamento = 'RH') ;

-- SELECT * FROM funcionario WHERE (salario > 2000 AND salario <= 3500  AND data_nascimento >= '1985-11-06' AND data_nascimento <= '1987-10-03');
-- SELECT * FROM funcionario  WHERE (salario > 2000 AND salario) AND data_nascimento BETWEEN '1985-11-06' AND '1987-10-03';


select nome, sexo, concat(substring(data_nascimento, 6,2), '/', substring(data_nascimento, 1, 4)) as 'mes/ano' from funcionario ORDER by data_nascimento;


