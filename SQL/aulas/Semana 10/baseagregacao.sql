-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 07-Jun-2022 às 20:50
-- Versão do servidor: 10.4.17-MariaDB
-- versão do PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `baseagregacao`
--
DROP DATABASE IF EXISTS baseagregacao;
CREATE DATABASE IF NOT EXISTS `baseagregacao` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `baseagregacao`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `principio` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fabricante` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `estoque` int(11) DEFAULT 0,
  `pcusto` decimal(9,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id`, `nome`, `principio`, `fabricante`, `estoque`, `pcusto`) VALUES
(1, 'TYLENOL', 'PARACETAMOL', 'BAYER', 10, '5.00'),
(2, 'NOVALGINA', 'DIPIRONA', 'HMS', 5, '8.00'),
(3, 'PROPÉCIA', 'FINASTERIDA', 'PFIZER', 7, '35.00'),
(4, 'DÔRICO', 'PARACETAMOL', 'TEUTO', 5, '8.00'),
(5, 'FINALOP', 'FINASTERIDA', 'SANDOZ', 8, '25.00'),
(6, 'PANT', 'MINOXIDIL', 'ACHE', 10, '20.00'),
(7, 'BINOTAL', 'AMPICILINA', 'BAYER', 5, '20.00'),
(8, 'AMPICILAB', 'AMPICILINA', 'EMS', 15, '16.00'),
(9, 'SOMALIUM', 'BROMAZEPAN', 'ACHE', 10, '15.00'),
(10, 'ANADOR', 'DIPIRONA', 'BAYER', 15, '7.00'),
(11, 'ROGAINE', 'MINOXIDIL', 'ROCHE', 20, '28.00'),
(12, 'LEXOTAN', 'BROMAZEPAN', 'ROCHE', 12, '12.00'),
(13, 'STILNOX', 'ZOLPIDEM', 'SANDOZ', 10, '13.00');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
