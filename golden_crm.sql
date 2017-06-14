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

 Date: 06/14/2017 23:07:19 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_user`(用户信息表)
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) NOT NULL COMMENT '用户账号',
  `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `update_at` datetime DEFAULT NULL COMMENT '修改时间',
  `realname` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系方式',
  `emp_no` varchar(40) DEFAULT NULL COMMENT '员工编号',
  `shop_id` int(11) DEFAULT NULL COMMENT '所属门店id',
  `is_alive` tinyint(11) DEFAULT '1' COMMENT '状态：0.无效，1.有效',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shop_name` (`name`) USING BTREE
) COMMENT '用户信息表' ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_role`(角色信息表)
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) COMMENT '角色信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_user_role_ref`(用户角色关系表)
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role_ref`;
CREATE TABLE `t_user_role_ref` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) COMMENT '用户角色关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_privilege`(权限信息表)
-- ----------------------------
DROP TABLE IF EXISTS `t_privilege`;
CREATE TABLE `t_privilege` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '权限名称',
  PRIMARY KEY (`id`)
) COMMENT '权限信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_role_privilege_ref`(角色权限关系表)
-- ----------------------------
DROP TABLE IF EXISTS `t_role_privilege_ref`;
CREATE TABLE `t_role_privilege_ref` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `privilege_id` int(11) DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) COMMENT '角色权限关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_shop`(门店信息表)
-- ----------------------------
DROP TABLE IF EXISTS `t_shop`;
CREATE TABLE `t_shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '门店名称',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `update_at` datetime DEFAULT NULL COMMENT '修改时间',
  `address` varchar(255) DEFAULT NULL COMMENT '联系地址',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系方式',
  `is_alive` tinyint(11) DEFAULT NULL COMMENT '状态：0.无效，1.有效',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name` (`name`) USING BTREE
) COMMENT '门店信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_attribute`(产品属性表)
-- ----------------------------
DROP TABLE IF EXISTS `t_attribute`;
CREATE TABLE `t_attribute` (
  `id` int(11) NOT NULL COMMENT '主键',
  `attribute_name` varchar(255) DEFAULT NULL COMMENT '属性名称',
  `type` int(11) DEFAULT '1' COMMENT '属性类型：1.下拉框，2.文本框',
  PRIMARY KEY (`id`),
  UNIQUE KEY `attribute_name` (`attribute_name`) USING BTREE
) COMMENT '产品属性表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_attribute_value`(产品属性值表)
-- ----------------------------
DROP TABLE IF EXISTS `t_attribute_value`;
CREATE TABLE `t_attribute_value` (
  `id` int(11) NOT NULL COMMENT '主键',
  `attribute_value` varchar(255) DEFAULT NULL COMMENT '属性值',
  `attribute_id` int(11) DEFAULT NULL COMMENT '属性id',
  PRIMARY KEY (`id`)
) COMMENT '产品属性值表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_category`(产品类型表)
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '类型名称',
  `sort` int(11) DEFAULT NULL COMMENT '顺序',
  PRIMARY KEY (`id`)
) COMMENT '产品类型表' ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_category_attribute`(产品类型属性表)
-- ----------------------------
DROP TABLE IF EXISTS `t_category_attribute`;
CREATE TABLE `t_category_attribute` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `attribute_id` int(11) DEFAULT NULL COMMENT '产品属性id',
  `category_id` int(11) DEFAULT NULL COMMENT '产品类型id',
  `is_alive` tinyint(4) DEFAULT '1' COMMENT '是否显示：0.不显示，1.显示',
  `sort` int(11) DEFAULT NULL COMMENT '顺序',
  PRIMARY KEY (`id`)
) COMMENT '产品类型属性表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `t_customer`(客户信息表)
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '客户姓名',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系方式',
  `address` varchar(255) DEFAULT NULL COMMENT '联系地址',
  `sex` tinyint(10) DEFAULT NULL COMMENT '性别：0.女，1.男',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `qq` varchar(20) DEFAULT NULL COMMENT 'QQ号',
  `comment` varchar(255) DEFAULT NULL COMMENT '备注',
  `is_alive` tinyint(4) DEFAULT NULL COMMENT '状态：0.无效，1.有效',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `update_at` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) COMMENT '客户信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_repare_order`(订单信息表)
