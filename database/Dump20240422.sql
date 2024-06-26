CREATE DATABASE react_app;

USE react_app;


DROP TABLE IF EXISTS `categoria`;

CREATE TABLE `categoria` (
  `ID_CA` int NOT NULL AUTO_INCREMENT,
  `Nome_Categoria` enum('FrontEnd','BackEnd','FullStack','Cybersecurity') DEFAULT NULL,
  PRIMARY KEY (`ID_CA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'FrontEnd'),(2,'BackEnd');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `corso`
--

DROP TABLE IF EXISTS `corso`;

CREATE TABLE `corso` (
  `ID_C` int NOT NULL AUTO_INCREMENT,
  `Nome_Corso` varchar(255) DEFAULT NULL,
  `Descrizione_breve` varchar(255) DEFAULT NULL,
  `Descrizione_completa` text,
  `Durata` int DEFAULT NULL,
  `FK_CA` int DEFAULT NULL,
  PRIMARY KEY (`ID_C`),
  KEY `corso_ibfk_1_idx` (`FK_CA`),
  CONSTRAINT `corso_ibfk_1` FOREIGN KEY (`FK_CA`) REFERENCES `categoria` (`ID_CA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `corso`
--

LOCK TABLES `corso` WRITE;
/*!40000 ALTER TABLE `corso` DISABLE KEYS */;
/*!40000 ALTER TABLE `corso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruolo`
--

DROP TABLE IF EXISTS `ruolo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ruolo` (
  `ID_G` int NOT NULL AUTO_INCREMENT,
  `TIPOLOGIA` enum('Admin','Utente','Docente') DEFAULT NULL,
  PRIMARY KEY (`ID_G`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `ruolo`
--

LOCK TABLES `ruolo` WRITE;
/*!40000 ALTER TABLE `ruolo` DISABLE KEYS */;
INSERT INTO `ruolo` VALUES (1,'Admin'),(2,'Docente');
/*!40000 ALTER TABLE `ruolo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utente`
--

DROP TABLE IF EXISTS `utente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utente` (
  `ID_U` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) DEFAULT NULL,
  `Cognome` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_U`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utente`
--

LOCK TABLES `utente` WRITE;
/*!40000 ALTER TABLE `utente` DISABLE KEYS */;
INSERT INTO `utente` VALUES (7,'Simone','De Meis','Simone@icloud.com','b83cb68a006bf684628aaae5775e3794fe4d9ee57bb3d5c9173772b5cd4a4a94'),(8,'Lorenzo','Taverna','lorenzotaverna@icloud.com','b83cb68a006bf684628aaae5775e3794fe4d9ee57bb3d5c9173772b5cd4a4a94');
/*!40000 ALTER TABLE `utente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utente_ruolo`
--

DROP TABLE IF EXISTS `utente_ruolo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utente_ruolo` (
  `FK_R` int NOT NULL,
  `FK_U` int NOT NULL,
  PRIMARY KEY (`FK_R`,`FK_U`),
  KEY `FK_U` (`FK_U`),
  CONSTRAINT `utente_ruolo_ibfk_1` FOREIGN KEY (`FK_R`) REFERENCES `ruolo` (`ID_G`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `utente_ruolo_ibfk_2` FOREIGN KEY (`FK_U`) REFERENCES `utente` (`ID_U`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utente_ruolo`
--

LOCK TABLES `utente_ruolo` WRITE;
/*!40000 ALTER TABLE `utente_ruolo` DISABLE KEYS */;
INSERT INTO `utente_ruolo` VALUES (1,7),(1,8);
/*!40000 ALTER TABLE `utente_ruolo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utenti_corsi`
--

DROP TABLE IF EXISTS `utenti_corsi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utenti_corsi` (
  `FK_UC` int NOT NULL,
  `FK_CU` int NOT NULL,
  PRIMARY KEY (`FK_UC`,`FK_CU`),
  KEY `utenti_corsi_ibfk_2_idx` (`FK_CU`),
  CONSTRAINT `utenti_corsi_ibfk_1` FOREIGN KEY (`FK_UC`) REFERENCES `utente` (`ID_U`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `utenti_corsi_ibfk_2` FOREIGN KEY (`FK_CU`) REFERENCES `corso` (`ID_C`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utenti_corsi`
--

LOCK TABLES `utenti_corsi` WRITE;
/*!40000 ALTER TABLE `utenti_corsi` DISABLE KEYS */;
/*!40000 ALTER TABLE `utenti_corsi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-22 11:50:54
