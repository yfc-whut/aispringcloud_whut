# springcloudsubentry
一个非常简单的外卖点餐网站 是我在b站找到的难度适中可用来熟习springcloud的基本功能 提高其熟练度  并且对项目也做了些简单的优化 还有些图片
没有截图 所以就不展示了 

如果架包没有导入 则修改idea的maven地址和 jdk地址

### 开发环境
| 工具 | 版本或描述 |
----- | -----
| *jdk* | 1.8 |
| *IDE* | 2020.3.2|
| *maven* | 3.6.0 |
| *mysql* | 8.0.16 |
| *layui* | 2.5.6 |
| *springboot*| 2.0.7 |
| *springcloud*| Finchley.SR2 |
### 运行顺序 


 eurekaserver --> configServer -->  menu+order+user+account --> allclient
 
allzuul： 由于网关过滤器没有完善就不用打开了 如果要开的话 网站名：localhost:8060/Takeaway

aispringcloud-api：是实体类

