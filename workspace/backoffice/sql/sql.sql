/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : basedb01

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-14 16:47:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for carousel
-- ----------------------------
DROP TABLE IF EXISTS `carousel`;
CREATE TABLE `carousel` (
  `caid` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) NOT NULL COMMENT '公司的唯一标识',
  `name` varchar(50) DEFAULT NULL,
  `short_description` varchar(500) DEFAULT NULL,
  `description` text,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`caid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carousel
-- ----------------------------

-- ----------------------------
-- Table structure for carouselinfo
-- ----------------------------
DROP TABLE IF EXISTS `carouselinfo`;
CREATE TABLE `carouselinfo` (
  `caiid` bigint(20) NOT NULL AUTO_INCREMENT,
  `caid` bigint(20) NOT NULL,
  `img_url` varchar(200) DEFAULT NULL,
  `link_url` varchar(200) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`caiid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carouselinfo
-- ----------------------------

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `cid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '公司的唯一标识',
  `name` varchar(20) DEFAULT NULL COMMENT '公司名称',
  `description` varchar(500) DEFAULT NULL COMMENT '公司介绍',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('18', '炼心之旅公司', '本公司是测试公司，哈哈', '2018-04-11 11:27:30', '2018-04-12 17:14:46');

-- ----------------------------
-- Table structure for companyemployeeinfo
-- ----------------------------
DROP TABLE IF EXISTS `companyemployeeinfo`;
CREATE TABLE `companyemployeeinfo` (
  `ceiid` bigint(20) NOT NULL AUTO_INCREMENT,
  `eid` bigint(20) NOT NULL COMMENT '职工唯一标识',
  `cid` bigint(20) NOT NULL COMMENT '公司的唯一标识',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`ceiid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of companyemployeeinfo
-- ----------------------------
INSERT INTO `companyemployeeinfo` VALUES ('1', '5', '18', null, null);
INSERT INTO `companyemployeeinfo` VALUES ('2', '6', '18', '2018-04-12 13:23:29', null);
INSERT INTO `companyemployeeinfo` VALUES ('3', '7', '18', '2018-04-12 13:23:41', null);
INSERT INTO `companyemployeeinfo` VALUES ('4', '8', '18', '2018-04-12 13:23:48', null);
INSERT INTO `companyemployeeinfo` VALUES ('5', '9', '18', '2018-04-12 13:23:54', null);
INSERT INTO `companyemployeeinfo` VALUES ('6', '10', '18', '2018-04-12 13:24:01', null);
INSERT INTO `companyemployeeinfo` VALUES ('7', '11', '18', '2018-04-12 13:24:08', null);
INSERT INTO `companyemployeeinfo` VALUES ('8', '12', '18', '2018-04-12 13:24:14', null);
INSERT INTO `companyemployeeinfo` VALUES ('9', '13', '18', '2018-04-12 13:24:20', null);
INSERT INTO `companyemployeeinfo` VALUES ('10', '14', '18', '2018-04-12 13:24:27', null);
INSERT INTO `companyemployeeinfo` VALUES ('11', '15', '18', '2018-04-12 13:24:32', null);

-- ----------------------------
-- Table structure for companyinfo
-- ----------------------------
DROP TABLE IF EXISTS `companyinfo`;
CREATE TABLE `companyinfo` (
  `ciid` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) NOT NULL COMMENT '公司的唯一标识',
  `address` varchar(100) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `mail` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`ciid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of companyinfo
-- ----------------------------
INSERT INTO `companyinfo` VALUES ('17', '18', '辽宁省大连市旅顺口区龙王塘街道，龙王塘壹号小区，一号楼2202', '0411-1234567', '0411-1234567', 'xiaosawuhen@hotmail.com', '2018-04-11 11:27:30', '2018-04-12 17:14:46');

-- ----------------------------
-- Table structure for credential
-- ----------------------------
DROP TABLE IF EXISTS `credential`;
CREATE TABLE `credential` (
  `crid` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) NOT NULL COMMENT '公司的唯一标识',
  `name` varchar(50) DEFAULT NULL COMMENT '证书名称',
  `img_url` varchar(100) DEFAULT NULL,
  `description` text,
  `end_date` date DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`crid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of credential
