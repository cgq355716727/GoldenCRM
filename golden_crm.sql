/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50710
 Source Host           : localhost
 Source Database       : golden_crm

 Target Server Type    : MySQL
 Target Server Version : 50710
 File Encoding         : utf-8

 Date: 06/08/2017 22:24:58 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_attribute`
-- ----------------------------
DROP TABLE IF EXISTS `t_attribute`;
CREATE TABLE `t_attribute` (
  `id` int(11) NOT NULL,
  `attribute_name` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT '1' COMMENT '1:select,2:text',
  PRIMARY KEY (`id`),
  UNIQUE KEY `attribute_name` (`attribute_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_attribute_value`
-- ----------------------------
DROP TABLE IF EXISTS `t_attribute_value`;
CREATE TABLE `t_attribute_value` (
  `id` int(11) NOT NULL,
  `attribute_value` varchar(255) DEFAULT NULL,
  `attribute_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_category`
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_category_attribute`
-- ----------------------------
DROP TABLE IF EXISTS `t_category_attribute`;
CREATE TABLE `t_category_attribute` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `attribute_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `is_alive` tinyint(4) DEFAULT '1' COMMENT '1,显示，0，不显示',
  `sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `t_customer`
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `sex` tinyint(10) DEFAULT NULL COMMENT 'male,female(性别)',
  `email` varchar(255) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL COMMENT '备注',
  `is_alive` tinyint(4) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_item_category_attribute`
-- ----------------------------
DROP TABLE IF EXISTS `t_item_category_attribute`;
CREATE TABLE `t_item_category_attribute` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_item_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `category_name` varchar(100) DEFAULT NULL,
  `attribute_id` int(11) DEFAULT NULL,
  `attribute_name` varchar(100) DEFAULT NULL,
  `real_value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `t_privilege`
-- ----------------------------
DROP TABLE IF EXISTS `t_privilege`;
CREATE TABLE `t_privilege` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_repare_order`
-- ----------------------------
DROP TABLE IF EXISTS `t_repare_order`;
CREATE TABLE `t_repare_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建者id',
  `last_approve_user_id` int(11) DEFAULT NULL COMMENT '最近一次的最后一次审批者',
  `approve_user_id` int(11) DEFAULT NULL COMMENT '当前需要审批的用户id',
  `delivery_at` datetime DEFAULT NULL COMMENT '交货日期',
  `delivery_type` int(11) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `customer_phone` varchar(255) DEFAULT NULL,
  `customer_phone_second` varchar(20) DEFAULT NULL,
  `customer_address` varchar(255) DEFAULT NULL,
  `advance_payment` int(11) DEFAULT NULL COMMENT '预付款',
  `non_payment` int(11) DEFAULT NULL COMMENT '未付款',
  `advance_payment_type` int(11) DEFAULT NULL,
  `non_payment_type` int(11) DEFAULT NULL,
  `total_payment` int(11) DEFAULT NULL COMMENT '总价',
  `shop_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no` (`order_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_repare_order_item`
-- ----------------------------
DROP TABLE IF EXISTS `t_repare_order_item`;
CREATE TABLE `t_repare_order_item` (
  `id` int(11) NOT NULL,
  `repare_order_id` int(11) DEFAULT NULL,
  `special_need` varchar(255) DEFAULT NULL,
  `image_desc` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_repare_order_item_img`
-- ----------------------------
DROP TABLE IF EXISTS `t_repare_order_item_img`;
CREATE TABLE `t_repare_order_item_img` (
  `id` int(11) NOT NULL,
  `img_path` varchar(255) DEFAULT NULL,
  `repare_order_item_id` int(11) DEFAULT NULL,
  `repare_order_id` int(11) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_repare_order_operators`
-- ----------------------------
DROP TABLE IF EXISTS `t_repare_order_operators`;
CREATE TABLE `t_repare_order_operators` (
  `id` int(11) NOT NULL,
  `repare_order_id` int(11) DEFAULT NULL,
  `approve_user_id` int(11) DEFAULT NULL,
  `operator_comment` varchar(255) DEFAULT NULL,
  `operator_status` int(11) DEFAULT NULL COMMENT '当前操作者的，操作状态（通过，拒绝）',
  `create_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_role_operation_ref`
-- ----------------------------
DROP TABLE IF EXISTS `t_role_operation_ref`;
CREATE TABLE `t_role_operation_ref` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `order_new` tinyint(4) DEFAULT '0' COMMENT '是否具有创建订单权限',
  `order_status` varchar(255) DEFAULT NULL COMMENT '具有操作订单的状态，使用","分隔',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `t_role_privilege_ref`
-- ----------------------------
DROP TABLE IF EXISTS `t_role_privilege_ref`;
CREATE TABLE `t_role_privilege_ref` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `privilege_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_shop`
-- ----------------------------
DROP TABLE IF EXISTS `t_shop`;
CREATE TABLE `t_shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `is_alive` tinyint(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `realname` varchar(255) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `emp_no` varchar(40) DEFAULT NULL COMMENT '员工编号',
  `shop_id` int(11) DEFAULT NULL,
  `is_alive` tinyint(11) DEFAULT '1' COMMENT '0,删除  1 有效',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shop_name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_user_role_ref`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role_ref`;
CREATE TABLE `t_user_role_ref` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

SET FOREIGN_KEY_CHECKS = 1;
