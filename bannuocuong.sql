-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th7 28, 2020 lúc 01:25 PM
-- Phiên bản máy phục vụ: 10.1.38-MariaDB
-- Phiên bản PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `bannuocuong`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `admin`
--

CREATE TABLE `admin` (
  `aMail` varchar(100) NOT NULL,
  `aPassword` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `admin`
--

INSERT INTO `admin` (`aMail`, `aPassword`) VALUES
('phuc@gmail.com', 'e10adc3949ba59abbe56e057f20f883e'),
('qui@gmail.com', 'e10adc3949ba59abbe56e057f20f883e'),
('tranhoangphuc28102000@gmail.com', 'e10adc3949ba59abbe56e057f20f883e'),
('tri@gmail.com', 'e10adc3949ba59abbe56e057f20f883e');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `blockitems`
--

CREATE TABLE `blockitems` (
  `blockId` int(11) NOT NULL,
  `blockItemQuantity` int(11) NOT NULL,
  `blockItemPrice` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `blockitems`
--

INSERT INTO `blockitems` (`blockId`, `blockItemQuantity`, `blockItemPrice`) VALUES
(1, 120, 600000),
(2, 100, 530000),
(3, 70, 720000),
(4, 50, 500000),
(5, 35, 270000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `brand`
--

CREATE TABLE `brand` (
  `bId` int(11) NOT NULL,
  `brandName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `brand`
--

INSERT INTO `brand` (`bId`, `brandName`) VALUES
(1, 'Coca Cola'),
(2, 'Pepsi'),
(3, 'Sting'),
(4, '7Up');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `discount`
--

CREATE TABLE `discount` (
  `iId` int(11) NOT NULL,
  `aId` int(11) NOT NULL,
  `date` date NOT NULL,
  `numDiscount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `discount`
--

INSERT INTO `discount` (`iId`, `aId`, `date`, `numDiscount`) VALUES
(1, 1, '2020-04-03', 10),
(2, 1, '2020-06-05', 15),
(4, 1, '2020-05-10', 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `item`
--

CREATE TABLE `item` (
  `iId` int(11) NOT NULL COMMENT 'Item Id',
  `tId` int(11) NOT NULL COMMENT 'User Id',
  `bId` int(11) NOT NULL COMMENT 'Brand Id',
  `iName` varchar(50) NOT NULL COMMENT 'Item Name',
  `blockId` int(11) NOT NULL COMMENT 'Block Id',
  `size` varchar(2) NOT NULL COMMENT 'Item Size',
  `pId` int(11) NOT NULL COMMENT 'Input Price Of Item',
  `outputPrice` int(11) NOT NULL COMMENT 'Output Price Of Item',
  `orginCode` varchar(50) NOT NULL COMMENT 'Orgin Code',
  `status` tinyint(1) NOT NULL COMMENT 'Status Of Item',
  `quantity` int(11) NOT NULL COMMENT 'Quantity Of Item',
  `rId` int(11) NOT NULL COMMENT 'Rating Id',
  `discoutnStatus` tinyint(1) NOT NULL COMMENT 'Discount Status',
  `vouId` int(11) NOT NULL COMMENT 'Voucher Id',
  `taste` varchar(50) NOT NULL COMMENT 'Item Taste',
  `expiryDate` date NOT NULL COMMENT 'Expiry Date',
  `iPic` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Bảng lưu trữ thông tin của sản phẩm';

--
-- Đang đổ dữ liệu cho bảng `item`
--

INSERT INTO `item` (`iId`, `tId`, `bId`, `iName`, `blockId`, `size`, `pId`, `outputPrice`, `orginCode`, `status`, `quantity`, `rId`, `discoutnStatus`, `vouId`, `taste`, `expiryDate`, `iPic`) VALUES
(1, 1, 1, 'Sting dau', 1, 'M', 7000, 7000, '1', 1, 100, 1, 0, 1, 'Tang luc', '2021-12-23', 'stingdau.jpg'),
(3, 1, 1, 'Sting vang', 1, 'M', 7000, 7000, '1', 1, 100, 1, 0, 1, 'tang luc', '2021-12-23', 'stingvang.jpg'),
(5, 1, 1, 'Trà Xanh', 1, 'M', 7000, 7000, '1', 1, 100, 1, 0, 1, 'Tra xanh', '2021-12-23', 'traxanh.jpg'),
(6, 1, 1, 'C2', 1, 'M', 6000, 6000, '1', 1, 100, 1, 0, 1, 'Tra xanh', '2021-12-23', 'c2.jpg'),
(7, 1, 1, 'Dr.Thanh', 1, 'M', 9000, 9000, '1', 1, 100, 1, 0, 1, 'Tra', '2021-12-23', 'drthanh.jpg'),
(8, 1, 1, 'Number One', 1, 'M', 9000, 9000, '1', 1, 100, 1, 0, 1, 'Tang luc', '2021-12-23', 'number1.jpg'),
(9, 1, 1, 'Revive', 1, 'M', 9000, 9000, '1', 1, 100, 1, 0, 1, 'Tang luc', '2021-12-23', 'revive.jpg'),
(20, 1, 1, 'Sữa Tươi', 1, 'M', 10000, 10000, '1', 1, 100, 1, 0, 1, 'Sua', '2021-07-29', 'suatuoi.jpg'),
(21, 1, 1, 'Cà Phê', 1, 'M', 10000, 10000, '1', 1, 100, 1, 0, 1, 'ca phe', '2021-07-29', 'caphe.jpg'),
(23, 1, 1, 'Fanta', 1, 'M', 10000, 10000, '1', 1, 100, 1, 0, 1, 'cam', '2021-07-29', 'fanta.jpg'),
(24, 1, 1, 'Heineken', 1, 'M', 10000, 10000, '1', 1, 100, 1, 0, 1, 'gao', '2021-07-29', 'heineken.jpg'),
(26, 1, 1, 'Nước mía', 1, 'M', 10000, 10000, '1', 1, 100, 1, 0, 1, 'mia', '2021-07-29', 'nuocmia.jpg'),
(27, 1, 1, 'Redbull', 1, 'M', 10000, 10000, '1', 1, 100, 1, 0, 1, 'Tang luc', '2021-07-29', 'redbull.jpg'),
(28, 1, 1, 'Trà sữa', 1, 'M', 10000, 10000, '1', 1, 100, 1, 0, 1, 'tra sua', '2021-07-29', 'Trasua.jpg'),
(29, 1, 1, 'Bạc xỉu', 1, 'M', 10000, 10000, '1', 1, 100, 1, 0, 1, 'caphe sua', '2021-07-29', 'bacxiu.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `itemcomment`
--

CREATE TABLE `itemcomment` (
  `cId` int(11) NOT NULL,
  `iId` int(11) NOT NULL,
  `uMail` varchar(100) NOT NULL,
  `content` varchar(50) NOT NULL,
  `uName` varchar(50) NOT NULL,
  `cDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `itemcomment`
--

INSERT INTO `itemcomment` (`cId`, `iId`, `uMail`, `content`, `uName`, `cDate`) VALUES
(1, 1, 'user1@gmail.com', 'good', 'nva', '2020-01-23'),
(2, 1, 'user2@gmail.com', 'good', 'nva', '2020-01-23'),
(3, 1, 'user1@gmail.com', 'good', 'nva', '2020-01-23'),
(4, 1, 'user3@gmail.com', 'good', 'nva', '2020-01-23'),
(5, 1, 'user2@gmail.com', 'good', 'nva', '2020-01-23'),
(6, 1, 'user1@gmail.com', 'good', 'nva', '2020-01-23');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `itemtype`
--

CREATE TABLE `itemtype` (
  `tId` int(11) NOT NULL,
  `typeName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `itemtype`
--

INSERT INTO `itemtype` (`tId`, `typeName`) VALUES
(1, 'chai'),
(2, 'lon'),
(3, 'chai sanh');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orderdetail`
--

CREATE TABLE `orderdetail` (
  `iDetailIndex` int(11) NOT NULL,
  `oId` int(11) NOT NULL,
  `payId` int(11) NOT NULL,
  `uMail` varchar(100) NOT NULL,
  `iId` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `orderDate` date NOT NULL,
  `note` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Bảng lưu trữ thông tin của order';

--
-- Đang đổ dữ liệu cho bảng `orderdetail`
--

INSERT INTO `orderdetail` (`iDetailIndex`, `oId`, `payId`, `uMail`, `iId`, `quantity`, `price`, `orderDate`, `note`) VALUES
(7, 9, 1, 'phucthce140628@fpt.edu.vn', 1, 4, 7000, '2020-07-28', ''),
(8, 10, 1, 'phucthce140628@fpt.edu.vn', 5, 1, 7000, '2020-07-28', ''),
(9, 11, 1, 'a@gmail.com', 3, 5, 7000, '2020-07-28', ''),
(10, 12, 1, 'b@gmail.com', 5, 6, 7000, '2020-07-28', ''),
(11, 13, 1, 'b@gmail.com', 7, 5, 9000, '2020-07-28', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orders`
--

CREATE TABLE `orders` (
  `oId` int(11) NOT NULL,
  `uMail` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `orders`
--

INSERT INTO `orders` (`oId`, `uMail`) VALUES
(9, 'phucthce140628@fpt.edu.vn'),
(10, 'phucthce140628@fpt.edu.vn'),
(11, 'a@gmail.com'),
(12, 'b@gmail.com'),
(13, 'b@gmail.com');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `payment`
--

CREATE TABLE `payment` (
  `payId` int(11) NOT NULL,
  `payName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `payment`
--

INSERT INTO `payment` (`payId`, `payName`) VALUES
(1, 'Thanh toan khi nhan hang'),
(2, 'Thanh toan bang the ngan hang');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `price`
--

CREATE TABLE `price` (
  `priceId` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `date` date NOT NULL,
  `aMail` varchar(100) NOT NULL,
  `upDown` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `price`
--

INSERT INTO `price` (`priceId`, `price`, `date`, `aMail`, `upDown`) VALUES
(1, 7000, '2020-09-12', 'phuc@gmail.com\r\n', 1),
(2, 6000, '2020-09-12', 'qui@gmail.com\r\n', 0),
(3, 4000, '2020-09-12', 'tri@gmail.com\r\n', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `rating`
--

CREATE TABLE `rating` (
  `rId` int(11) NOT NULL,
  `uMail` varchar(100) NOT NULL,
  `rNumberStar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `rating`
--

INSERT INTO `rating` (`rId`, `uMail`, `rNumberStar`) VALUES
(1, 'user1@gmail.com', 4),
(2, 'user3@gmail.com', 4),
(3, 'user3@gmail.com', 5),
(4, 'user2@gmail.com', 3),
(5, 'user2@gmail.com', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `uMail` varchar(100) NOT NULL,
  `uPassword` varchar(32) NOT NULL,
  `uName` varchar(50) NOT NULL,
  `uPhone` varchar(20) NOT NULL,
  `uAddress` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`uMail`, `uPassword`, `uName`, `uPhone`, `uAddress`) VALUES
('c@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'Tran', '1111111111', 'VL'),
('nva@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'Hoang Phuc', '0987654321', 'VL'),
('phucthce140628@fpt.edu.vn', 'e10adc3949ba59abbe56e057f20f883e', 'Hoang Qui', '0987654321', 'Tra Vinh'),
('user1@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'Nguyen Van A', '0123456789', 'Can Tho'),
('user2@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'Nguyen Van B', '0123456789', 'Can Tho'),
('user3@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'Nguyen Thi C', '0123456789', 'Hau Giang');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `vendor`
--

CREATE TABLE `vendor` (
  `vId` int(11) NOT NULL,
  `iId` int(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `vName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `vendor`
--

INSERT INTO `vendor` (`vId`, `iId`, `address`, `email`, `phone`, `vName`) VALUES
(1, 1, 'Hau Giang', 'hg@gmail.com', '012345679', 'Thanh Cong'),
(2, 2, 'Can Tho', 'ct@gmail.com', '012345679', 'ahihi'),
(3, 3, 'Soc Trang', 'st@gmail.com', '012345679', 'Ahoho'),
(4, 4, 'Ca Mau', 'cm@gmail.com', '012345679', 'Tuan tu');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `voucher`
--

CREATE TABLE `voucher` (
  `vuoId` int(11) NOT NULL,
  `vouType` varchar(50) NOT NULL,
  `vouDiscount` int(11) NOT NULL,
  `vouDescription` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `voucher`
--

INSERT INTO `voucher` (`vuoId`, `vouType`, `vouDiscount`, `vouDescription`) VALUES
(1, 'Theo ngay', 20, ''),
(2, 'Theo san pham', 10, '');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`aMail`);

--
-- Chỉ mục cho bảng `blockitems`
--
ALTER TABLE `blockitems`
  ADD PRIMARY KEY (`blockId`);

--
-- Chỉ mục cho bảng `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`bId`);

--
-- Chỉ mục cho bảng `discount`
--
ALTER TABLE `discount`
  ADD PRIMARY KEY (`iId`);

--
-- Chỉ mục cho bảng `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`iId`);

--
-- Chỉ mục cho bảng `itemcomment`
--
ALTER TABLE `itemcomment`
  ADD PRIMARY KEY (`cId`);

--
-- Chỉ mục cho bảng `itemtype`
--
ALTER TABLE `itemtype`
  ADD PRIMARY KEY (`tId`);

--
-- Chỉ mục cho bảng `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD PRIMARY KEY (`iDetailIndex`);

--
-- Chỉ mục cho bảng `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`oId`);

--
-- Chỉ mục cho bảng `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`payId`);

--
-- Chỉ mục cho bảng `price`
--
ALTER TABLE `price`
  ADD PRIMARY KEY (`priceId`);

--
-- Chỉ mục cho bảng `rating`
--
ALTER TABLE `rating`
  ADD PRIMARY KEY (`rId`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD UNIQUE KEY `uni_mail` (`uMail`);

--
-- Chỉ mục cho bảng `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`vId`);

--
-- Chỉ mục cho bảng `voucher`
--
ALTER TABLE `voucher`
  ADD PRIMARY KEY (`vuoId`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `blockitems`
--
ALTER TABLE `blockitems`
  MODIFY `blockId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `brand`
--
ALTER TABLE `brand`
  MODIFY `bId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `item`
--
ALTER TABLE `item`
  MODIFY `iId` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Item Id', AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT cho bảng `itemcomment`
--
ALTER TABLE `itemcomment`
  MODIFY `cId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `itemtype`
--
ALTER TABLE `itemtype`
  MODIFY `tId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `orderdetail`
--
ALTER TABLE `orderdetail`
  MODIFY `iDetailIndex` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `orders`
--
ALTER TABLE `orders`
  MODIFY `oId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT cho bảng `payment`
--
ALTER TABLE `payment`
  MODIFY `payId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `price`
--
ALTER TABLE `price`
  MODIFY `priceId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `rating`
--
ALTER TABLE `rating`
  MODIFY `rId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `vendor`
--
ALTER TABLE `vendor`
  MODIFY `vId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `voucher`
--
ALTER TABLE `voucher`
  MODIFY `vuoId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
