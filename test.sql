/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.1.73-community : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `books` */

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `title` varchar(100) NOT NULL COMMENT '书名',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `publishDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '出版日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `title` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `books` */

insert  into `books`(`id`,`title`,`price`,`publishDate`) values 
(1,'Java编程思想',98.50,'2005-01-02 00:00:00'),
(2,'HeadFirst设计模式',55.70,'2010-11-09 00:00:00'),
(3,'第一行Android代码',69.90,'2015-06-23 00:00:00'),
(4,'C++编程思想',88.50,'2004-01-09 00:00:00'),
(5,'HeadFirst Java',55.70,'2013-12-17 00:00:00'),
(6,'疯狂Android',19.50,'2014-07-31 00:00:00'),
(7,'Ces',23.20,NULL),
(9,'dd',23.20,NULL),
(10,'曾泽彬',23.20,NULL);

/*Table structure for table `datetable` */

DROP TABLE IF EXISTS `datetable`;

CREATE TABLE `datetable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time1` datetime DEFAULT NULL,
  `time2` datetime DEFAULT NULL,
  `job` int(1) DEFAULT NULL,
  `create` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `datetable` */

insert  into `datetable`(`id`,`time1`,`time2`,`job`,`create`) values 
(1,'2017-12-01 21:00:00','2017-12-01 21:30:00',1,'2017-12-01 00:00:00'),
(3,'2017-12-02 16:50:37','2017-12-02 16:50:41',0,'2017-12-02 00:00:00');

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemsname` varchar(32) NOT NULL COMMENT '商品名称',
  `price` float(10,1) NOT NULL COMMENT '商品定价',
  `detail` text COMMENT '商品描述',
  `pic` varchar(64) DEFAULT NULL COMMENT '商品图片',
  `createtime` datetime NOT NULL COMMENT '生产日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `items` */

insert  into `items`(`id`,`itemsname`,`price`,`detail`,`pic`,`createtime`) values 
(1,'台式机',3000.0,'该电脑质量非常好！',NULL,'2015-07-07 13:28:53'),
(2,'笔记本',6000.0,'笔记本性能好，质量好！',NULL,'2015-07-08 13:22:57'),
(3,'背包',200.0,'名牌背包，容量大质量好！',NULL,'2015-07-10 13:25:02');

/*Table structure for table `orderdetail` */

DROP TABLE IF EXISTS `orderdetail`;

CREATE TABLE `orderdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orders_id` int(11) NOT NULL COMMENT '订单id',
  `items_id` int(11) NOT NULL COMMENT '商品id',
  `items_num` int(11) DEFAULT NULL COMMENT '商品购买数量',
  PRIMARY KEY (`id`),
  KEY `FK_orderdetail_1` (`orders_id`),
  KEY `FK_orderdetail_2` (`items_id`),
  CONSTRAINT `FK_orderdetail_1` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_orderdetail_2` FOREIGN KEY (`items_id`) REFERENCES `items` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `orderdetail` */

insert  into `orderdetail`(`id`,`orders_id`,`items_id`,`items_num`) values 
(9,1,1,1),
(10,1,2,3),
(11,2,3,4),
(12,3,2,3);

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '下单用户id',
  `number` varchar(30) NOT NULL COMMENT '订单号',
  `createtime` datetime NOT NULL COMMENT '创建订单时间',
  `note` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `FK_orders_1` (`user_id`),
  CONSTRAINT `FK_orders_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

insert  into `orders`(`id`,`user_id`,`number`,`createtime`,`note`) values 
(1,1,'1000010','2015-06-04 13:22:35',NULL),
(2,1,'1000011','2015-07-08 13:22:41',NULL),
(3,2,'1000012','2015-07-17 14:13:23',NULL),
(4,3,'1000012','2015-07-16 18:13:23',NULL),
(5,4,'1000012','2015-07-15 19:13:23',NULL),
(6,5,'1000012','2015-07-14 17:13:23',NULL),
(7,6,'1000012','2015-07-13 16:13:23',NULL);

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '用户名称',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  `address` varchar(256) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`username`,`birthday`,`sex`,`address`) values 
(1,'王五',NULL,'2',NULL),
(2,'张三','2014-07-10','1','北京市'),
(3,'张小明',NULL,'1','河南郑州'),
(4,'陈小明',NULL,'1','河南郑州'),
(5,'张三丰',NULL,'1','河南郑州'),
(6,'陈小明',NULL,'1','河南郑州'),
(7,'王五',NULL,NULL,NULL),
(8,'小A','2015-06-27','2','北京'),
(9,'小B','2015-06-27','2','北京'),
(10,'小C','2015-06-27','1','北京'),
(11,'小D','2015-06-27','2','北京');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `jobTime1` datetime DEFAULT NULL,
  `jobTime2` datetime DEFAULT NULL,
  `create` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`jobTime1`,`jobTime2`,`create`) values 
(1,'zzb','2017-12-01 08:00:00','2017-12-01 21:00:00','2017-12-01 00:00:00'),
(2,'zzb2','2017-12-01 16:56:31','2017-12-01 16:56:38','2017-12-02 00:00:00'),
(1,'zzb',NULL,NULL,'2017-12-02 00:00:00'),
(2,'zzb2','2017-12-01 07:00:00','2017-12-01 23:00:00','2017-12-01 00:00:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
