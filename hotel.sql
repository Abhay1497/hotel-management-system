-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 20, 2018 at 07:11 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`'root'`@`'localhost'` PROCEDURE `getALL` ()  NO SQL
SELECT * FROM custdetail$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `bktab_bkup`
--

CREATE TABLE `bktab_bkup` (
  `book_id` int(3) NOT NULL,
  `room_no` varchar(3) DEFAULT NULL,
  `date_fro` datetime DEFAULT NULL,
  `date_to` datetime DEFAULT NULL,
  `no_of_day` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bktab_bkup`
--

INSERT INTO `bktab_bkup` (`book_id`, `room_no`, `date_fro`, `date_to`, `no_of_day`) VALUES
(1, '101', '2012-01-10 00:00:00', '2012-01-12 00:00:00', NULL),
(2, '103', '2012-01-07 00:00:00', '2012-01-10 00:00:00', NULL),
(3, '105', '2012-01-11 00:00:00', '2012-01-13 00:00:00', NULL),
(4, '108', '2012-01-08 00:00:00', '2012-01-09 00:00:00', NULL),
(5, '112', '2012-01-11 00:00:00', '2012-01-13 00:00:00', NULL),
(6, '118', '2012-01-11 00:00:00', '2012-01-13 00:00:00', NULL),
(7, '123', '2012-01-07 00:00:00', '2012-01-10 00:00:00', NULL),
(8, '120', '2012-01-08 00:00:00', '2012-01-09 00:00:00', NULL),
(9, '110', '2012-01-08 00:00:00', '2012-01-08 00:00:00', NULL),
(10, '125', '2012-01-09 00:00:00', '2012-01-10 00:00:00', NULL),
(11, '109', '2012-01-09 00:00:00', '2012-01-11 00:00:00', 2),
(12, '108', '2012-01-09 00:00:00', '2012-01-12 00:00:00', 3),
(13, '105', '2017-11-19 00:00:00', '2017-11-23 00:00:00', 4),
(14, '103', '2017-11-19 00:00:00', '2017-11-21 00:00:00', 2),
(15, '103', '2017-11-24 00:00:00', '2017-11-25 00:00:00', 1);

-- --------------------------------------------------------

--
-- Table structure for table `bkup_room_details`
--

CREATE TABLE `bkup_room_details` (
  `room_no` varchar(3) NOT NULL,
  `room_type` varchar(10) NOT NULL,
  `room_rate` int(4) NOT NULL,
  `room_bed` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bkup_room_details`
--

INSERT INTO `bkup_room_details` (`room_no`, `room_type`, `room_rate`, `room_bed`) VALUES
('101', 'Non AC', 700, 'Single'),
('102', 'Non AC', 700, 'Single'),
('103', 'Non AC', 700, 'Single'),
('104', 'Non AC', 700, 'Single'),
('105', 'Non AC', 700, 'Single'),
('106', 'Non AC', 700, 'Single'),
('107', 'Non AC', 700, 'Single'),
('108', 'Non AC', 700, 'Single'),
('109', 'Non AC', 700, 'Single'),
('110', 'Non AC', 700, 'Single'),
('111', 'Non AC', 1000, 'Double'),
('112', 'Non AC', 1000, 'Double'),
('113', 'Non AC', 1000, 'Double'),
('114', 'Non AC', 1000, 'Double'),
('115', 'Non AC', 1000, 'Double'),
('116', 'AC', 1500, 'Single'),
('117', 'AC', 1500, 'Single'),
('118', 'AC', 1500, 'Single'),
('119', 'AC', 1500, 'Single'),
('120', 'AC', 1500, 'Single'),
('121', 'AC', 1500, 'Single'),
('122', 'AC', 1500, 'Single'),
('123', 'AC', 1500, 'Single'),
('124', 'AC', 2000, 'Double'),
('125', 'AC', 2000, 'Double'),
('126', 'AC', 2000, 'Double'),
('127', 'AC', 2000, 'Double'),
('128', 'AC', 2000, 'Double'),
('129', 'AC', 2000, 'Double'),
('130', 'AC', 2000, 'Double');

-- --------------------------------------------------------

--
-- Table structure for table `bookingtable`
--

CREATE TABLE `bookingtable` (
  `book_id` int(3) NOT NULL,
  `room_no` varchar(3) DEFAULT NULL,
  `date_fro` datetime DEFAULT NULL,
  `date_to` datetime DEFAULT NULL,
  `no_of_day` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `custdetail`
--

CREATE TABLE `custdetail` (
  `Cust_name` varchar(30) DEFAULT NULL,
  `Cust_add` varchar(40) DEFAULT NULL,
  `Cust_city` varchar(30) DEFAULT NULL,
  `Cust_state` varchar(30) DEFAULT NULL,
  `Cust_country` varchar(30) DEFAULT NULL,
  `Cust_ph` varchar(10) DEFAULT NULL,
  `Cust_proof` varchar(20) DEFAULT NULL,
  `Cust_adult` varchar(2) DEFAULT NULL,
  `Cust_child` varchar(2) DEFAULT NULL,
  `Cust_mar_stat` varchar(15) DEFAULT NULL,
  `Cust_id_no` varchar(30) DEFAULT NULL,
  `Cust_nation` varchar(30) DEFAULT NULL,
  `Cust_purpos` varchar(30) DEFAULT NULL,
  `Cust_bill` int(5) DEFAULT NULL,
  `book_id` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `custdetail`
--

INSERT INTO `custdetail` (`Cust_name`, `Cust_add`, `Cust_city`, `Cust_state`, `Cust_country`, `Cust_ph`, `Cust_proof`, `Cust_adult`, `Cust_child`, `Cust_mar_stat`, `Cust_id_no`, `Cust_nation`, `Cust_purpos`, `Cust_bill`, `book_id`) VALUES
('Vijay', 'AFS 2', 'Jamnagar', 'Gujarat', 'Indian', '0288253422', 'Passport', '1', '0', 'Single', 'LDKF-999238-LL09-6', 'Indian', 'Tour', 1568, 11),
('Vidit', 'ABC', 'Jamnagar', 'Gujarat', 'India', '9898263882', 'Voter ID', '1', '0', 'Single', '3947QWE', 'Indian', 'Offical', 2352, 12),
('abhay', 'belgavi', 'belagavi', 'karnataka', 'india', '3124302', 'adhar card', '1', '0', 'single', '4525259252', 'indian', 'tour', 3136, 13),
('suraj', 'belgavi', 'belgavi', 'karnataka', 'india', '55525', '', '', '', 'jhushf', '', 'hfehei', '', 1568, 14),
('abhi', 'sakhali', 'goa', 'goa', 'india', '23145452', 'adhar', '1', '0', 'dass', '3142524141', 'indian', 'tour', 784, 15),
('abhay naik', 'ffjkfkjwe', 'mnddkn', 'mekndd', 'kndk', '211321324', '', '', '', 'kfsk', '', 'fmskf', '', 784, 1),
('vinay', 'belgavi', 'belagavi', 'karnataka', 'india', '443344433', 'adhar card', '1', '0', 'single', '32u9932043299', 'indian', 'tour', 784, 1),
('a', 'kdjhdfjad', 'hfhhwieil', 'dqkjdk', 'dkqj', '1234445553', 'kvsk', '1', '1', 'single', 'rt090292092', 'indian', 'qjsjj', 1120, 1),
('navin', 'cnjanc', 'kdkas', 'csakk', 'mcksak', '314117814', '', '', '', 'sja', '', 'dna', '', 1568, 1);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `userid` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `designation` varchar(15) NOT NULL,
  `first name` varchar(30) NOT NULL,
  `last name` varchar(30) NOT NULL,
  `contact no.` varchar(15) NOT NULL,
  `address` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userid`, `password`, `designation`, `first name`, `last name`, `contact no.`, `address`) VALUES
('abhay', 'a123', '', '', '', '', ''),
('akhil', 'ak123', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `roomdetail`
--

CREATE TABLE `roomdetail` (
  `room_no` varchar(3) NOT NULL,
  `room_type` varchar(10) NOT NULL,
  `room_rate` int(4) NOT NULL,
  `room_bed` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roomdetail`
--

INSERT INTO `roomdetail` (`room_no`, `room_type`, `room_rate`, `room_bed`) VALUES
('101', 'Non AC', 700, 'Single'),
('102', 'Non AC', 700, 'Single'),
('103', 'Non AC', 700, 'Single'),
('104', 'Non AC', 700, 'Single'),
('105', 'Non AC', 700, 'Single'),
('106', 'Non AC', 700, 'Single'),
('107', 'Non AC', 700, 'Single'),
('108', 'Non AC', 700, 'Single'),
('109', 'Non AC', 700, 'Single'),
('110', 'Non AC', 700, 'Single'),
('111', 'Non AC', 1000, 'Double'),
('112', 'Non AC', 1000, 'Double'),
('113', 'Non AC', 1000, 'Double'),
('114', 'Non AC', 1000, 'Double'),
('115', 'Non AC', 1000, 'Double'),
('116', 'AC', 1500, 'Single'),
('117', 'AC', 1500, 'Single'),
('118', 'AC', 1500, 'Single'),
('119', 'AC', 1500, 'Single'),
('120', 'AC', 1500, 'Single'),
('121', 'AC', 1500, 'Single'),
('122', 'AC', 1500, 'Single'),
('123', 'AC', 1500, 'Single'),
('124', 'AC', 2000, 'Double'),
('125', 'AC', 2000, 'Double'),
('126', 'AC', 2000, 'Double'),
('127', 'AC', 2000, 'Double'),
('128', 'AC', 2000, 'Double'),
('129', 'AC', 2000, 'Double'),
('130', 'AC', 2000, 'Double');

--
-- Triggers `roomdetail`
--
DELIMITER $$
CREATE TRIGGER `room_trigger` AFTER INSERT ON `roomdetail` FOR EACH ROW BEGIN
INSERT INTO bkup_room_details VALUES
(New.room_no,New.room_type,New.room_rate,New.room_bed);
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bktab_bkup`
--
ALTER TABLE `bktab_bkup`
  ADD PRIMARY KEY (`book_id`);

--
-- Indexes for table `bkup_room_details`
--
ALTER TABLE `bkup_room_details`
  ADD PRIMARY KEY (`room_no`);

--
-- Indexes for table `bookingtable`
--
ALTER TABLE `bookingtable`
  ADD PRIMARY KEY (`book_id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `roomdetail`
--
ALTER TABLE `roomdetail`
  ADD PRIMARY KEY (`room_no`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
