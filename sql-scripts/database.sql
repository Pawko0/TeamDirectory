CREATE DATABASE  IF NOT EXISTS `team_directory`;
USE `team_directory`;

DROP TABLE IF EXISTS `team`;

CREATE TABLE `team` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `yellow_cards` INT DEFAULT 0,
  `red_cards` INT DEFAULT 0,
  `goals` INT DEFAULT 0,
  `assists` INT DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


INSERT INTO `team` VALUES
	(1,'Leslie','Andrews','Goalkeeper', 0, 0, 0, 0),
	(2,'Emma','Baumgarten','Striker', 3, 0, 12, 3)