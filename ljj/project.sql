/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 50730
Source Host           : localhost:3306
Source Database       : project

Target Server Type    : MYSQL
Target Server Version : 50730
File Encoding         : 65001

Date: 2021-12-08 10:38:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_product
-- ----------------------------
DROP TABLE IF EXISTS `test_product`;
CREATE TABLE `test_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '商品名称',
  `numbers` int(8) DEFAULT NULL COMMENT '商品库存',
  `category` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '商品类别',
  `brand` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `sales` int(8) DEFAULT NULL COMMENT '销售量',
  `univalence` int(8) DEFAULT NULL COMMENT '商品单价',
  `imgurl` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_product
-- ----------------------------
INSERT INTO `test_product` VALUES ('1', '大鸭', '798', '羽绒服', '上帝发誓', '213', '123', 'https://cdn.pixabay.com/photo/2016/08/21/23/59/gannet-1611079_960_720.jpg');
INSERT INTO `test_product` VALUES ('4', '印度神油', '1000', '成人用品', '印度', '999', '20', 'https://cdn.pixabay.com/photo/2021/11/14/18/16/woman-6795381_960_720.jpg');
INSERT INTO `test_product` VALUES ('10', '上的飞机啊是', '468', 'alskjdf', 'asdf', '432', '312', 'https://cdn.pixabay.com/photo/2021/11/27/12/16/mountain-6827881_960_720.jpg');
