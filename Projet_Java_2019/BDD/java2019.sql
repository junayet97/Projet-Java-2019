-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 04 juin 2019 à 20:18
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `java2019`
--

-- --------------------------------------------------------

--
-- Structure de la table `anneescolaire`
--

DROP TABLE IF EXISTS `anneescolaire`;
CREATE TABLE IF NOT EXISTS `anneescolaire` (
  `id_anneescolaire` int(20) NOT NULL,
  PRIMARY KEY (`id_anneescolaire`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `anneescolaire`
--

INSERT INTO `anneescolaire` (`id_anneescolaire`) VALUES
(2018),
(2019);

-- --------------------------------------------------------

--
-- Structure de la table `bulletin`
--

DROP TABLE IF EXISTS `bulletin`;
CREATE TABLE IF NOT EXISTS `bulletin` (
  `id_bulletin` int(11) NOT NULL AUTO_INCREMENT,
  `id_trimestre` int(11) NOT NULL,
  `id_inscription` int(11) NOT NULL,
  `appreciation` varchar(255) NOT NULL,
  `moyenne_trimestre` double NOT NULL,
  PRIMARY KEY (`id_bulletin`),
  KEY `id_inscription` (`id_inscription`),
  KEY `id_trimestre` (`id_trimestre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

DROP TABLE IF EXISTS `classe`;
CREATE TABLE IF NOT EXISTS `classe` (
  `id_classe` int(255) NOT NULL,
  `nom_classe` varchar(255) NOT NULL,
  `id_anneescolaire` int(11) NOT NULL,
  `id_niveau` int(255) NOT NULL,
  PRIMARY KEY (`id_classe`),
  KEY `id_anneescolaire` (`id_anneescolaire`),
  KEY `id_niveau` (`id_niveau`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `detailbulletin`
--

DROP TABLE IF EXISTS `detailbulletin`;
CREATE TABLE IF NOT EXISTS `detailbulletin` (
  `id_detail` int(11) NOT NULL AUTO_INCREMENT,
  `id_bulltetin` int(11) NOT NULL,
  `id_enseignement` int(11) NOT NULL,
  `appreciation_det` int(255) NOT NULL,
  `moyenne` double NOT NULL,
  PRIMARY KEY (`id_detail`),
  KEY `id_bulltetin` (`id_bulltetin`),
  KEY `id_enseignement` (`id_enseignement`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `discipline`
--

DROP TABLE IF EXISTS `discipline`;
CREATE TABLE IF NOT EXISTS `discipline` (
  `id_discipline` int(11) NOT NULL AUTO_INCREMENT,
  `nom_discipline` int(11) NOT NULL,
  PRIMARY KEY (`id_discipline`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `enseignement`
--

DROP TABLE IF EXISTS `enseignement`;
CREATE TABLE IF NOT EXISTS `enseignement` (
  `id_ens` int(255) NOT NULL,
  `id_classe` int(11) NOT NULL,
  `id_discipline` int(11) NOT NULL,
  `id_personne` int(11) NOT NULL,
  PRIMARY KEY (`id_ens`),
  KEY `id_classe` (`id_classe`),
  KEY `id_discipline` (`id_discipline`),
  KEY `id_personne` (`id_personne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

DROP TABLE IF EXISTS `evaluation`;
CREATE TABLE IF NOT EXISTS `evaluation` (
  `id_evaluation` int(11) NOT NULL AUTO_INCREMENT,
  `id_detail` int(11) NOT NULL,
  `note` double NOT NULL,
  `appreciation_eval` varchar(255) NOT NULL,
  PRIMARY KEY (`id_evaluation`),
  KEY `id_detail` (`id_detail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

DROP TABLE IF EXISTS `inscription`;
CREATE TABLE IF NOT EXISTS `inscription` (
  `id_inscription` int(11) NOT NULL AUTO_INCREMENT,
  `id_classe` int(11) NOT NULL,
  `id_personne` int(11) NOT NULL,
  PRIMARY KEY (`id_inscription`),
  KEY `id_classe` (`id_classe`),
  KEY `id_personne` (`id_personne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

DROP TABLE IF EXISTS `niveau`;
CREATE TABLE IF NOT EXISTS `niveau` (
  `id_niveau` int(255) NOT NULL,
  `nom_niveau` varchar(255) NOT NULL,
  PRIMARY KEY (`id_niveau`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `niveau`
--

INSERT INTO `niveau` (`id_niveau`, `nom_niveau`) VALUES
(1, 'CP');

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `id_personne` int(255) NOT NULL AUTO_INCREMENT,
  `nom_pers` varchar(255) NOT NULL,
  `prenom_pers` varchar(255) NOT NULL,
  `type_pers` varchar(255) NOT NULL,
  PRIMARY KEY (`id_personne`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`id_personne`, `nom_pers`, `prenom_pers`, `type_pers`) VALUES
(1, 'bhuiyan', 'junayet', 'e'),
(2, 'kiki', 'lolo', 'p');

-- --------------------------------------------------------

--
-- Structure de la table `trimestre`
--

DROP TABLE IF EXISTS `trimestre`;
CREATE TABLE IF NOT EXISTS `trimestre` (
  `id_trimestre` int(11) NOT NULL,
  `numero` int(255) NOT NULL,
  `debut` varchar(250) NOT NULL,
  `fin` varchar(250) NOT NULL,
  `id_anneescolaire` int(11) NOT NULL,
  PRIMARY KEY (`id_trimestre`),
  KEY `id_anneescolaire` (`id_anneescolaire`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `bulletin`
--
ALTER TABLE `bulletin`
  ADD CONSTRAINT `bulletin_ibfk_1` FOREIGN KEY (`id_inscription`) REFERENCES `inscription` (`id_inscription`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bulletin_ibfk_2` FOREIGN KEY (`id_trimestre`) REFERENCES `trimestre` (`id_trimestre`);

--
-- Contraintes pour la table `classe`
--
ALTER TABLE `classe`
  ADD CONSTRAINT `classe_ibfk_3` FOREIGN KEY (`id_anneescolaire`) REFERENCES `anneescolaire` (`id_anneescolaire`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `classe_ibfk_4` FOREIGN KEY (`id_niveau`) REFERENCES `niveau` (`id_niveau`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `detailbulletin`
--
ALTER TABLE `detailbulletin`
  ADD CONSTRAINT `detailbulletin_ibfk_1` FOREIGN KEY (`id_bulltetin`) REFERENCES `bulletin` (`id_bulletin`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detailbulletin_ibfk_2` FOREIGN KEY (`id_enseignement`) REFERENCES `enseignement` (`id_ens`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `enseignement`
--
ALTER TABLE `enseignement`
  ADD CONSTRAINT `enseignement_ibfk_3` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id_classe`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `enseignement_ibfk_4` FOREIGN KEY (`id_discipline`) REFERENCES `discipline` (`id_discipline`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `enseignement_ibfk_5` FOREIGN KEY (`id_personne`) REFERENCES `personne` (`id_personne`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `evaluation`
--
ALTER TABLE `evaluation`
  ADD CONSTRAINT `evaluation_ibfk_1` FOREIGN KEY (`id_detail`) REFERENCES `detailbulletin` (`id_detail`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `inscription`
--
ALTER TABLE `inscription`
  ADD CONSTRAINT `inscription_ibfk_1` FOREIGN KEY (`id_classe`) REFERENCES `classe` (`id_classe`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `inscription_ibfk_2` FOREIGN KEY (`id_personne`) REFERENCES `personne` (`id_personne`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `trimestre`
--
ALTER TABLE `trimestre`
  ADD CONSTRAINT `trimestre_ibfk_1` FOREIGN KEY (`id_anneescolaire`) REFERENCES `anneescolaire` (`id_anneescolaire`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
