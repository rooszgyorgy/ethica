-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2021. Feb 17. 09:44
-- Kiszolgáló verziója: 10.4.13-MariaDB
-- PHP verzió: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `ethica`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `student`
--

CREATE TABLE `student` (
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `age` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `student`
--

INSERT INTO `student` (`firstname`, `lastname`, `age`) VALUES
('Horváth', 'Géza', 17),
('Kiss', 'László', 15.5),
('Kovács', 'Péter', 16),
('Teszt', 'Béla', 17),
('Új', 'Ember', 18);

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `student`
--
ALTER TABLE `student`
  ADD UNIQUE KEY `studentindex` (`firstname`),
  ADD KEY `firstname` (`firstname`,`lastname`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
