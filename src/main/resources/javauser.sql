-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2022 at 02:41 PM
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
('Petros', 'Georgiou', '1112141444', '2012-11-01'),
('Maria', 'Anagnostou', '1124512', '2010-12-01'),
('Eleni', 'Papadopoulou', '224520154', '1961-01-01'),
('Marios', 'Siatras', '233145512', '2000-07-01'),
('Teodoro', 'Savinio', '12345666', '2001-01-01'),
('Masimmiliano', 'Di penta', '654987778', '1985-01-02'),
('Mario', 'Fragkouli', '7789984654', '1956-03-04'),
('Marko', 'Mpotsari', '01011784145', '1784-01-08'),
('Tenorio', 'Bocelli', '1254785452', '1974-01-08'),
('Alpha', 'Beta', '1234', '1900-01-01'),
('Marika', 'Pentagiotissa', '66666666', '1980-05-05');

-- --------------------------------------------------------

--
-- Table structure for table `vaccination`
--

CREATE TABLE `vaccination` (
  `insured` varchar(11) NOT NULL,
  `vacc_date` date NOT NULL,
  `expiration_date` date NOT NULL,
  `vaccine_brand` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vaccination`
--

INSERT INTO `vaccination` (`insured`, `vacc_date`, `expiration_date`, `vaccine_brand`) VALUES
('1234', '2022-06-03', '2022-09-02', 'Pfizer'),
('12345666', '2022-06-01', '2022-09-01', 'Astra Zeneca'),
('1112141254', '2022-05-05', '2022-09-01', 'Pfizer'),
('1112141444', '2021-11-15', '2022-05-31', 'Pfizer'),
('1124512', '2022-04-01', '2022-10-02', 'Pfizer'),
('224520154', '2022-06-01', '2022-05-05', 'Astra Zeneca');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