-- ----------------------------
INSERT INTO `credential` VALUES ('1', '18', 'test', '/static/18/wnnnn/6cbb60d0f703918f31df8012543d269758eec47c.jpg', 'testtest', '2018-04-30', null, null);
INSERT INTO `credential` VALUES ('2', '18', 'test001', '/static/18/wnnnn/timg.jpg', 'asdf', '2018-04-26', '2018-04-12 13:09:03', null);
INSERT INTO `credential` VALUES ('3', '18', 'test002', '/static/18/wnnnn/123.jpg', 'sasdf', '2018-04-10', '2018-04-12 13:19:36', null);
INSERT INTO `credential` VALUES ('4', '18', 'test003', '/static/18/wnnnn/123.jpg', 'sasdf', '2018-04-10', '2018-04-12 13:19:44', null);
INSERT INTO `credential` VALUES ('5', '18', 'test002', '/static/18/wnnnn/123.jpg', 'asdf', '2018-04-10', '2018-04-12 13:20:42', null);
INSERT INTO `credential` VALUES ('6', '18', 'test002', '/static/18/wnnnn/123.jpg', 'asdf', '2018-04-10', '2018-04-12 13:20:45', null);
INSERT INTO `credential` VALUES ('7', '18', 'test002', '/static/18/wnnnn/123.jpg', 'asdf', '2018-04-10', '2018-04-12 13:20:47', null);

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `cid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(50) DEFAULT NULL COMMENT '用户名称',
  `age` smallint(6) DEFAULT NULL COMMENT '用户年龄',
  `sex` varchar(1) DEFAULT NULL COMMENT '性别',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'test', null, null, null, null);

-- ----------------------------
-- Table structure for customercompanyinfo
-- ----------------------------
DROP TABLE IF EXISTS `customercompanyinfo`;
CREATE TABLE `customercompanyinfo` (
  `cciid` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) NOT NULL COMMENT '用户ID',
  `ccid` bigint(20) NOT NULL COMMENT '公司的唯一标识',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`cciid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customercompanyinfo
-- ----------------------------

