-- 初始化数据库
CREATE TABLE `demo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `tinyint_demo` tinyint(4) NOT NULL,
  `smallint_demo` smallint(6) NOT NULL,
  `int_demo` int(11) NOT NULL,
  `bigint_demo` bigint(20) NOT NULL,
  `float_demo` float NOT NULL,
  `double_demo` double NOT NULL,
  `decimal_demo` decimal(10,0) NOT NULL,
  `char_demo` char(3) NOT NULL,
  `varchar_demo` varchar(45) NOT NULL,
  `date_demo` date NOT NULL,
  `time_demo` time NOT NULL,
  `date_time_demo` datetime NOT NULL,
  `time_stamp_demo` timestamp NOT NULL DEFAULT '2017-04-24 17:04:37',
  PRIMARY KEY (`id`)
);
