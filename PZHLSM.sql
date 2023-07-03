/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 8.0.31 : Database - pzhwl
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `automobile_purchase` */

DROP TABLE IF EXISTS `automobile_purchase`;

CREATE TABLE `automobile_purchase` (
  `vehicle_id` int unsigned NOT NULL AUTO_INCREMENT,
  `vehicle_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `vehicle_model` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `vehicle_quantity` int DEFAULT NULL,
  `vehicle_status` int DEFAULT NULL COMMENT '采购=0，销售=1',
  `create_time` varchar(20) DEFAULT NULL,
  `vehicle_price` float DEFAULT NULL,
  `remark` varchar(511) DEFAULT NULL,
  PRIMARY KEY (`vehicle_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `automobile_purchase` */

insert  into `automobile_purchase`(`vehicle_id`,`vehicle_name`,`vehicle_model`,`vehicle_quantity`,`vehicle_status`,`create_time`,`vehicle_price`,`remark`) values (1,'大众','帕萨特',5,1,'2012-3-12',20,NULL),(2,'比亚迪','唐',2,0,'2023-4-28',23,NULL),(3,'吉利','缤越',1,0,'2023-5-12',20,NULL),(4,'比亚迪','汉',2,0,'20222-1-13',25,'');

/*Table structure for table `building` */

DROP TABLE IF EXISTS `building`;

CREATE TABLE `building` (
  `building_id` int NOT NULL AUTO_INCREMENT,
  `building_name` varchar(255) DEFAULT NULL,
  `building_place` varchar(100) DEFAULT NULL,
  `building_area` varchar(20) DEFAULT NULL,
  `create_time` varchar(20) DEFAULT NULL,
  `update_time` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`building_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `building` */

insert  into `building`(`building_id`,`building_name`,`building_place`,`building_area`,`create_time`,`update_time`) values (2,'1','1','1','1','1');

/*Table structure for table `building_transaction_records` */

DROP TABLE IF EXISTS `building_transaction_records`;

CREATE TABLE `building_transaction_records` (
  `record_id` int NOT NULL AUTO_INCREMENT,
  `building_id` int DEFAULT NULL,
  `transaction_type` varchar(255) DEFAULT NULL,
  `tenant_buyer_name` varchar(255) DEFAULT NULL,
  `transaction_date` char(10) DEFAULT NULL,
  `transaction_price` decimal(10,2) DEFAULT NULL,
  `lease_term` int DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `building_transaction_records` */

insert  into `building_transaction_records`(`record_id`,`building_id`,`transaction_type`,`tenant_buyer_name`,`transaction_date`,`transaction_price`,`lease_term`) values (1,8888,'更新测试','大卫','2021-09-09','29999.00',300),(5,9999,'测试','大卫','2021-09-09','29999.00',300),(6,2,'3','4','5','6.00',7),(7,2,'2','3','3','3.00',3),(10,3,'3','3','3','3.00',3);

/*Table structure for table `car_repair_records` */

DROP TABLE IF EXISTS `car_repair_records`;

CREATE TABLE `car_repair_records` (
  `record_id` int NOT NULL AUTO_INCREMENT,
  `car_id` int DEFAULT NULL,
  `repair_date` char(10) DEFAULT NULL,
  `repair_type` varchar(255) DEFAULT NULL,
  `repair_description` varchar(255) DEFAULT NULL,
  `repair_cost` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `car_repair_records` */

/*Table structure for table `commodity_psi` */

DROP TABLE IF EXISTS `commodity_psi`;

CREATE TABLE `commodity_psi` (
  `commodity_id` int unsigned NOT NULL AUTO_INCREMENT,
  `commodity_name` varchar(255) DEFAULT NULL,
  `commodity_quantity` int DEFAULT NULL,
  `commodity_status` int DEFAULT NULL COMMENT '采购=0,\n销售=1,存储=2',
  `create_time` varchar(20) DEFAULT NULL,
  `commodity_price` float DEFAULT NULL COMMENT '单价',
  `remark` varchar(511) DEFAULT NULL,
  PRIMARY KEY (`commodity_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `commodity_psi` */

insert  into `commodity_psi`(`commodity_id`,`commodity_name`,`commodity_quantity`,`commodity_status`,`create_time`,`commodity_price`,`remark`) values (1,'运动鞋',NULL,0,'2012-6-03',120,NULL),(2,'面包',NULL,1,'2016-8-23',8,NULL),(4,'1',NULL,1,'1',1,'1');

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `goods_id` int NOT NULL AUTO_INCREMENT,
  `goods_number` varchar(30) DEFAULT NULL,
  `goods_tpye` varchar(30) DEFAULT NULL,
  `goods_weight` varchar(10) DEFAULT NULL,
  `goods_quantity` varchar(11) DEFAULT NULL,
  `commodity_id` int DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `goods` */

insert  into `goods`(`goods_id`,`goods_number`,`goods_tpye`,`goods_weight`,`goods_quantity`,`commodity_id`) values (1,'213223','运动鞋',NULL,NULL,1),(3,'2','2','2','2',2);

/*Table structure for table `material_psi` */

DROP TABLE IF EXISTS `material_psi`;

CREATE TABLE `material_psi` (
  `material_id` int unsigned NOT NULL AUTO_INCREMENT,
  `material_name` varchar(255) DEFAULT NULL,
  `material_quantity` int DEFAULT NULL,
  `material_status` int DEFAULT NULL COMMENT '采购=0，销售=1，存储=2',
  `create_time` varchar(20) DEFAULT NULL,
  `material_price` float DEFAULT NULL COMMENT '物资单价',
  `remark` varchar(511) DEFAULT NULL,
  PRIMARY KEY (`material_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `material_psi` */

insert  into `material_psi`(`material_id`,`material_name`,`material_quantity`,`material_status`,`create_time`,`material_price`,`remark`) values (2,'钢圈',200,0,'2023-7-01',120,NULL),(3,'盆子1',50,1,'2020-12-1',5,''),(4,'2',2,2,'2',2,'2'),(5,'2',2,2,'2',2,'2'),(6,'2',2,2,'2',2,'2'),(7,'3',3,3,'3',3,'3'),(8,'4',4,4,'4',4,'4');

/*Table structure for table `material_usage_records` */

DROP TABLE IF EXISTS `material_usage_records`;

CREATE TABLE `material_usage_records` (
  `record_id` int NOT NULL AUTO_INCREMENT,
  `material_id` int DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `usage_purpose` varchar(255) DEFAULT NULL,
  `usage_quality` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `material_usage_records` */

/*Table structure for table `office_consumables` */

DROP TABLE IF EXISTS `office_consumables`;

CREATE TABLE `office_consumables` (
  `office_consumables_id` int unsigned NOT NULL AUTO_INCREMENT,
  `consumable_name` varchar(255) DEFAULT NULL,
  `purchase_quantity` int DEFAULT NULL,
  `create_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `per_price` float DEFAULT NULL,
  `remark` varchar(511) DEFAULT NULL,
  PRIMARY KEY (`office_consumables_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `office_consumables` */

insert  into `office_consumables`(`office_consumables_id`,`consumable_name`,`purchase_quantity`,`create_time`,`per_price`,`remark`) values (1,'中性笔',30,'2012-12-05',1,'无'),(3,'橡皮',20,'2022-1-3',2,''),(4,'尺子1',20,'2022-1-3',10,''),(5,'稿纸',20,'2022-1-3',5,''),(6,'稿纸',20,'2022-1-3',5,''),(7,'稿纸',20,'2022-1-3',5,'');

/*Table structure for table `repair_worker_maintenance_records` */

DROP TABLE IF EXISTS `repair_worker_maintenance_records`;

CREATE TABLE `repair_worker_maintenance_records` (
  `record_id` int NOT NULL AUTO_INCREMENT,
  `repair_worker_id` int DEFAULT NULL,
  `car_id` int DEFAULT NULL,
  `maintenance_date` char(10) DEFAULT NULL,
  `maintenance_description` varchar(255) DEFAULT NULL,
  `maintenance_cost` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `repair_worker_maintenance_records` */

/*Table structure for table `resource` */

DROP TABLE IF EXISTS `resource`;

CREATE TABLE `resource` (
  `resource_id` int NOT NULL AUTO_INCREMENT,
  `resource_name` varchar(50) DEFAULT NULL,
  `resource_use` varchar(255) DEFAULT NULL,
  `material_id` int DEFAULT NULL,
  PRIMARY KEY (`resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `resource` */

insert  into `resource`(`resource_id`,`resource_name`,`resource_use`,`material_id`) values (1,'钢圈',NULL,NULL),(3,'2','2',2),(4,NULL,NULL,0),(5,'2','2',2);

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staff_id` bigint NOT NULL AUTO_INCREMENT,
  `staff_number` varchar(20) DEFAULT NULL,
  `staff_name` varchar(20) DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `staff_age` int DEFAULT NULL,
  `staff_role` varchar(50) DEFAULT NULL,
  `staff_time` varchar(20) DEFAULT NULL,
  `salary` float DEFAULT NULL,
  `phone` varchar(12) DEFAULT NULL,
  `staff_address` varchar(100) DEFAULT NULL,
  `card_number` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;

/*Data for the table `staff` */

insert  into `staff`(`staff_id`,`staff_number`,`staff_name`,`gender`,`staff_age`,`staff_role`,`staff_time`,`salary`,`phone`,`staff_address`,`card_number`) values (3,'20230007','小明','0',24,NULL,NULL,4000,NULL,NULL,NULL),(6,'1','1','1',1,NULL,'1',1,'1','1','1'),(7,'1','1','1',1,NULL,'1',1,'1','1','1'),(8,'2020000001','张三','男',25,'经理','2020-01-01',20000,'13700000000','四川大学','6666'),(9,'2','2','2',2,'2','2',2,'2','2','2');

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `id` char(10) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `passwd` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `user_info` */

insert  into `user_info`(`id`,`username`,`passwd`,`email`) values ('0123456789','pzhlsm','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','000000@email.com');

/*Table structure for table `userinfo` */

DROP TABLE IF EXISTS `userinfo`;

CREATE TABLE `userinfo` (
  `id` char(10) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `passwd` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

/*Data for the table `userinfo` */

insert  into `userinfo`(`id`,`username`,`passwd`,`email`) values ('0123456789','pzhlsm','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','000000@email.com');

/*Table structure for table `vehicle` */

DROP TABLE IF EXISTS `vehicle`;

CREATE TABLE `vehicle` (
  `vehicle_id` bigint NOT NULL AUTO_INCREMENT,
  `vehicle_number` varchar(20) DEFAULT NULL,
  `type_id` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `latest_use` varchar(20) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `supplier` varchar(20) DEFAULT NULL,
  `plate` varchar(10) DEFAULT NULL,
  `purpose` varchar(50) DEFAULT NULL,
  `automobile_id` int DEFAULT NULL,
  PRIMARY KEY (`vehicle_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

/*Data for the table `vehicle` */

insert  into `vehicle`(`vehicle_id`,`vehicle_number`,`type_id`,`latest_use`,`status`,`supplier`,`plate`,`purpose`,`automobile_id`) values (1,'3','3','3',3,'3','3','3',3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
