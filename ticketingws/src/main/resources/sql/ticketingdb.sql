-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Temps de generació: 12-12-2022 a les 20:18:36
-- Versió del servidor: 10.1.32-MariaDB
-- Versió de PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de dades: `ticketingdb`
--

-- --------------------------------------------------------

--
-- Estructura de la taula `actions`
--

CREATE TABLE `actions` (
  `id` bigint(20) NOT NULL,
  `type` varchar(25) COLLATE utf8mb4_spanish_ci NOT NULL,
  `performer_username` varchar(25) COLLATE utf8mb4_spanish_ci NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ticket_id` bigint(20) NOT NULL,
  `priority` int(11) DEFAULT NULL,
  `technician_username` varchar(25) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `description` varchar(500) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `hours` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de la taula `companies`
--

CREATE TABLE `companies` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de la taula `rooms`
--

CREATE TABLE `rooms` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de la taula `tickets`
--

CREATE TABLE `tickets` (
  `id` bigint(20) NOT NULL,
  `category` varchar(25) COLLATE utf8mb4_spanish_ci NOT NULL,
  `description` varchar(500) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de la taula `users`
--

CREATE TABLE `users` (
  `username` varchar(25) COLLATE utf8mb4_spanish_ci NOT NULL,
  `role` varchar(25) COLLATE utf8mb4_spanish_ci NOT NULL,
  `full_name` varchar(100) COLLATE utf8mb4_spanish_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_spanish_ci NOT NULL,
  `extension` int(11) DEFAULT NULL,
  `room_id` bigint(20) DEFAULT NULL,
  `place` varchar(100) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `companies_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Índexs per a les taules bolcades
--

--
-- Índexs per a la taula `actions`
--
ALTER TABLE `actions`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `ticket_x_date` (`ticket_id`,`date`),
  ADD KEY `type` (`type`),
  ADD KEY `fk_performer_username` (`performer_username`),
  ADD KEY `fk_technician_username` (`technician_username`);

--
-- Índexs per a la taula `companies`
--
ALTER TABLE `companies`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `name` (`name`);

--
-- Índexs per a la taula `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `name` (`name`);

--
-- Índexs per a la taula `tickets`
--
ALTER TABLE `tickets`
  ADD PRIMARY KEY (`id`);

--
-- Índexs per a la taula `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`),
  ADD KEY `role` (`role`),
  ADD KEY `full_name` (`full_name`),
  ADD KEY `role_x_full_name` (`role`,`full_name`),
  ADD KEY `fk_room_id` (`room_id`),
  ADD KEY `fk_companies_id` (`companies_id`);

--
-- AUTO_INCREMENT per les taules bolcades
--

--
-- AUTO_INCREMENT per la taula `actions`
--
ALTER TABLE `actions`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la taula `companies`
--
ALTER TABLE `companies`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la taula `rooms`
--
ALTER TABLE `rooms`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la taula `tickets`
--
ALTER TABLE `tickets`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Restriccions per a les taules bolcades
--

--
-- Restriccions per a la taula `actions`
--
ALTER TABLE `actions`
  ADD CONSTRAINT `fk_performer_username` FOREIGN KEY (`performer_username`) REFERENCES `users` (`username`),
  ADD CONSTRAINT `fk_technician_username` FOREIGN KEY (`technician_username`) REFERENCES `users` (`username`),
  ADD CONSTRAINT `fk_ticket_id` FOREIGN KEY (`ticket_id`) REFERENCES `tickets` (`id`);

--
-- Restriccions per a la taula `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `fk_companies_id` FOREIGN KEY (`companies_id`) REFERENCES `companies` (`id`),
  ADD CONSTRAINT `fk_room_id` FOREIGN KEY (`room_id`) REFERENCES `rooms` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
