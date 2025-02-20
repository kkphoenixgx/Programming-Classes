DROP DATABASE IF EXISTS basegroupby;
CREATE DATABASE IF NOT EXISTS basegroupby;

USE basegroupby;

CREATE TABLE IF NOT EXISTS produto(id int auto_increment PRIMARY KEY,
nome varchar(20), principio varchar(20), fabricante varchar(20)
,estoque int default 0, pcusto decimal(9,2)
)ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO produto(nome,fabricante,principio,pcusto,estoque) VALUES
('PANT','ACHE','FINASTERIDA',20,10),
('BINOTAL','BAYER','AMPICILINA',20,5),
('AMPICILAB','EMS','AMPICILINA',16,15),
('SOMALIUM','ACHE','BROMAZEPAN',15,15),
('ANADOR','BAYER','DIPIRONA',7,15),
('ROGAINE','ROCHE','FINASTERIDA',28,10),
('LEXOTAN','ROCHE','BROMAZEPAN',12,20),
('STILNOX','SANDOZ','ZOLPIDEN',13,10);