# 毕业设计-基于SSM框架的教务管理系统

#### 摘要
随着中国教育体制的不断改革与完善，学校的学生教师管理员等对互联网的使用也越来越频繁。随着学生与教师数量的不断增多，教务管理的容量，安全性，便捷性显得尤为重要。传统的人工管理的劣势也慢慢显现出来，但是其中的一优点还需要继续采纳，所以传统的人工与计算机的结合成为了目前的主流。对此我开发了一套基于SSM框架的教务管理系统。
该系统采用的是Spring、SpringMVC、Mybatis、Shiro、LayUI、腾讯云。主要实现了用户的登录注册，公告的浏览，选课操作，不同的管理员对不同信息的管理，教师对课程评分，教师结课等功能。该系统我在完成基础功能的前提下完成了上线。我将MYSQL数据库以及TOMCAT服务器部署到了腾讯云上。并且将该系统打包成WAR包装载到了腾讯云主机上的TOMCAT中。同时，我使用Echart加入了可视化数据，进行简单的可视化操作。使用了流加载对通知公告进行显示。

关键词：教务；教务管理系统；云服务器；JAVA；SSM


#### 介绍
大学毕业了，记录一下我的毕业设计。

#### 软件架构
项目框架我采用的是：Spring+springMVC+Mybatis+Shiro+Layui+Tomcat
操作系统：Windows
数据库：Mysql8.0.16
服务器：Tomcat8.5.38
开发工具：IntelliJ IDEA 、Navicat for Mysql、Xftp 7、腾讯云
JDK版本：JDK version1.8.0
安全框架：Shiro
UI框架: Layui


#### 使用说明  目前云服务器已经过期了，没有续，下面的操作仅供参考，没有实际效果
公网IP:152.136.114.177

在云服务器的tomcat下将war包改名为EAS.war

http://www.zhangqingeas.online/EAS/easLogin/login

Mysql查看状态service mysqld status
Mysql启动systemctl start mysqld.service

Tomcat启动tomcat8/bin/startup.sh
Tomcat结束tomcat8/bin/shutdown.sh


#### 密码说明(数据丢失了，这部分可能不太准确)

超级管理员
admin
123456
课程管理员
kechengadmin
123456
通知管理员
tongzhiadmin
123456

学生
201703204000->后面为依次+1
Zhang1998

教师
201703101001->后面为依次+1
Zhang1998

-**-
补充
管理员：admin 123456
学生：zhangsan 123456
教师：wangliu 123456
-**-