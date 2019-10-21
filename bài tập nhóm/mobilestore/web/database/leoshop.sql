-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 02, 2018 at 09:31 AM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `leoshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `addcart`
--

CREATE TABLE `addcart` (
  `idLogin` int(5) NOT NULL,
  `nameLogin` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `id` varchar(6) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `code` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `name` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `image` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `price` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `addcart`
--

INSERT INTO `addcart` (`idLogin`, `nameLogin`, `id`, `code`, `name`, `image`, `price`) VALUES
(1, 'admin', 'phone3', 'oppo1', 'oppo', 'images/oppof9.jpg', '$8.000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(5) NOT NULL,
  `name` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `password` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `passwordmahoa` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `avartar` varchar(200) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `name`, `email`, `password`, `passwordmahoa`, `avartar`) VALUES
(1, 'admin', 'maituananh@gmail.com', 'admin', 'abc', 'abc');

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `id` int(20) NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `image` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `productdetails`
--

CREATE TABLE `productdetails` (
  `id` varchar(6) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `code` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Name` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `image` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `price` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `description` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `descriptions` text COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `productdetails`
--

INSERT INTO `productdetails` (`id`, `code`, `Name`, `image`, `price`, `description`, `descriptions`) VALUES
('phone1', 'samsung2', 'SAMSUNG S9', 'images/samsungs9.jpg', '$15.56123', 'new', ''),
('phone3', 'oppo1', 'OPPO F9', 'images/oppof9.jpg', '$8.000', 'new', ''),
('phone3', 'oppo2', 'OPPO R5', 'images/oppor5.jpg', '$15.78', 'new', ''),
('phone3', 'oppo3', 'OPPO F7', 'images/oppof7.jpg', '$15.78', 'new', ''),
('phone4', 'apple2', 'IPHONE 7', 'images/iphone7.jpg', '$15.56123', 'old', ''),
('phone4', 'iphone8', 'IPHONE 8', 'images/iphone8.jpg', '$1812.34', 'new', ''),
('phone5', 'sony1', 'SONY1', 'images/sony1.jpg', '$189.987', 'new', ''),
('phone5', 'sony2', 'SONY2', 'images/sony2.jpg', '$15.78', 'new', ''),
('phone2', 'htc1', 'HTC1', 'images/htc1.jpg', '$15.56123', 'new', ''),
('phone2', 'htc2', 'HTC2', 'uploads/htc2.jpg', '12,68', 'new', ''),
('phone2', 'htc4', 'HTC4', 'images/htc4.jpg', '12,68', 'new', '');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` varchar(6) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `name` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`) VALUES
('phone1', 'samsung'),
('phone2', 'htc'),
('phone3', 'oppo'),
('phone4', 'apple'),
('phone5', 'sony');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `news`
--
ALTER TABLE `news`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
