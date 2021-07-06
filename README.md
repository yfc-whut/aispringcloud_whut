# WHUT_Spring-Cloud
Java企业级开发课程大作业

开发环境
工具	版本或描述
jdk	1.8
IDE	2019.3.2
maven	3.6.0
mysql	8.0.16
layui	2.5.6
springboot	2.0.7
springcloud	Finchley.SR2

mysql脚本程序在项目中以及包含了


运行顺序
首先用docker打开mysql8.0.11,然后按照以下顺序执行操作：
eurekaserver --> configServer --> menu+order+user+account --> allclient

allzuul： 由于网关过滤器没有完善就不用打开了 如果要开的话 网站名：localhost:8060/Takeaway

aispringcloud-api：是实体类

