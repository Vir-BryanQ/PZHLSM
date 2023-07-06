/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 8.0.31 : Database - pzhlsm
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `automobile_purchase` */

insert  into `automobile_purchase`(`vehicle_id`,`vehicle_name`,`vehicle_model`,`vehicle_quantity`,`vehicle_status`,`create_time`,`vehicle_price`,`remark`) values (1,'大众','帕萨特',5,1,'2012-3-12',20,NULL),(2,'比亚迪','唐',2,0,'2023-4-28',23,NULL),(3,'吉利','缤越',1,0,'2023-5-12',20,NULL),(4,'比亚迪','汉',2,0,'20222-1-13',25,''),(5,'法拉利','小型',1,1,'2023-07-05',500000000,NULL);

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

/*Table structure for table `car_operate_record` */

DROP TABLE IF EXISTS `car_operate_record`;

CREATE TABLE `car_operate_record` (
  `mission_id` int NOT NULL,
  `car_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `car_type` int DEFAULT NULL,
  `car_licence` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_begin_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `state` int DEFAULT NULL,
  PRIMARY KEY (`mission_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

/*Data for the table `car_operate_record` */

insert  into `car_operate_record`(`mission_id`,`car_id`,`car_type`,`car_licence`,`mission_begin_time`,`state`) values (0,'3',3,'3','3',3),(999,'220101',1,'川C-22222','2023-07-02',3),(10000000,'190812',2,'川A-10086','2023-07-01',1),(10000001,'190811',2,'川A-11111','2023-07-03',1);

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `car_repair_records` */

insert  into `car_repair_records`(`record_id`,`car_id`,`repair_date`,`repair_type`,`repair_description`,`repair_cost`) values (3,1,'2022-03-12',NULL,NULL,NULL),(4,2,'2022-04-13',NULL,NULL,NULL),(5,3,'2022-04-25',NULL,NULL,NULL),(6,4,'2022-07-31',NULL,NULL,NULL),(7,5,'2022-09-12',NULL,NULL,NULL),(8,6,'2022-08-31',NULL,NULL,NULL),(9,7,'2023-01-05',NULL,NULL,NULL),(10,8,'2023-02-26',NULL,NULL,NULL);

/*Table structure for table `commercial_customer_record` */

DROP TABLE IF EXISTS `commercial_customer_record`;

CREATE TABLE `commercial_customer_record` (
  `mission_id` int NOT NULL,
  `company_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_price` int DEFAULT NULL,
  `state` int DEFAULT NULL,
  PRIMARY KEY (`mission_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

/*Data for the table `commercial_customer_record` */

insert  into `commercial_customer_record`(`mission_id`,`company_name`,`mission_price`,`state`) values (0,'2',2,2),(1,'nvdia',100000,0),(10000000,'顺丰速递',100000,2),(10000001,'圆通速递',80000,1),(10000002,'宁德时代',75000,1),(10000003,'贵州茅台',150000,2),(10000004,'华迪',10000,4);

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `commodity_psi` */

insert  into `commodity_psi`(`commodity_id`,`commodity_name`,`commodity_quantity`,`commodity_status`,`create_time`,`commodity_price`,`remark`) values (1,'运动鞋',0,0,'2012-06-03',120,NULL),(2,'面包',0,1,'2016-08-23',8,NULL),(4,'1',NULL,1,'1',1,'1'),(6,'食物',20,0,'2023-07-03',20,'无');

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `goods_id` int NOT NULL AUTO_INCREMENT,
  `goods_number` varchar(30) DEFAULT NULL,
  `goods_type` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `goods_weight` varchar(10) DEFAULT NULL,
  `goods_quantity` varchar(11) DEFAULT NULL,
  `commodity_id` int DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `goods` */

insert  into `goods`(`goods_id`,`goods_number`,`goods_type`,`goods_weight`,`goods_quantity`,`commodity_id`) values (1,'213223','运动鞋',NULL,NULL,1),(3,'2','2','2','2',2);

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

insert  into `material_psi`(`material_id`,`material_name`,`material_quantity`,`material_status`,`create_time`,`material_price`,`remark`) values (2,'钢圈',200,2,'2023-07-01',120,NULL),(3,'盆子1',50,1,'2020-12-1',5,''),(4,'2',2,2,'2',2,'2'),(5,'2',2,2,'2',2,'2'),(6,'2',2,2,'2',2,'2'),(7,'3',3,3,'3',3,'3'),(8,'4',4,4,'4',4,'4');

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

insert  into `office_consumables`(`office_consumables_id`,`consumable_name`,`purchase_quantity`,`create_time`,`per_price`,`remark`) values (1,'中性笔',30,'2012-12-05',1,'无'),(3,'橡皮',2,'2022-01-03',2,''),(4,'尺子1',10,'2022-01-03',10,''),(5,'稿纸',5,'2022-01-03',5,''),(6,'稿纸',5,'2022-01-03',5,''),(7,'稿纸',5,'2022-01-03',5,'');

/*Table structure for table `railway_mission_record` */

DROP TABLE IF EXISTS `railway_mission_record`;

CREATE TABLE `railway_mission_record` (
  `company_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_price` int DEFAULT NULL,
  `mission_origin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_destination` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `train_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_begin_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_finish_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `state` int DEFAULT NULL,
  `mission_id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`mission_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=100003 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

/*Data for the table `railway_mission_record` */

insert  into `railway_mission_record`(`company_name`,`mission_price`,`mission_origin`,`mission_destination`,`train_id`,`mission_begin_time`,`mission_finish_time`,`state`,`mission_id`) values ('panzhihua',100000,'SCCD',NULL,'E-120',NULL,NULL,0,100001),('3',3,'3','3','3','3','3',3,100002);

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
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb3;

/*Data for the table `staff` */

insert  into `staff`(`staff_id`,`staff_number`,`staff_name`,`gender`,`staff_age`,`staff_role`,`staff_time`,`salary`,`phone`,`staff_address`,`card_number`) values (8,'2020000001','张三','男',25,'经理','2020-01-01',20000,'13700000000','四川大学','6666'),(10,'2020001','某某某','女',26,'卡车司机','2020-01-02',20000,'18888888888','华迪','110022003300');

/*Table structure for table `transportation_mission_record` */

DROP TABLE IF EXISTS `transportation_mission_record`;

CREATE TABLE `transportation_mission_record` (
  `mission_id` int NOT NULL AUTO_INCREMENT,
  `mission_create_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_finish_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_origin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_destination` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `state` int DEFAULT NULL,
  PRIMARY KEY (`mission_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10000012 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

/*Data for the table `transportation_mission_record` */

insert  into `transportation_mission_record`(`mission_id`,`mission_create_time`,`mission_finish_time`,`mission_origin`,`mission_destination`,`state`) values (10000000,'2023-06-05','2023-07-08','成都市郫都区华迪公司',NULL,0),(10000001,'2023-06-05','2023-08-04','成都市郫都区华迪公司',NULL,0),(10000002,'2023-06-05','2023-07-01','成都市郫都区京东分公司',NULL,0),(10000003,'2023-06-06','2023-09-24','成都市郫都区圆通分公司','成都市郫都区京东分公司',2),(10000004,'2023-06-06','2023-10-11','成都市郫都区京东分公司','成都市郫都区京东分公司',1),(10000005,'2023-06-06','2023-11-11','成都市郫都区京东分公司','成都市郫都区京东分公司',1),(10000006,'3','2022-12-16','3','3',0),(10000007,'2023-07-03','2022-11-04','2','2',1),(10000008,'2023-07-03','2022-11-28','成都市郫都区圆通分公司','成都市郫都区京东分公司',1),(10000009,'2023-07-05',NULL,'','',1),(10000010,'2023-07-05','2023-07-04','成都','重庆',0),(10000011,'2023-07-05','2023-07-01','成都','成都',0);

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;

/*Data for the table `vehicle` */

insert  into `vehicle`(`vehicle_id`,`vehicle_number`,`type_id`,`latest_use`,`status`,`supplier`,`plate`,`purpose`,`automobile_id`) values (1,'3','3','3',3,'3','3','3',3),(7,'2','2','2023-07-05',1,'1','川FGR877','1',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
