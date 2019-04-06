/*
SQLyog  v12.2.6 (64 bit)
MySQL - 8.0.15 : Database - oauth2_resource
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`oauth2_resource` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `oauth2_resource`;

/*Table structure for table `tb_content` */

DROP TABLE IF EXISTS `tb_content`;

CREATE TABLE `tb_content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) NOT NULL COMMENT '内容类目ID',
  `title` varchar(200) DEFAULT NULL COMMENT '内容标题',
  `sub_title` varchar(100) DEFAULT NULL COMMENT '子标题',
  `title_desc` varchar(500) DEFAULT NULL COMMENT '标题描述',
  `url` varchar(500) DEFAULT NULL COMMENT '链接',
  `pic` varchar(300) DEFAULT NULL COMMENT '图片绝对路径',
  `pic2` varchar(300) DEFAULT NULL COMMENT '图片2',
  `content` text COMMENT '内容',
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  KEY `updated` (`updated`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

/*Data for the table `tb_content` */

insert  into `tb_content`(`id`,`category_id`,`title`,`sub_title`,`title_desc`,`url`,`pic`,`pic2`,`content`,`created`,`updated`) values 
(28,89,'标题','子标题','标题说明','http://www.jd.com',NULL,NULL,NULL,'2019-04-07 00:56:09','2019-04-07 00:56:11'),
(29,89,'ad2','ad2','ad2','http://www.baidu.com',NULL,NULL,NULL,'2019-04-07 00:56:13','2019-04-07 00:56:15'),
(30,89,'ad3','ad3','ad3','http://www.sina.com.cn',NULL,NULL,NULL,'2019-04-07 00:56:17','2019-04-07 00:56:19'),
(31,89,'ad4','ad4','ad4','http://www.funtl.com',NULL,NULL,NULL,'2019-04-07 00:56:22','2019-04-07 00:56:25');

/*Table structure for table `tb_content_category` */

DROP TABLE IF EXISTS `tb_content_category`;

CREATE TABLE `tb_content_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目ID',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父类目ID=0时，代表的是一级的类目',
  `name` varchar(50) DEFAULT NULL COMMENT '分类名称',
  `status` int(1) DEFAULT '1' COMMENT '状态。可选值:1(正常),2(删除)',
  `sort_order` int(4) DEFAULT NULL COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数',
  `is_parent` tinyint(1) DEFAULT '1' COMMENT '该类目是否为父类目，1为true，0为false',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `updated` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`,`status`) USING BTREE,
  KEY `sort_order` (`sort_order`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=utf8 COMMENT='内容分类';

/*Data for the table `tb_content_category` */

insert  into `tb_content_category`(`id`,`parent_id`,`name`,`status`,`sort_order`,`is_parent`,`created`,`updated`) values 
(30,0,'LeeShop',1,1,1,'2015-04-03 16:51:38','2015-04-03 16:51:40'),
(86,30,'首页',1,1,1,'2015-06-07 15:36:07','2015-06-07 15:36:07'),
(87,30,'列表页面',1,1,1,'2015-06-07 15:36:16','2015-06-07 15:36:16'),
(88,30,'详细页面',1,1,1,'2015-06-07 15:36:27','2015-06-07 15:36:27'),
(89,86,'大广告',1,1,0,'2015-06-07 15:36:38','2015-06-07 15:36:38'),
(90,86,'小广告',1,1,0,'2015-06-07 15:36:45','2015-06-07 15:36:45'),
(91,86,'商城快报',1,1,0,'2015-06-07 15:36:55','2015-06-07 15:36:55'),
(92,87,'边栏广告',1,1,0,'2015-06-07 15:37:07','2015-06-07 15:37:07'),
(93,87,'页头广告',1,1,0,'2015-06-07 15:37:17','2015-06-07 15:37:17'),
(94,87,'页脚广告',1,1,0,'2015-06-07 15:37:31','2015-06-07 15:37:31'),
(95,88,'边栏广告',1,1,0,'2015-06-07 15:37:56','2015-06-07 15:37:56'),
(96,86,'中广告',1,1,1,'2015-07-25 18:58:52','2015-07-25 18:58:52'),
(97,96,'中广告1',1,1,0,'2015-07-25 18:59:43','2015-07-25 18:59:43');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
