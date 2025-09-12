-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: agricardconnect_demo
-- ------------------------------------------------------
-- Server version	8.0.42

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
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `sample_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `order_weight` float DEFAULT NULL,
  `total_amount` float DEFAULT NULL,
  `order_status` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,3,NULL,NULL,2,NULL,NULL),(2,1,3,'2025-09-03',2,NULL,NULL),(3,1,3,'2025-09-03',2,4000,NULL),(4,1,3,'2025-09-03',2,4000,NULL),(5,1,3,'2025-09-03',2,4000,NULL),(6,1,3,'2025-09-04',2,4000,NULL),(7,1,3,'2025-09-04',2,4000,'APPROVED'),(8,1,3,'2025-09-04',2,4000,'REJECTED'),(9,1,3,'2025-09-04',2,4000,'pending'),(10,2,5,'2025-09-04',5,10000,'APPROVED'),(11,2,3,'2025-09-04',1,2000,'pending'),(12,2,3,'2025-09-04',2,4000,'pending'),(13,4,3,'2025-09-04',2,4000,'pending'),(14,3,3,'2025-09-04',7,10500,'APPROVED');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payments`
--

DROP TABLE IF EXISTS `payments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payments` (
  `payment_id` int NOT NULL AUTO_INCREMENT,
  `vendor_id` int DEFAULT NULL,
  `order_id` int DEFAULT NULL,
  `payment_status` varchar(100) DEFAULT NULL,
  `payment_date` date DEFAULT NULL,
  `delivery_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`payment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payments`
--

LOCK TABLES `payments` WRITE;
/*!40000 ALTER TABLE `payments` DISABLE KEYS */;
INSERT INTO `payments` VALUES (1,NULL,2,'PAID','2025-09-04','DELIVERED'),(2,NULL,10,'PAID','2025-09-04','IN TRANSIT'),(3,NULL,14,'PAID','2025-09-04','DELIVERED');
/*!40000 ALTER TABLE `payments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sample_grade`
--

DROP TABLE IF EXISTS `sample_grade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sample_grade` (
  `grade_id` int NOT NULL AUTO_INCREMENT,
  `sample_moisture` varchar(100) DEFAULT NULL,
  `sample_color` varchar(100) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `grade` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`grade_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_grade`
--

LOCK TABLES `sample_grade` WRITE;
/*!40000 ALTER TABLE `sample_grade` DISABLE KEYS */;
INSERT INTO `sample_grade` VALUES (3,'<5','Light Yellow',2000,'Premium'),(4,'5-10','Dark Yellow',1500,'Gold'),(6,'>10','Mixed Yellow',1200,'Normal');
/*!40000 ALTER TABLE `sample_grade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `samples`
--

DROP TABLE IF EXISTS `samples`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `samples` (
  `sample_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `sample_weight` float DEFAULT NULL,
  `sample_moisture_level` float DEFAULT NULL,
  `sample_color` varchar(100) DEFAULT NULL,
  `sample_image` longblob,
  `price` float DEFAULT NULL,
  `sample_date` date DEFAULT NULL,
  `sample_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sample_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `samples`
--

LOCK TABLES `samples` WRITE;
/*!40000 ALTER TABLE `samples` DISABLE KEYS */;
INSERT INTO `samples` VALUES (2,4,10,4,'Light Yellow',_binary 'images/sample1.jpeg',2000,'2025-09-04','Approved'),(3,2,8,9,'Dark Yellow',_binary 'images/sample2.jpeg',1500,'2025-09-03','Approved'),(4,3,8,3,'Light Yellow',_binary 'images/sample1.jpeg',2000,'2025-09-01','Approved');
/*!40000 ALTER TABLE `samples` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) DEFAULT NULL,
  `user_password` varchar(400) DEFAULT NULL,
  `user_role` varchar(400) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','admin','','','admin@gmail.com',NULL),(2,'tobin','123','vendor','Tobin K Tomy','Kannur','tobin80@gmail.com','8156941968'),(3,'teenu','123','customer','Teenu K Tomy','Kollam','teenu@gmail.com','9877752438'),(4,'beena','123','vendor','Beena Tomy','kottayam','beena@gmail.com','9487256829'),(5,'manu','123','customer','Manu Joseph','Ernakulam','manu@gmail.com','7520157690');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-09-11 11:32:48
