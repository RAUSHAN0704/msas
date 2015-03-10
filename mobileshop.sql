-- MySQL dump 10.13  Distrib 5.5.29, for Win64 (x86)
--
-- Host: localhost    Database: mobileshop
-- ------------------------------------------------------
-- Server version	5.5.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
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
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `brand` varchar(30) DEFAULT NULL,
  `model` varchar(30) DEFAULT NULL,
  `quantity` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES ('Samsung','galaxy curve',5),('Samsung','galaxy curve',5),('Samsung','galaxy s3',5),('samsung','galaxy s3',4),('Samsung','Corby Mate',5),('Samsung','galaxy curve',6);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sales` (
  `brand` varchar(30) DEFAULT NULL,
  `model` varchar(30) DEFAULT NULL,
  `imei` varchar(30) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `quantity` int(3) DEFAULT NULL,
  `date` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES ('Samsung','galaxy s4','IE68597452IN',25000,1,'26/10/13'),('Samsung','galaxy curve','IM85479865IN',36000,1,'03-08-2014'),('Samsung','galaxy s4','IM8754123698IN',25000,2,'03-08-2014'),('Samsung','galaxy s3','IM87542136IN',18000,1,'03-08-2014'),('Samsung','galaxy s2','IM22343435454IN',15000,1,''),('Samsung','galaxy s3','fklfjljfkldfjads',18000,1,'08-07-2014'),('Samsung','galaxy s4','IM87455684IN',25000,1,'Fri Aug 08 15:41:11 IST 2014'),('Samsung','galaxy curve','IE09879678IN',36000,1,'Fri Aug 22 11:08:44 IST 2014');
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock` (
  `brand` varchar(30) NOT NULL,
  `model` varchar(30) NOT NULL,
  `price` int(10) DEFAULT NULL,
  `os` varchar(30) DEFAULT NULL,
  `keyboard` varchar(30) DEFAULT NULL,
  `quantity` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES ('samsung','galaxy s4',25000,'android','touch',5),('samsung','galaxy s3',18000,'android','touch',5),('samsung','galaxy curve',36000,'android','touch',0),('samsung','galaxy s2',15000,'android','touch',2),('samsung','Galaxy Note1',32000,'Android','Touch',5),('samsung','Galaxy Note2',36000,'Android','Touch',3),('Nokia','Lumia 520',9000,'Windows','touch',10),('Nokia','Lumia 620',12000,'Windows','touch',8),('Nokia','Lumia 820',23000,'Windows','touch',3);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-08-30 11:54:00
