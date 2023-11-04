-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: ooc
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ooclogin`
--

DROP TABLE IF EXISTS `ooclogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ooclogin` (
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ooclogin`
--

LOCK TABLES `ooclogin` WRITE;
/*!40000 ALTER TABLE `ooclogin` DISABLE KEYS */;
INSERT INTO `ooclogin` VALUES ('Reema S','pqr@gamil.com','reema@3'),('Divya','divya123@gmail.com','23456789'),('Karthik','kar03@gmail.com','karthik03'),('Ram','abc@gmail.com','abcd123'),('Harsh Gupta','harsh_09@gmail.com','harsh#0909'),('alfiya','alfiyazoya@gmail.com','123456789'),('harshita','qwe@gmail.com','qwer'),('sdf','sdef@asdfgh','sdf'),('abc@gmail.com',NULL,'abcd123'),('abc@gmail.com',NULL,'abcd123'),('Karishma','qwer@wer','124578'),('pqe@gmail.com',NULL,'12356'),('lakshya','ls@gmail.com','123456'),('ls@gmail.com',NULL,'123456'),('inchara','inchara21@yahoo.com','inch123'),('Harshita Seksaria','hseksaria1805@gmail.com','784512'),('Disha Udupa','disha123@gmail.com','124578'),('Harshita Seksaria','21cse075@bnmit.in','qwerty'),('madhu','madhu12@gmail.com','madhu12'),('Harshita Seksaria','abc@gmail.com','123123'),('harshita seksaria','xyz12@gmail.com','1236987');
/*!40000 ALTER TABLE `ooclogin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-16 16:11:17