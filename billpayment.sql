-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2017 at 08:07 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `billpayment`
--

-- --------------------------------------------------------

--
-- Table structure for table `pdb`
--

CREATE TABLE `pdb` (
  `username` text NOT NULL,
  `bill` int(11) NOT NULL,
  `balance` int(11) NOT NULL,
  `january` int(11) NOT NULL,
  `february` int(11) NOT NULL,
  `march` int(11) NOT NULL,
  `april` int(11) NOT NULL,
  `may` int(11) NOT NULL,
  `june` int(11) NOT NULL,
  `july` int(11) NOT NULL,
  `august` int(11) NOT NULL,
  `september` int(11) NOT NULL,
  `october` int(11) NOT NULL,
  `november` int(11) NOT NULL,
  `december` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