-- ----------------------------
DROP TABLE IF EXISTS `t_repare_order`;
CREATE TABLE `t_repare_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(255) DEFAULT NULL COMMENT '订单编号',
  `status` int(11) DEFAULT NULL COMMENT '订单状态',
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建者id',
  `last_approve_user_id` int(11) DEFAULT NULL COMMENT '上一个审核者id',
  `approve_user_id` int(11) DEFAULT NULL COMMENT '当前审核者id',
  `delivery_at` datetime DEFAULT NULL COMMENT '交货日期',
  `delivery_type` int(11) DEFAULT NULL COMMENT '交货方式',
  `customer_id` int(11) DEFAULT NULL COMMENT '客户id',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `update_at` datetime DEFAULT NULL COMMENT '修改时间',
  `customer_name` varchar(255) DEFAULT NULL COMMENT '客户姓名',
  `customer_phone` varchar(255) DEFAULT NULL COMMENT '客户联系方式',
  `customer_phone_second` varchar(20) DEFAULT NULL COMMENT '客户联系方式2',
  `customer_address` varchar(255) DEFAULT NULL COMMENT '客户地址',
  `advance_payment_type` int(11) DEFAULT NULL COMMENT '预付款方式',
  `advance_payment` int(11) DEFAULT NULL COMMENT '预付款金额',
  `non_payment_type` int(11) DEFAULT NULL COMMENT '未付款方式',
  `non_payment` int(11) DEFAULT NULL COMMENT '未付款金额',
  `total_payment` int(11) DEFAULT NULL COMMENT '总金额',
  `shop_id` int(11) DEFAULT NULL COMMENT '所属门店id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no` (`order_no`) USING BTREE
) COMMENT '订单信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_repare_order_item`(订单产品关系表)
-- ----------------------------
DROP TABLE IF EXISTS `t_repare_order_item`;
CREATE TABLE `t_repare_order_item` (
  `id` int(11) NOT NULL COMMENT '主键',
  `repare_order_id` int(11) DEFAULT NULL COMMENT '订单id',
  `special_need` varchar(255) DEFAULT NULL COMMENT '维修内容',
  `image_desc` varchar(255) DEFAULT NULL COMMENT '外观描述',
  `comment` varchar(255) DEFAULT NULL COMMENT '特殊要求',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `update_at` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) COMMENT '订单产品关系表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_item_category_attribute`(订单类型属性表)
-- ----------------------------
DROP TABLE IF EXISTS `t_item_category_attribute`;
CREATE TABLE `t_item_category_attribute` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_item_id` int(11) DEFAULT NULL COMMENT '订单产品id',
  `category_id` int(11) DEFAULT NULL COMMENT '产品类型id',
  `category_name` varchar(100) DEFAULT NULL COMMENT '产品类型名称',
  `attribute_id` int(11) DEFAULT NULL COMMENT '产品属性id',
  `attribute_name` varchar(100) DEFAULT NULL COMMENT '产品属性名称',
  `real_value` varchar(255) DEFAULT NULL COMMENT '产品属性值',
  PRIMARY KEY (`id`)
) COMMENT '订单产品类型属性表' ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `t_repare_order_item_img`(订单产品图片信息表)
-- ----------------------------
DROP TABLE IF EXISTS `t_repare_order_item_img`;
CREATE TABLE `t_repare_order_item_img` (
  `id` int(11) NOT NULL COMMENT '主键',
  `img_path` varchar(255) DEFAULT NULL COMMENT '图片路径',
  `repare_order_item_id` int(11) DEFAULT NULL COMMENT '订单产品id',
  `repare_order_id` int(11) DEFAULT NULL COMMENT '订单id',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `update_at` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) COMMENT '订单产品图片信息表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `t_repare_order_operators`(审核流水表)
-- ----------------------------
DROP TABLE IF EXISTS `t_repare_order_operators`;
CREATE TABLE `t_repare_order_operators` (
  `id` int(11) NOT NULL COMMENT '主键',
  `repare_order_id` int(11) DEFAULT NULL COMMENT '维修订单id',
  `approve_user_id` int(11) DEFAULT NULL COMMENT '审核用户id',
  `operator_comment` varchar(255) DEFAULT NULL COMMENT '审核备注',
  `operator_status` int(11) DEFAULT NULL COMMENT '审核状态：0.拒绝，1.通过',
  `create_at` datetime DEFAULT NULL COMMENT '审核时间',
  PRIMARY KEY (`id`)
) COMMENT '审核流水表' ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;



-- ----------------------------
--  Records of `t_attribute`
-- ----------------------------
BEGIN;
INSERT INTO `t_attribute` VALUES 
('1', '品类', '1'), 
('2', '品牌', '1'), 
('3', '产品编号', '1'), 
('4', '尺寸', '1'), 
('5', '材质', '1'), 
('6', '颜色', '1'), 
('7', '肩带', '1'), 
('8', '配饰', '1'), 
('9', '独立编码', '1'), 
('10', '关联件', '1'), 
('11', '自带包装', '1'), 
('12', '快递', '1'), 
('13', '主石', '1'), 
('14', '配石', '1'), 
('15', '个性刻字', '1'), 
('16', '克重', '1'), 
('17', '长度', '1');
COMMIT;

-- ----------------------------
--  Records of `t_attribute_value`
-- ----------------------------
BEGIN;
INSERT INTO `t_attribute_value` VALUES 
('1', '10-15', '1'), 
('2', '15-20', '1');
COMMIT;

-- ----------------------------
--  Records of `t_category`
-- ----------------------------
BEGIN;
INSERT INTO `t_category` VALUES 
('1', '皮具', '1'), 
('2', '珠宝', '2'), 
('3', '腕表', '3'), 
('4', '定制', '4');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