-- ----------------------------
-- Table structure for customerestimateinfo
-- ----------------------------
DROP TABLE IF EXISTS `customerestimateinfo`;
CREATE TABLE `customerestimateinfo` (
  `ceiid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `cid` bigint(20) NOT NULL COMMENT '用户ID',
  `celid` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`ceiid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customerestimateinfo
-- ----------------------------

-- ----------------------------
-- Table structure for customerestimatelevel
-- ----------------------------
DROP TABLE IF EXISTS `customerestimatelevel`;
CREATE TABLE `customerestimatelevel` (
  `celid` bigint(20) NOT NULL AUTO_INCREMENT,
  `grade` bigint(20) DEFAULT NULL COMMENT '评价分数',
  `type` varchar(10) DEFAULT NULL COMMENT '评价类型',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`celid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customerestimatelevel
-- ----------------------------

-- ----------------------------
-- Table structure for customerinfo
-- ----------------------------
DROP TABLE IF EXISTS `customerinfo`;
CREATE TABLE `customerinfo` (
  `ciid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '客户详细信息ID',
  `cid` bigint(20) NOT NULL COMMENT '用户ID',
  `alias_name` varchar(20) DEFAULT NULL COMMENT '别名',
  `img_url` varchar(100) DEFAULT NULL,
  `pwd` varchar(50) DEFAULT NULL COMMENT '密码',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`ciid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customerinfo
-- ----------------------------
INSERT INTO `customerinfo` VALUES ('1', '1', 'test', null, '698d51a19d8a121ce581499d7b701668', '', null, null, null);

-- ----------------------------
-- Table structure for customerlevel
-- ----------------------------
DROP TABLE IF EXISTS `customerlevel`;
CREATE TABLE `customerlevel` (
  `clid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `level` int(11) DEFAULT NULL COMMENT '级别标识',
  `name` varchar(25) DEFAULT NULL COMMENT '级别名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`clid`),
  UNIQUE KEY `level` (`level`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customerlevel
-- ----------------------------

-- ----------------------------
-- Table structure for customerlevelinfo
-- ----------------------------
DROP TABLE IF EXISTS `customerlevelinfo`;
CREATE TABLE `customerlevelinfo` (
  `cliid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `cid` bigint(20) NOT NULL COMMENT '用户ID',
  `clid` bigint(20) NOT NULL COMMENT '流水号',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`cliid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customerlevelinfo
-- ----------------------------

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `eid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '职工唯一标识',
  `name` varchar(20) DEFAULT NULL COMMENT '职工姓名',
  `age` int(11) DEFAULT NULL COMMENT '职工年龄',
  `sex` varchar(1) DEFAULT NULL COMMENT '职工性别',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('5', 'Wang Nan Nan', null, '1', '2018-04-11 15:30:44', '2018-04-12 10:32:54');
INSERT INTO `employee` VALUES ('6', 'test002', null, '1', '2018-04-12 13:23:29', null);
INSERT INTO `employee` VALUES ('7', 'test003', null, '1', '2018-04-12 13:23:41', null);
INSERT INTO `employee` VALUES ('8', 'test004', null, '1', '2018-04-12 13:23:48', null);
INSERT INTO `employee` VALUES ('9', 'test005', null, '1', '2018-04-12 13:23:54', null);
INSERT INTO `employee` VALUES ('10', 'test006', null, '1', '2018-04-12 13:24:01', null);
INSERT INTO `employee` VALUES ('11', 'test007', null, '1', '2018-04-12 13:24:08', null);
INSERT INTO `employee` VALUES ('12', 'test008', null, '1', '2018-04-12 13:24:14', null);
INSERT INTO `employee` VALUES ('13', 'test009', null, '1', '2018-04-12 13:24:20', null);
INSERT INTO `employee` VALUES ('14', 'test0010', null, '1', '2018-04-12 13:24:27', null);
INSERT INTO `employee` VALUES ('15', 'test0011', null, '1', '2018-04-12 13:24:32', null);

-- ----------------------------
-- Table structure for employeeinfo
-- ----------------------------
DROP TABLE IF EXISTS `employeeinfo`;
CREATE TABLE `employeeinfo` (
  `eiid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '员工ID',
  `eid` bigint(20) NOT NULL COMMENT '职工唯一标识',
  `alias_name` varchar(20) DEFAULT NULL COMMENT '员工别名',
  `img_url` varchar(100) DEFAULT NULL,
  `pwd` varchar(50) DEFAULT NULL COMMENT '员工密码',
  `phone` varchar(20) DEFAULT NULL COMMENT '员工手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '员工邮箱',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`eiid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employeeinfo
-- ----------------------------
INSERT INTO `employeeinfo` VALUES ('2', '5', 'wnnnn', '/static/18/wnnnn/6cbb60d0f703918f31df8012543d269758eec47c.jpg', 'e10adc3949ba59abbe56e057f20f883e', 'wnnnn', 'xiaosawuhen@hotmail.com', '2018-04-11 15:30:44', '2018-04-12 10:32:54');
INSERT INTO `employeeinfo` VALUES ('3', '6', 'test002', '/static/18/wnnnn/timg.jpg', 'e10adc3949ba59abbe56e057f20f883e', '123asdf', 'asdf@adsf.com', '2018-04-12 13:23:29', null);
INSERT INTO `employeeinfo` VALUES ('4', '7', 'test003', '/static/18/wnnnn/timg.jpg', 'e10adc3949ba59abbe56e057f20f883e', '123asdf', 'asdf@adsf.com', '2018-04-12 13:23:41', null);
INSERT INTO `employeeinfo` VALUES ('5', '8', 'test004', '/static/18/wnnnn/timg.jpg', 'e10adc3949ba59abbe56e057f20f883e', '123asdf', 'asdf@adsf.com', '2018-04-12 13:23:48', null);
INSERT INTO `employeeinfo` VALUES ('6', '9', 'test005', '/static/18/wnnnn/timg.jpg', 'e10adc3949ba59abbe56e057f20f883e', '123asdf', 'asdf@adsf.com', '2018-04-12 13:23:54', null);
INSERT INTO `employeeinfo` VALUES ('7', '10', 'test006', '/static/18/wnnnn/timg.jpg', 'e10adc3949ba59abbe56e057f20f883e', '123asdf', 'asdf@adsf.com', '2018-04-12 13:24:01', null);
INSERT INTO `employeeinfo` VALUES ('8', '11', 'test007', '/static/18/wnnnn/timg.jpg', 'e10adc3949ba59abbe56e057f20f883e', '123asdf', 'asdf@adsf.com', '2018-04-12 13:24:08', null);
INSERT INTO `employeeinfo` VALUES ('9', '12', 'test008', '/static/18/wnnnn/timg.jpg', 'e10adc3949ba59abbe56e057f20f883e', '123asdf', 'asdf@adsf.com', '2018-04-12 13:24:14', null);
INSERT INTO `employeeinfo` VALUES ('10', '13', 'test009', '/static/18/wnnnn/timg.jpg', 'e10adc3949ba59abbe56e057f20f883e', '123asdf', 'asdf@adsf.com', '2018-04-12 13:24:20', null);
INSERT INTO `employeeinfo` VALUES ('11', '14', 'test0010', '/static/18/wnnnn/timg.jpg', 'e10adc3949ba59abbe56e057f20f883e', '123asdf', 'asdf@adsf.com', '2018-04-12 13:24:27', null);
INSERT INTO `employeeinfo` VALUES ('12', '15', 'test0011', '/static/18/wnnnn/timg.jpg', 'e10adc3949ba59abbe56e057f20f883e', '123asdf', 'asdf@adsf.com', '2018-04-12 13:24:32', null);

-- ----------------------------
-- Table structure for employeelevel
-- ----------------------------
DROP TABLE IF EXISTS `employeelevel`;
CREATE TABLE `employeelevel` (
  `elid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '员工级别ID',
  `level` varchar(1) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`elid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employeelevel
-- ----------------------------

-- ----------------------------
-- Table structure for employeelevelinfo
-- ----------------------------
DROP TABLE IF EXISTS `employeelevelinfo`;
CREATE TABLE `employeelevelinfo` (
  `eliid` bigint(20) NOT NULL AUTO_INCREMENT,
  `elid` bigint(20) NOT NULL COMMENT '员工级别ID',
  `edi` bigint(20) NOT NULL COMMENT '职工唯一标识',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`eliid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employeelevelinfo
-- ----------------------------

-- ----------------------------
-- Table structure for employeestatus
-- ----------------------------
DROP TABLE IF EXISTS `employeestatus`;
CREATE TABLE `employeestatus` (
  `esid` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` varchar(1) DEFAULT NULL COMMENT '1:在职\r\n2:离职\r\n3:休假',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`esid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employeestatus
-- ----------------------------

-- ----------------------------
-- Table structure for employeestatusinfo
-- ----------------------------
DROP TABLE IF EXISTS `employeestatusinfo`;
CREATE TABLE `employeestatusinfo` (
  `esiid` bigint(20) NOT NULL AUTO_INCREMENT,
  `esid` bigint(20) NOT NULL,
  `edi` bigint(20) NOT NULL COMMENT '职工唯一标识',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`esiid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employeestatusinfo
-- ----------------------------

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `nid` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) NOT NULL COMMENT '公司的唯一标识',
  `title` varchar(20) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', '18', 'news01', 'news011', '2018-04-12 17:10:44', '2018-04-12 17:37:30');
INSERT INTO `news` VALUES ('2', '18', 'news02', 'news02', '2018-04-12 17:10:49', null);

-- ----------------------------
-- Table structure for newsinfo
-- ----------------------------
DROP TABLE IF EXISTS `newsinfo`;
CREATE TABLE `newsinfo` (
  `niid` bigint(20) NOT NULL AUTO_INCREMENT,
  `nid` bigint(20) NOT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`niid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of newsinfo
-- ----------------------------
INSERT INTO `newsinfo` VALUES ('1', '1', '/static/18/wnnnn/timg.jpg', '2018-04-12 17:10:44', '2018-04-12 17:37:30');
INSERT INTO `newsinfo` VALUES ('2', '2', '/static/18/wnnnn/timg.jpg', '2018-04-12 17:10:49', null);

-- ----------------------------
-- Table structure for partnerinfo
-- ----------------------------
DROP TABLE IF EXISTS `partnerinfo`;
CREATE TABLE `partnerinfo` (
  `piid` bigint(20) NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) NOT NULL,
  `img_url` varchar(200) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`piid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of partnerinfo
-- ----------------------------

-- ----------------------------
-- Table structure for partners
-- ----------------------------
DROP TABLE IF EXISTS `partners`;
CREATE TABLE `partners` (
  `pid` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) NOT NULL COMMENT '公司的唯一标识',
  `name` varchar(50) DEFAULT NULL,
  `description` text,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of partners
-- ----------------------------

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `pid` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL COMMENT '项目名称',
  `description` varchar(500) DEFAULT NULL COMMENT '项目描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`pid`),
  KEY `cid` (`cid`),
  CONSTRAINT `project_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `company` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('1', '18', 'test', 'asdf', null, '2018-04-12 11:29:17');
INSERT INTO `project` VALUES ('2', '18', 'test001', 'asdf', '2018-04-12 13:26:26', null);
INSERT INTO `project` VALUES ('3', '18', 'test002', 'asdf', '2018-04-12 13:26:30', null);
INSERT INTO `project` VALUES ('4', '18', 'test003', 'asdf', '2018-04-12 13:26:36', null);
INSERT INTO `project` VALUES ('5', '18', 'test004', 'asdf', '2018-04-12 13:26:40', null);
INSERT INTO `project` VALUES ('6', '18', 'test005', 'asdf', '2018-04-12 13:26:44', null);

-- ----------------------------
-- Table structure for projectemployeeinfo
-- ----------------------------
DROP TABLE IF EXISTS `projectemployeeinfo`;
CREATE TABLE `projectemployeeinfo` (
  `peiid` bigint(20) NOT NULL AUTO_INCREMENT,
  `edi` bigint(20) NOT NULL COMMENT '职工唯一标识',
  `pid` bigint(20) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`peiid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projectemployeeinfo
-- ----------------------------

-- ----------------------------
-- Table structure for projectinfo
-- ----------------------------
DROP TABLE IF EXISTS `projectinfo`;
CREATE TABLE `projectinfo` (
  `piid` bigint(20) NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) NOT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`piid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projectinfo
-- ----------------------------
INSERT INTO `projectinfo` VALUES ('1', '1', '/static/18/wnnnn/timg.jpg', '2018-04-13 08:00:00', '2018-04-12 08:00:00', null, '2018-04-12 11:29:17');
INSERT INTO `projectinfo` VALUES ('2', '2', '/static/18/wnnnn/123.jpg', '2018-04-10 08:00:00', '2018-05-03 08:00:00', '2018-04-12 13:26:26', null);
INSERT INTO `projectinfo` VALUES ('3', '3', '/static/18/wnnnn/123.jpg', '2018-04-10 08:00:00', '2018-05-03 08:00:00', '2018-04-12 13:26:30', null);
INSERT INTO `projectinfo` VALUES ('4', '4', '/static/18/wnnnn/123.jpg', '2018-04-10 08:00:00', '2018-05-03 08:00:00', '2018-04-12 13:26:36', null);
INSERT INTO `projectinfo` VALUES ('5', '5', '/static/18/wnnnn/123.jpg', '2018-04-10 08:00:00', '2018-05-03 08:00:00', '2018-04-12 13:26:40', null);
INSERT INTO `projectinfo` VALUES ('6', '6', '/static/18/wnnnn/123.jpg', '2018-04-10 08:00:00', '2018-05-03 08:00:00', '2018-04-12 13:26:44', null);

-- ----------------------------
-- Table structure for serviceinfo
-- ----------------------------
DROP TABLE IF EXISTS `serviceinfo`;
CREATE TABLE `serviceinfo` (
  `siid` bigint(20) NOT NULL AUTO_INCREMENT,
  `sid` bigint(20) NOT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`siid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of serviceinfo
-- ----------------------------
INSERT INTO `serviceinfo` VALUES ('1', '1', '/static/18/wnnnn/timg.jpg', '2018-04-10 08:00:00', '2018-04-12 17:07:45', '2018-04-12 17:37:17');
INSERT INTO `serviceinfo` VALUES ('2', '2', null, '2018-04-10 08:00:00', '2018-04-12 17:07:52', null);
INSERT INTO `serviceinfo` VALUES ('3', '3', null, '2018-04-10 08:00:00', '2018-04-12 17:07:59', null);
INSERT INTO `serviceinfo` VALUES ('4', '4', null, '2018-04-10 08:00:00', '2018-04-12 17:08:49', null);

-- ----------------------------
-- Table structure for services
-- ----------------------------
DROP TABLE IF EXISTS `services`;
CREATE TABLE `services` (
  `sid` bigint(20) NOT NULL AUTO_INCREMENT,
  `cid` bigint(20) NOT NULL COMMENT '公司的唯一标识',
  `name` varchar(50) DEFAULT NULL COMMENT '服务名称',
  `description` varchar(500) NOT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of services
-- ----------------------------
INSERT INTO `services` VALUES ('1', '18', 'service01', 'service01', '2018-04-12 17:07:45', '2018-04-12 17:37:17');
INSERT INTO `services` VALUES ('2', '18', 'service02', 'service02', '2018-04-12 17:07:52', null);
INSERT INTO `services` VALUES ('3', '18', 'service03', 'service03', '2018-04-12 17:07:59', null);
INSERT INTO `services` VALUES ('4', '18', 'test001', 'service01', '2018-04-12 17:08:49', null);
