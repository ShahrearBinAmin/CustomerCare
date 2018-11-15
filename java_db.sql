-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2017 at 08:05 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `user2`
--

CREATE TABLE `user2` (
  `username` text NOT NULL,
  `name` text NOT NULL,
  `lastname` text NOT NULL,
  `password` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user2`
--

INSERT INTO `user2` (`username`, `name`, `lastname`, `password`) VALUES
('s', 'shanto', 'amin', '123'),
('ss', 'Shahin', 'shuvo', '123'),
('ka', 'kamal', 'mal', '1234'),
('sfsfsdf', 'sss', 'Bin Amin', '123'),
('hhh', 'ththth', '', ''),
('s', 'shanto', 'amin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `user3`
--

CREATE TABLE `user3` (
  `username` text NOT NULL,
  `name` text NOT NULL,
  `lastname` text NOT NULL,
  `password` text NOT NULL,
  `mobile` text NOT NULL,
  `gender` text NOT NULL,
  `email` text NOT NULL,
  `atm` text NOT NULL,
  `idislmibank` text NOT NULL,
  `pinislamibank` text NOT NULL,
  `islamibank` text NOT NULL,
  `idcitybank` text NOT NULL,
  `pincitybank` text NOT NULL,
  `citybank` text NOT NULL,
  `idstandard` text NOT NULL,
  `pinstandard` text NOT NULL,
  `standardchartered` text NOT NULL,
  `idbankasia` text NOT NULL,
  `pinbankasia` text NOT NULL,
  `bankasia` text NOT NULL,
  `iddbbl` text NOT NULL,
  `pindbbl` text NOT NULL,
  `dbbl` text NOT NULL,
  `idbracbank` text NOT NULL,
  `pinbracbank` text NOT NULL,
  `bracbank` text NOT NULL,
  `money` text NOT NULL,
  `airtime` text NOT NULL,
  `totalmb` int(11) NOT NULL,
  `totalmin` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user3`
--

INSERT INTO `user3` (`username`, `name`, `lastname`, `password`, `mobile`, `gender`, `email`, `atm`, `idislmibank`, `pinislamibank`, `islamibank`, `idcitybank`, `pincitybank`, `citybank`, `idstandard`, `pinstandard`, `standardchartered`, `idbankasia`, `pinbankasia`, `bankasia`, `iddbbl`, `pindbbl`, `dbbl`, `idbracbank`, `pinbracbank`, `bracbank`, `money`, `airtime`, `totalmb`, `totalmin`) VALUES
('Shuvo', 'Shahin', 'Alom', '123', '01742481063', 'Male', 'shahinshuvo91@gmail.com', 'Master Card', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '0', '0', 0, 0),
('gergqer', 'fqergqr', 'gqergqer', 'gherghqerghqerq', 'ergherh', 'Male', 'ethth', 'VISA', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 0, 0),
('agsdfdf', 'wergfg', 'gfdsgdfgfadg', 'dgsdgd', 'fgsdfh', 'Male', 'fgsdghsdf', 'VISA', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 0, 0),
('d', 'dfd', 'df', 'd', 'd', 'Female', 'd', 'Master Card', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 0, 0),
('saki', 'sakib', 'rahman', '123', '56567', 'Other', 'rtgrtey', 'Nexus', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 0, 0),
('AladinMc', 'Aladin', 'Sojon', '123', '016', 'Male', 'aladinsojon911@gmail.com', 'Master Card', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 0, 0),
('sas', 'Shahin', 'Alam Shuvo', '123', '345345345', 'Male', 'shah@gmail.com', 'VISA', '', '', '960', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '40', '0', 0, 0),
('kp', 'Kamal', 'Parvez', '123', '016', 'Male', 'kamalparvez@gmail.com', 'VISA', '', '', '856', '', '', '933', '', '', '1000', '', '', '1000', '', '', '963', '', '', '1000', '131', '', 0, 0),
('sha2', 'shahrear', 'Bin Amin', '123', '01620404736', 'Male', 'shahrearbinamin1@gmail.com', 'VISA', '', '', '1000', '', '', '900', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '70', '30', 0, 0),
('sb', 'Shahrear', 'Bin Amin', '123', '01620404736', 'Male', 'shahrearbinamin1@gmail.com', 'Nexus', '0', '0', '0', '4564564676', '123', '4166', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '728', '460', 0, 4),
('kp2', 'Kamal', 'Parvez', '123', '01620404736', 'Male', 'kamalparvez1@gamil.com', 'VISA', '', '', '1000', '', '', '970', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '7', '23', 0, 0),
('shanto55', 'shahrear', 'Bin Amin', '', '', 'Male', '', 'VISA', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '0', '0', 0, 0),
('sba', 'Shahrear', 'Bin Amin', '345', '01620404736', 'Male', 'shahrearbinamin1@gmail.com', 'American Express', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '0', '0', 0, 0),
('ghdfshsfd', 'hhj', 'bgdfshsghs', 'ghfsg', 'fhsf', 'Male', 'fhsg', 'VISA', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '0', '0', 0, 0),
('johnson', 'mitchel', 'johnson', 'kamal', '01785615253', 'Male', 'kamalparvez02@gmail.com', 'VISA', '', '', '900', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '80', '20', 0, 0),
('pranto', 'Pranto', 'Hasan', '123', '01636789603', 'Male', 'pranto@gmail.com', 'American Express', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '0', '0', 0, 0),
('sakibba', 'Sakib', 'Rahaman', '123', '01343546565', 'Male', 'gfgfdgdf', 'VISA', '', '', '200', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '100', '100', 3000, 0),
('shan', 'abb', 'xdf', '123', 'ftgvgv', 'Male', 'vubh', 'VISA', '', '', '1000', '', '', '500', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '100', '171', 1300, 0),
('Gautam', 'Gautam', 'Gambhir', '13', '01521243463', 'Male', 'gautam@gmail.com', 'VISA', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '900', '', '', '1000', '71', '29', 0, 0),
('arafat', 'Arafat', 'Hossain', '123', '01756765438', 'Male', 'arafat@gmail.com', 'VISA', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '', '', '1000', '0', '0', 0, 0),
('sb1', 'dfsdfsdf', 'sdfsdfsd', '123', 'fgdg', 'Male', 'dfgdfg', 'VISA', '0', '0', '0', '0', '0', '0', '', '', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 0, 0),
('shuvo11', 'fghfgh', 'fghfgh', '123', 'fsdfsd', 'Male', 'sdfsd', 'VISA', '0', '0', '0', '0', '0', '0', '', '', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 0, 0),
('c', 'Shahrear', 'Bin Amin', '1', '017656576575', 'Male', 'shahrerbin@gmail.com', 'VISA', '90', '0', '77', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 0, 0),
('aladin44', 'gettyt', 'fdgdfg', '123', '0154980698059', 'Male', 'safsdfsd@gmail.com', 'VISA', '90', '0', '89', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '50', '0', 0, 0),
('damn', 'sdfsdf', 'sdfsdf', '123', '', 'Male', '', 'VISA', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 0, 0),
('ruhulAmin', 'Ruhul', 'Amin', '123', '01735106970', 'Male', 'ruhulamin@gmail.com', 'Master Card', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user3`
--
ALTER TABLE `user3`
  ADD PRIMARY KEY (`username`(100));

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
