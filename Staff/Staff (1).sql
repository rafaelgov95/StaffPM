-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 09-Jun-2016 às 01:06
-- Versão do servidor: 5.5.49-0+deb8u1
-- PHP Version: 5.6.20-0+deb8u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Policia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `Staff`
--

CREATE TABLE IF NOT EXISTS `Staff` (
`id` int(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `idade` int(11) NOT NULL,
  `vcorrida` int(11) NOT NULL,
  `vapoio` int(11) NOT NULL,
  `vbarras` int(11) NOT NULL,
  `vabdom` int(11) NOT NULL,
  `mcorrida` int(11) NOT NULL,
  `mapoio` int(11) NOT NULL,
  `mbarras` int(11) NOT NULL,
  `mabdom` int(11) NOT NULL,
  `mf` double NOT NULL,
  `date` varchar(40) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `Staff`
--

INSERT INTO `Staff` (`id`, `nome`, `idade`, `vcorrida`, `vapoio`, `vbarras`, `vabdom`, `mcorrida`, `mapoio`, `mbarras`, `mabdom`, `mf`, `date`) VALUES
(19, 'Rafael', 26, 2600, 0, 0, 0, 0, 0, 0, 0, 7, '08/06/2016 15:56:32'),
(21, 'Higor', 33, 2300, 0, 8, 34, 6, 0, 10, 6, 8.75, '08/06/2016 20:53:33');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Staff`
--
ALTER TABLE `Staff`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Staff`
--
ALTER TABLE `Staff`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=22;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
