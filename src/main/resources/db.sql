-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2022 at 12:38 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javauser`
--

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `name` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `amka` varchar(11) NOT NULL,
  `birthdate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`name`, `surname`, `amka`, `birthdate`) VALUES
('Teo', 'Chaik', '1112141254', '2012-06-01'),
('Petros', 'Georgiou', '1112141254', '2012-11-01'),
('Maria', 'Anagnostou', '1124512', '2010-12-01'),
('Eleni', 'Papadopoulou', '224520154', '2004-01-01'),
('Marios', 'Siatras', '233145512', '2000-07-01'),
('Teodoro', 'Savinio', '12345666', '2001-01-01'),
('Masimmiliano', 'Di penta', '654987778', '1985-01-02'),
('Mario', 'Fragkouli', '7789984654', '1956-03-04'),
('Marko', 'Mpotsari', '01011784145', '1784-01-08'),
('Tenorio', 'Bocelli', '1254785452', '1974-01-08');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
