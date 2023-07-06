/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80033 (8.0.33)
 Source Host           : localhost:3306
 Source Schema         : PZHLSM

 Target Server Type    : MySQL
 Target Server Version : 80033 (8.0.33)
 File Encoding         : 65001

 Date: 06/07/2023 14:49:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for automobile_purchase
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=156 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of automobile_purchase
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for building
-- ----------------------------
DROP TABLE IF EXISTS `building`;
CREATE TABLE `building` (
  `building_id` int NOT NULL AUTO_INCREMENT,
  `building_name` varchar(255) DEFAULT NULL,
  `building_place` varchar(100) DEFAULT NULL,
  `building_area` varchar(20) DEFAULT NULL,
  `create_time` varchar(20) DEFAULT NULL,
  `update_time` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`building_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of building
-- ----------------------------
BEGIN;
INSERT INTO `building` (`building_id`, `building_name`, `building_place`, `building_area`, `create_time`, `update_time`) VALUES (3, '仓库', '四川成都', '500', '2023-07-03', '');
COMMIT;

-- ----------------------------
-- Table structure for building_transaction_records
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=242 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of building_transaction_records
-- ----------------------------
BEGIN;
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (191, 251, '6Qk1pSqqzb', 'Travis Munoz', '2022-02-07', 114670.46, 11);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (192, 710, 'iSTq9TBjQP', 'Shing Lai Yan', '2022-02-26', 126754.03, 8);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (193, 814, 'Wkv2Pvh1dY', 'Lu Yunxi', '2022-09-10', 137990.31, 12);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (194, 515, 'Q3DSrK3v8j', 'Chu Ling Ling', '2022-09-19', 118507.08, 11);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (195, 73, 'cBYtkjxRiw', 'Meng Ziyi', '2023-05-24', 114972.22, 6);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (196, 178, '8w9c3nVmQd', 'Hou Xiaoming', '2022-11-12', 129459.33, 9);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (197, 235, '8an7zYtcFF', 'Chin Chun Yu', '2022-10-31', 143716.89, 8);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (198, 495, 'A4q7vBJqK8', 'Xue Jialun', '2023-11-27', 118853.32, 7);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (199, 252, 'anT1IzFlWZ', 'Zou Rui', '2023-12-19', 146112.70, 9);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (200, 533, 'GYhHO9tPHZ', 'Chu Ming Sze', '2022-08-24', 141565.98, 7);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (201, 665, 'Gqd8Q0WklV', 'Hao Anqi', '2022-08-29', 121695.39, 11);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (202, 460, '6jIYwgWclm', 'Dai Lai Yan', '2022-12-31', 147591.85, 6);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (203, 598, 'h6C5eF3hHI', 'Matsuda Eita', '2022-10-03', 120902.98, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (204, 20, 'AH3NHriNL5', 'Man Tin Wing', '2023-04-19', 109069.35, 7);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (205, 906, 'NSellAMRsx', 'Kam Ming', '2022-01-10', 113849.12, 11);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (206, 388, 'q5sOxmTbOU', 'Yeow Wai Han', '2023-10-07', 112097.63, 7);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (207, 938, 'vf61rFM6N5', 'Nakajima Airi', '2022-03-27', 131545.56, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (208, 273, 'V22HZ1c1lB', 'Sasaki Riku', '2023-03-09', 121670.44, 8);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (209, 995, 'GbUmyBZebg', 'Zhu Yuning', '2023-07-06', 125668.53, 9);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (210, 120, 'CZWEDz7mSL', 'Ogawa Sara', '2022-03-17', 137714.93, 8);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (211, 784, 'FRUbZrnWNP', 'Sakamoto Yota', '2023-08-12', 139001.56, 8);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (212, 642, 'lH8pmkM78N', 'Wada Mitsuki', '2023-10-20', 147726.51, 11);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (213, 311, 'NRM8Pn7W7V', 'Chan Lai Yan', '2023-07-31', 127937.39, 11);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (214, 282, 'hQefdDkM8A', 'Ono Akina', '2022-11-12', 124510.84, 12);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (215, 101, 'MHJR337NPr', 'Hashimoto Daisuke', '2023-05-12', 145252.89, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (216, 728, 'gZ712Yx3w3', 'Anthony Garza', '2023-01-27', 133974.80, 9);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (217, 429, '31ir4GFBbR', 'Sun Yunxi', '2023-05-26', 142876.49, 6);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (218, 155, 'CiM4FZfoRh', 'Yin Zhennan', '2023-09-15', 147036.25, 6);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (219, 761, 'bspvAyASkb', 'Ota Seiko', '2022-12-17', 143714.47, 7);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (220, 53, 'JtNHU0esJz', 'Cheng Ming', '2023-11-22', 107898.56, 12);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (221, 447, 'GLCfO1bAsj', 'Yip Sai Wing', '2022-03-30', 115907.79, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (222, 564, 'NJPKnnVloG', 'Huang Zhennan', '2023-04-02', 114940.88, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (223, 262, 'cbUpgsrFnR', 'Mary Gomez', '2023-08-21', 105105.09, 8);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (224, 955, 'D6lIHUsOgI', 'Harada Momoe', '2022-04-25', 102510.73, 7);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (225, 596, 'Z8OxBrJCA7', 'Ding Lan', '2023-09-11', 141779.01, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (226, 749, 'a0DtPFdicr', 'Nomura Ren', '2022-11-28', 127540.75, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (227, 908, 'VC3H5iZkSY', 'Watanabe Aoshi', '2022-08-10', 122438.91, 11);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (228, 18, 'R8cspzDKmu', 'Sato Airi', '2022-12-03', 135736.50, 8);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (229, 458, '5D5rsh9FWG', 'Jiang Ziyi', '2023-04-28', 141622.46, 12);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (230, 432, '9M8U8UsSPj', 'Ando Tsubasa', '2023-03-01', 128356.37, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (231, 82, 'qJuqKbdNPi', 'Yuen Tsz Hin', '2022-08-08', 101404.25, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (232, 193, 'N79g6QJFS0', 'Nakajima Shino', '2022-05-14', 101660.47, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (233, 813, 'BFa9iqJcL5', 'Amy Peterson', '2022-01-04', 138332.62, 7);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (234, 233, 'w18qlBGwOT', 'Fang Zhennan', '2022-06-22', 114861.25, 9);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (235, 191, 'jScSaSM2xC', 'Ying Kwok Ming', '2022-12-30', 145301.77, 7);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (236, 482, 'M7svJTUuWX', 'Sugiyama Tsubasa', '2023-04-30', 138239.92, 12);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (237, 338, '6XMQXPpQVv', 'Jiang Zitao', '2023-11-17', 127743.72, 6);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (238, 206, '9FqUHo62Sb', 'Kojima Yuto', '2022-09-04', 111883.22, 7);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (239, 477, 'Sxpx5meDOZ', 'Ota Hikaru', '2022-06-18', 102661.81, 10);
INSERT INTO `building_transaction_records` (`record_id`, `building_id`, `transaction_type`, `tenant_buyer_name`, `transaction_date`, `transaction_price`, `lease_term`) VALUES (240, 113, '4ytObXXoug', 'Murata Kazuma', '2023-08-04', 117038.19, 7);
COMMIT;

-- ----------------------------
-- Table structure for car_operate_record
-- ----------------------------
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

-- ----------------------------
-- Records of car_operate_record
-- ----------------------------
BEGIN;
INSERT INTO `car_operate_record` (`mission_id`, `car_id`, `car_type`, `car_licence`, `mission_begin_time`, `state`) VALUES (122, '084354', 3, '川C-22222', '2023-07-12', 3);
INSERT INTO `car_operate_record` (`mission_id`, `car_id`, `car_type`, `car_licence`, `mission_begin_time`, `state`) VALUES (999, '220101', 1, '川C-22222', '2023-07-02', 3);
INSERT INTO `car_operate_record` (`mission_id`, `car_id`, `car_type`, `car_licence`, `mission_begin_time`, `state`) VALUES (10000000, '190812', 2, '川A-10086', '2023-07-01', 1);
INSERT INTO `car_operate_record` (`mission_id`, `car_id`, `car_type`, `car_licence`, `mission_begin_time`, `state`) VALUES (10000001, '190811', 2, '川A-11111', '2023-07-03', 1);
INSERT INTO `car_operate_record` (`mission_id`, `car_id`, `car_type`, `car_licence`, `mission_begin_time`, `state`) VALUES (10000013, NULL, 0, '川AAB555', NULL, 0);
COMMIT;

-- ----------------------------
-- Table structure for car_repair_records
-- ----------------------------
DROP TABLE IF EXISTS `car_repair_records`;
CREATE TABLE `car_repair_records` (
  `record_id` int NOT NULL AUTO_INCREMENT,
  `car_id` int DEFAULT NULL,
  `repair_date` char(10) DEFAULT NULL,
  `repair_type` varchar(255) DEFAULT NULL,
  `repair_description` varchar(255) DEFAULT NULL,
  `repair_cost` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of car_repair_records
-- ----------------------------
BEGIN;
INSERT INTO `car_repair_records` (`record_id`, `car_id`, `repair_date`, `repair_type`, `repair_description`, `repair_cost`) VALUES (3, 1111, '2023-07-05', '坏了', '坏了', 1.00);
INSERT INTO `car_repair_records` (`record_id`, `car_id`, `repair_date`, `repair_type`, `repair_description`, `repair_cost`) VALUES (4, 2222, '2023-07-04', '1', '2', 3.00);
COMMIT;

-- ----------------------------
-- Table structure for commercial_customer_record
-- ----------------------------
DROP TABLE IF EXISTS `commercial_customer_record`;
CREATE TABLE `commercial_customer_record` (
  `mission_id` int NOT NULL,
  `company_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_price` int DEFAULT NULL,
  `state` int DEFAULT NULL,
  PRIMARY KEY (`mission_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of commercial_customer_record
-- ----------------------------
BEGIN;
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (1, 'Liang Kee Company Limited', 1053, 3);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (2, 'Wai Man Limited', 1038, 3);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (3, 'Liang Kee Telecommunication Company Limited', 1074, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (4, 'Lu Network Systems Company Limited', 1090, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (5, 'Hana Corporation', 1068, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (6, 'Watson\'s Pharmaceutical Inc.', 1286, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (7, 'Wing Suen Pharmaceutical Limited', 1197, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (8, 'Kinoshita Telecommunication Corporation', 1180, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (9, 'Sylvia Inc.', 1487, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (10, 'Stephanie Trading LLC', 1306, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (11, 'King\'s Trading LLC', 1349, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (12, 'Lan Engineering Company Limited', 1458, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (13, 'Tang Kee Development & Trading Limited', 1379, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (14, 'Lu Engineering Company Limited', 1181, 3);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (15, 'Graham\'s Pharmaceutical LLC', 1090, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (16, 'Miu\'s Limited', 1459, 3);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (17, 'Sakura Corporation', 1493, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (18, 'Jimenez Brothers Inc.', 1023, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (19, 'Yuning Pharmaceutical Company Limited', 1053, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (20, 'Kenneth Electronic Inc.', 1044, 3);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (21, 'Wai Yee Electronic Limited', 1037, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (22, 'John Consultants Inc.', 1211, 3);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (23, 'Lan Company Limited', 1348, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (24, 'Lan Development & Trading Company Limited', 1094, 0);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (25, 'Aoi Corporation', 1171, 0);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (26, 'Jennifer Inc.', 1261, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (27, 'Cheung\'s Electronic Limited', 1195, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (28, 'Lin Network Systems Company Limited', 1261, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (29, 'Wu Technology Company Limited', 1060, 0);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (30, 'Eleanor Inc.', 1248, 0);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (31, 'Shimada Corporation', 1229, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (32, 'Momoka Corporation', 1011, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (33, 'Zhiyuan Electronic Company Limited', 1355, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (34, 'Peterson Brothers Toy Inc.', 1293, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (35, 'Chen Company Limited', 1374, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (36, 'Adam Electronic Inc.', 1090, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (37, 'Xia Kee Company Limited', 1436, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (38, 'Anqi Company Limited', 1229, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (39, 'Hui\'s Network Systems Limited', 1045, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (40, 'Tak Wah Electronic Limited', 1227, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (41, 'Jialun Company Limited', 1366, 0);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (42, 'Denise Trading Inc.', 1138, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (43, 'Su Kee Telecommunication Company Limited', 1372, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (44, 'Chi Ming Communications Limited', 1304, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (45, 'Baker Brothers Inc.', 1200, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (46, 'Rui Company Limited', 1393, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (47, 'Brooks Consultants LLC', 1326, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (48, 'Jialun Company Limited', 1362, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (49, 'Cheung Kee Development & Trading Limited', 1047, 1);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (50, 'Tin Lok Property Limited', 1290, 2);
INSERT INTO `commercial_customer_record` (`mission_id`, `company_name`, `mission_price`, `state`) VALUES (10000013, 'SICHUAN', 50000, 1);
COMMIT;

-- ----------------------------
-- Table structure for commodity_psi
-- ----------------------------
DROP TABLE IF EXISTS `commodity_psi`;
CREATE TABLE `commodity_psi` (
  `commodity_id` int unsigned NOT NULL AUTO_INCREMENT,
  `commodity_name` varchar(255) DEFAULT NULL,
  `commodity_quantity` int DEFAULT NULL,
  `commodity_status` int DEFAULT NULL COMMENT '采购=0,\n销售=1,存储=2',
  `create_time` varchar(20) DEFAULT NULL,
  `commodity_price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `remark` varchar(511) DEFAULT NULL,
  PRIMARY KEY (`commodity_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1107 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of commodity_psi
-- ----------------------------
BEGIN;
INSERT INTO `commodity_psi` (`commodity_id`, `commodity_name`, `commodity_quantity`, `commodity_status`, `create_time`, `commodity_price`, `remark`) VALUES (1106, '食物', 500, 2, '2023-07-06', 50.00, '1');
COMMIT;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goods_id` int NOT NULL AUTO_INCREMENT,
  `goods_number` varchar(30) DEFAULT NULL,
  `goods_type` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `goods_weight` varchar(10) DEFAULT NULL,
  `goods_quantity` varchar(11) DEFAULT NULL,
  `commodity_id` int DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of goods
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for material_psi
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=1161 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of material_psi
-- ----------------------------
BEGIN;
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1111, 'Goto Mio', 5, 0, '2023-12-03', 91.45, 'uLkP44I2j7');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1112, 'Jiang Yuning', 5, 1, '2022-04-10', 90.63, 'I3V2DdPJtb');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1113, 'Sun Zitao', 6, 1, '2022-08-24', 51.34, 'JkyxwRbIKn');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1114, 'Ma Ho Yin', 7, 1, '2022-08-08', 83.86, 'w03NG2ELRD');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1115, 'Ng Sau Man', 8, 0, '2023-06-29', 95.24, 'aIDxdkZKQG');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1116, 'Wong Fu Shing', 6, 1, '2022-04-03', 76.73, 't4Z3qYygCm');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1117, 'Sakurai Kazuma', 10, 1, '2022-07-12', 67.85, '7LxfFqvQ1Z');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1118, 'Timothy Perry', 8, 0, '2022-11-24', 59.65, 'npLtW41de1');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1119, 'Murata Hana', 5, 0, '2023-05-31', 83.21, 'StG9ejeChx');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1120, 'Ding Zhennan', 8, 0, '2022-08-12', 70.42, 'kSXVMlOKwn');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1121, 'Chung Yun Fat', 7, 1, '2023-03-04', 76.62, 'I9JIn3vyid');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1122, 'Albert Fox', 10, 0, '2023-12-03', 96.18, 'DseJj4Yl38');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1123, 'Au Wing Kuen', 7, 0, '2023-10-24', 57.51, 'ZbTeII8Icj');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1124, 'Arai Yuna', 9, 1, '2023-02-03', 87.2, 'koGEveKNZy');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1125, 'Heung Wai Lam', 8, 1, '2022-03-03', 85.81, 'uuWukFazih');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1126, 'Fu Ling Ling', 10, 0, '2022-05-13', 95.52, 'COYEFpjuep');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1127, 'Gao Xiuying', 9, 1, '2022-11-10', 92.31, 'BljbCTcxJm');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1128, 'Gu Ziyi', 9, 0, '2022-04-30', 98.69, 'BZsxYI2hY1');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1129, 'Yin Cho Yee', 10, 1, '2022-07-16', 95.51, 'cDOrpajn7o');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1130, 'Hsuan Tsz Ching', 9, 1, '2023-12-20', 72.59, 'xiy7eeEmlC');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1131, 'Takeuchi Seiko', 7, 1, '2023-09-21', 89.95, 'FgZO1gcUbX');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1132, 'Ma Lik Sun', 9, 0, '2023-05-08', 76.12, '8QLlGVe6Pz');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1133, 'Wong Chi Yuen', 9, 0, '2023-03-05', 67.75, 'QWMlUhP4V2');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1134, 'Ueda Aoshi', 10, 0, '2023-11-29', 98.73, '0KJ3V96e6f');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1135, 'Yamada Misaki', 8, 0, '2022-05-30', 88.43, 'oA3hhn5Gir');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1136, 'Ono Rin', 8, 0, '2023-11-09', 59.19, 'Ok9F3sZNcF');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1137, 'Hara Aoshi', 10, 0, '2022-03-03', 66.82, 'lsMDg5ELGT');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1138, 'Yam Chiu Wai', 7, 0, '2022-08-25', 73.69, 'sicvXq3OOM');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1139, 'Nishimura Hina', 8, 0, '2022-01-10', 78.42, 'lZbNqmQJRv');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1140, 'Ann Payne', 6, 0, '2022-01-01', 82, 'uoiIXQlxqx');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1141, 'Yokoyama Airi', 8, 0, '2023-07-13', 99.7, '2aRoTVsxQ1');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1142, 'Sakurai Hikaru', 6, 1, '2022-07-01', 96.75, 'lDpUHSNpNq');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1143, 'Steven Hamilton', 7, 0, '2023-06-08', 58.76, 'i96BslcCQU');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1144, 'Kimberly Gardner', 7, 1, '2022-06-20', 59.5, '1DX3GDhCgD');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1145, 'Cheng Xiaoming', 5, 0, '2023-12-13', 78.51, 'Sqmhy3tr7w');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1146, 'Koon Hok Yau', 8, 0, '2022-12-01', 78.13, 'MtuxFuvHcI');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1147, 'Ma Ziyi', 7, 0, '2023-06-21', 54.27, 'Y690oxOCUx');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1148, 'Lee Kwok Ming', 8, 1, '2022-08-13', 73.59, 'R8JVmePQRt');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1149, 'Kwong Hok Yau', 5, 0, '2023-02-04', 98.81, '4bB7yWIMqa');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1150, 'Guo Zhiyuan', 9, 1, '2023-11-02', 95.9, 'i6OpahrVBA');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1151, 'Xu Zhennan', 10, 0, '2022-10-06', 78.22, '0bq5uYgMH7');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1152, 'Hirano Hina', 6, 1, '2022-02-20', 83.95, 'Tgez5A6iDI');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1153, 'Ichikawa Hana', 9, 0, '2022-11-25', 81.42, 'B3CzEXnfks');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1154, 'Koo Tin Lok', 9, 1, '2023-04-05', 95.76, 'Ffc4pCaE6I');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1155, 'Shen Rui', 6, 0, '2023-08-24', 80.85, 'aAMh1C8JsN');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1156, 'Carrie Turner', 10, 0, '2022-09-11', 58.89, 'GflN5GzF0v');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1157, 'Chang Yunxi', 7, 1, '2023-05-05', 50.59, '4KbGFdIK57');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1158, 'Hirano Seiko', 5, 1, '2023-01-09', 67, 'Dv52QZ6Lau');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1159, 'Sheh Kwok Kuen', 6, 1, '2023-10-15', 67.45, 'WdPjZQQhnn');
INSERT INTO `material_psi` (`material_id`, `material_name`, `material_quantity`, `material_status`, `create_time`, `material_price`, `remark`) VALUES (1160, 'Eddie Hayes', 10, 0, '2022-01-09', 74.21, 'PY3Od3RqGX');
COMMIT;

-- ----------------------------
-- Table structure for material_usage_records
-- ----------------------------
DROP TABLE IF EXISTS `material_usage_records`;
CREATE TABLE `material_usage_records` (
  `record_id` int NOT NULL AUTO_INCREMENT,
  `material_id` int DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `usage_purpose` varchar(255) DEFAULT NULL,
  `usage_quality` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of material_usage_records
-- ----------------------------
BEGIN;
INSERT INTO `material_usage_records` (`record_id`, `material_id`, `department`, `user`, `usage_purpose`, `usage_quality`) VALUES (3, 1, '运输部', '某', '运输', 20.00);
INSERT INTO `material_usage_records` (`record_id`, `material_id`, `department`, `user`, `usage_purpose`, `usage_quality`) VALUES (4, 2, '维修部', '张三', '维修', 50.00);
COMMIT;

-- ----------------------------
-- Table structure for office_consumables
-- ----------------------------
DROP TABLE IF EXISTS `office_consumables`;
CREATE TABLE `office_consumables` (
  `office_consumables_id` int unsigned NOT NULL AUTO_INCREMENT,
  `consumable_name` varchar(255) DEFAULT NULL,
  `purchase_quantity` int DEFAULT NULL,
  `create_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `per_price` float DEFAULT NULL,
  `remark` varchar(511) DEFAULT NULL,
  PRIMARY KEY (`office_consumables_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1065 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of office_consumables
-- ----------------------------
BEGIN;
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1013, 'Noguchi Eita', 86, '2023-02-01', 46.63, 'LP3aHisbFf');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1014, 'Jane Kennedy', 258, '2023-07-19', 85.48, '6oEyM38urQ');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1015, 'Kao Wing Sze', 115, '2022-11-26', 92, 'ZZZmgavvL4');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1016, 'Ishikawa Momoka', 89, '2022-11-03', 69.94, 'rtbrwKHpMe');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1017, 'Zhang Zhiyuan', 268, '2021-11-22', 35.17, 'ZJsizLcbcU');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1018, 'Norma Ramirez', 55, '2021-07-02', 54.95, '3cUc41riGd');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1019, 'Willie Turner', 138, '2021-01-01', 72.68, 'iqoFRcQfzk');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1020, 'Sakamoto Riku', 248, '2021-05-26', 20.16, 'tfVwEuLTS1');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1021, 'Takeuchi Sara', 259, '2020-01-12', 47.62, '32hAPbVuEI');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1022, 'Tan Rui', 241, '2020-07-05', 40.74, 'malNvHgPey');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1023, 'Yuen Wai San', 67, '2023-06-25', 37.67, 'pzwFxaPbMC');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1024, 'Chu Cho Yee', 114, '2022-11-21', 50.2, 'oDbZf3RjBT');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1025, 'Maruyama Rena', 174, '2021-08-09', 53.87, 'kOR5xTx80U');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1026, 'Aoki Hana', 241, '2022-04-11', 64.42, 'WGSaYw8nMw');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1027, 'Zhong Lan', 251, '2022-05-08', 50.94, '0XRMCRlwPR');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1028, 'Koo Wing Fat', 210, '2022-12-19', 49.11, 'RaToTBL42r');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1029, 'Fan Cho Yee', 60, '2022-07-16', 73.32, '04pu8bCHTR');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1030, 'Yamada Mio', 62, '2021-01-11', 46.67, '4DNyQVo8sB');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1031, 'Chen Ziyi', 234, '2021-05-24', 25.04, 'UN6D6wPUfM');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1032, 'Yue Wing Sze', 260, '2021-01-26', 75.87, 'IU37upXy8n');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1033, 'Shi Yunxi', 147, '2021-02-12', 86.92, 'hMUIXrEPJn');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1034, 'Lucille Mitchell', 131, '2023-05-30', 72.48, 'xiL0bHJdbD');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1035, 'Miyamoto Shino', 226, '2022-06-16', 36.01, 'gFGeL2djPD');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1036, 'Nakayama Ikki', 297, '2021-05-17', 66.33, 'FZ31LyzzhP');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1037, 'Maeda Hana', 274, '2021-06-14', 36.39, 'k1zi92OZbs');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1038, 'Ichikawa Miu', 266, '2022-12-02', 86.83, 'aJW8gGGViW');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1039, 'Wong Siu Wai', 144, '2020-05-24', 30.45, 'yWlW8Ubp4R');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1040, 'Edna Green', 260, '2022-04-22', 86.12, '2WFgB5XsiV');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1041, 'Siu Wing Sze', 285, '2020-03-04', 98.21, 'p047MMj8yN');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1042, 'Danielle Boyd', 159, '2021-06-07', 32, 'QYwkKfDjzZ');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1043, 'Elizabeth Ortiz', 287, '2023-12-07', 38.25, 'B6xyqQTipC');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1044, 'Miura Mitsuki', 90, '2023-06-07', 96.66, 'TeiB59PNH8');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1045, 'Glenn Morales', 164, '2022-04-03', 35.68, 'UeCRuhekCY');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1046, 'Chic Siu Wai', 98, '2020-01-04', 82.51, 'zgBpJQdPy1');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1047, 'Lam Tsz Ching', 226, '2021-01-02', 87.82, 'T6C8YkTWFO');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1048, 'Kong Sze Kwan', 156, '2020-08-02', 38.48, 'qOXiP33DqI');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1049, 'Ruby Moreno', 111, '2021-04-10', 43.56, 'V7F2cEvStA');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1050, 'Kong Xiaoming', 286, '2021-11-20', 95.53, 'Vw44zeEHa8');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1051, 'Kato Mitsuki', 114, '2023-10-31', 22.3, 'MBIfmudYzG');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1052, 'Peng Zhennan', 132, '2022-07-12', 42.66, 'XdyYV3Xisz');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1053, 'Goto Mai', 74, '2021-10-26', 57.74, 'kRKGkzKF3N');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1054, 'Wu Ziyi', 163, '2020-03-03', 52.68, 'o7ahAmcIia');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1055, 'Beverly Hill', 71, '2021-07-22', 24.8, '4ASIz3jmOV');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1056, 'Shirley Rice', 149, '2022-04-25', 79.51, 'HfxVj4pCX6');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1057, 'Han Lik Sun', 59, '2021-02-27', 40.33, 'DeliRqQFuy');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1058, 'Li Anqi', 73, '2021-04-06', 84.7, '2HjorbWRZs');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1059, 'Christina Young', 217, '2021-09-04', 72.98, 'xrsoUQ9lFk');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1060, 'Chen Jiehong', 166, '2023-11-25', 24.1, 'aifVw1K5gY');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1061, 'Richard Ortiz', 92, '2021-09-19', 24.16, 'rfk3MxUSeK');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1062, 'Tse Hiu Tung', 89, '2020-09-09', 89.15, 'QLL0p3GGZ8');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1063, '桌椅', 1, '2023-07-05', 1, '办公套件');
INSERT INTO `office_consumables` (`office_consumables_id`, `consumable_name`, `purchase_quantity`, `create_time`, `per_price`, `remark`) VALUES (1064, '1', 5, '2023-07-05', 5, '2');
COMMIT;

-- ----------------------------
-- Table structure for railway_mission_record
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=100005 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of railway_mission_record
-- ----------------------------
BEGIN;
INSERT INTO `railway_mission_record` (`company_name`, `mission_price`, `mission_origin`, `mission_destination`, `train_id`, `mission_begin_time`, `mission_finish_time`, `state`, `mission_id`) VALUES ('2', 3, '4', '5', '6', '2023-07-05', '2023-07-07', 1, 100003);
INSERT INTO `railway_mission_record` (`company_name`, `mission_price`, `mission_origin`, `mission_destination`, `train_id`, `mission_begin_time`, `mission_finish_time`, `state`, `mission_id`) VALUES ('SICHUAN', 5000, '四川', '重庆', '川渝500', '2023-07-05', '2023-07-05', 0, 100004);
COMMIT;

-- ----------------------------
-- Table structure for repair_worker_maintenance_records
-- ----------------------------
DROP TABLE IF EXISTS `repair_worker_maintenance_records`;
CREATE TABLE `repair_worker_maintenance_records` (
  `record_id` int NOT NULL AUTO_INCREMENT,
  `repair_worker_id` int DEFAULT NULL,
  `car_id` int DEFAULT NULL,
  `maintenance_date` char(10) DEFAULT NULL,
  `maintenance_description` varchar(255) DEFAULT NULL,
  `maintenance_cost` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of repair_worker_maintenance_records
-- ----------------------------
BEGIN;
INSERT INTO `repair_worker_maintenance_records` (`record_id`, `repair_worker_id`, `car_id`, `maintenance_date`, `maintenance_description`, `maintenance_cost`) VALUES (3, 2020, 202, '2023-07-05', '车坏咯', 0.00);
INSERT INTO `repair_worker_maintenance_records` (`record_id`, `repair_worker_id`, `car_id`, `maintenance_date`, `maintenance_description`, `maintenance_cost`) VALUES (5, 202001, 1, '2023-07-05', '', 0.00);
COMMIT;

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `resource_id` int NOT NULL AUTO_INCREMENT,
  `resource_name` varchar(50) DEFAULT NULL,
  `resource_use` varchar(255) DEFAULT NULL,
  `material_id` int DEFAULT NULL,
  PRIMARY KEY (`resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of resource
-- ----------------------------
BEGIN;
INSERT INTO `resource` (`resource_id`, `resource_name`, `resource_use`, `material_id`) VALUES (1, '钢圈', NULL, NULL);
INSERT INTO `resource` (`resource_id`, `resource_name`, `resource_use`, `material_id`) VALUES (3, '2', '2', 2);
INSERT INTO `resource` (`resource_id`, `resource_name`, `resource_use`, `material_id`) VALUES (6, '轮胎', '备胎', 3);
COMMIT;

-- ----------------------------
-- Table structure for staff
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of staff
-- ----------------------------
BEGIN;
INSERT INTO `staff` (`staff_id`, `staff_number`, `staff_name`, `gender`, `staff_age`, `staff_role`, `staff_time`, `salary`, `phone`, `staff_address`, `card_number`) VALUES (3, '20230007', '小明', '男', 24, '经理', '2023-07-05', 4500, '13700000000', '川大', '5555');
INSERT INTO `staff` (`staff_id`, `staff_number`, `staff_name`, `gender`, `staff_age`, `staff_role`, `staff_time`, `salary`, `phone`, `staff_address`, `card_number`) VALUES (5, '20230007', '李四', '0', 24, NULL, NULL, 7000, NULL, NULL, NULL);
INSERT INTO `staff` (`staff_id`, `staff_number`, `staff_name`, `gender`, `staff_age`, `staff_role`, `staff_time`, `salary`, `phone`, `staff_address`, `card_number`) VALUES (7, '20230007', '赵六', '0', 24, NULL, NULL, 8000, NULL, NULL, NULL);
INSERT INTO `staff` (`staff_id`, `staff_number`, `staff_name`, `gender`, `staff_age`, `staff_role`, `staff_time`, `salary`, `phone`, `staff_address`, `card_number`) VALUES (10, '20230007', '小黄', '0', 24, NULL, NULL, 5000, NULL, NULL, NULL);
INSERT INTO `staff` (`staff_id`, `staff_number`, `staff_name`, `gender`, `staff_age`, `staff_role`, `staff_time`, `salary`, `phone`, `staff_address`, `card_number`) VALUES (11, '20230008', '小红', '女', 26, '司机', '2023-07-03', 6000, '15555555555', '四川', '6666');
COMMIT;

-- ----------------------------
-- Table structure for transportation_mission_record
-- ----------------------------
DROP TABLE IF EXISTS `transportation_mission_record`;
CREATE TABLE `transportation_mission_record` (
  `mission_id` int NOT NULL AUTO_INCREMENT,
  `mission_create_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_finish_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_origin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `mission_destination` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `state` int DEFAULT NULL,
  PRIMARY KEY (`mission_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10000014 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of transportation_mission_record
-- ----------------------------
BEGIN;
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000000, '2023-06-05', '2023-07-05', '成都市郫都区华迪公司', NULL, 0);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000001, '2023-06-05', NULL, '成都市郫都区华迪公司', NULL, 0);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000002, '2023-06-05', NULL, '成都市郫都区京东分公司', NULL, 0);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000003, '2023-06-06', '2002-01-01', '成都市郫都区圆通分公司', '成都市郫都区京东分公司', 2);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000004, '2023-06-06', NULL, '成都市郫都区京东分公司', '成都市郫都区京东分公司', 1);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000005, '2023-06-06', NULL, '成都市郫都区京东分公司', '成都市郫都区京东分公司', 1);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000006, '3', '3', '3', '3', 0);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000007, '2023-07-03', NULL, '2', '2', 1);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000008, '2023-07-03', NULL, '成都市郫都区圆通分公司', '成都市郫都区京东分公司', 1);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000009, '2023-07-05', NULL, '1', '2', 1);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000010, '2023-07-05', NULL, '1', '', 1);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000011, '2023-07-05', NULL, '1', '2', 1);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000012, '2023-07-05', '2023-07-07', '2', '2', 2);
INSERT INTO `transportation_mission_record` (`mission_id`, `mission_create_time`, `mission_finish_time`, `mission_origin`, `mission_destination`, `state`) VALUES (10000013, '2023-07-06', '2023-07-07', '成都', '重庆', 0);
COMMIT;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` char(10) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `passwd` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of user_info
-- ----------------------------
BEGIN;
INSERT INTO `user_info` (`id`, `username`, `passwd`, `email`) VALUES ('0123456789', 'pzhlsm', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '000000@email.com');
COMMIT;

-- ----------------------------
-- Table structure for vehicle
-- ----------------------------
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of vehicle
-- ----------------------------
BEGIN;
INSERT INTO `vehicle` (`vehicle_id`, `vehicle_number`, `type_id`, `latest_use`, `status`, `supplier`, `plate`, `purpose`, `automobile_id`) VALUES (3, '20001', '1', '2023-07-04', 0, '大众', '川FAB222', '运输', 56);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
