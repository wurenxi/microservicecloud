# 一些配置说明
## windows hosts文件添加配置
```hosts
# eureka
127.0.0.1	eureka7001.com
127.0.0.1	eureka7002.com
127.0.0.1	eureka7003.com

# zuul
127.0.0.1	myzuul.com

# Spring Cloud config
127.0.0.1	config-3344.com
127.0.0.1	client-config.com
```
## 数据库clouddb01/clouddb02/clouddb03
```sql
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8
```
