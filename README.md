# springcloudsubentry
一个非常简单的外卖点餐网站 是我在b站找到的难度适中可用来熟习springcloud的基本功能 提高其熟练度  并且对项目也做了些简单的优化 还有些图片
没有截图 所以就不展示了 

如果架包没有导入 则修改idea的maven地址和 jdk地址


B站地址：https://www.bilibili.com/video/av55629580?from=search&seid=12103622921973411221

### 开发环境
| 工具 | 版本或描述 |
----- | -----
| *jdk* | 1.8 |
| *IDE* | 2019.3.2|
| *maven* | 3.6.0 |
| *mysql* | 8.0.16 |
| *layui* | 2.5.6 |
| *springboot*| 2.0.7 |
| *springcloud*| Finchley.SR2 |
### 运行顺序 
 eurekaserver --> configServer -->  menu+order+user+account --> allclient
 
allzuul： 由于网关过滤器没有完善就不用打开了 如果要开的话 网站名：localhost:8060/Takeaway

aispringcloud-api：是实体类
### 项目截图
-  *登录页面*
![](https://github.com/SAO-rookie/springcloudsubentry/blob/master/pngs/%E6%89%B9%E6%B3%A8%202020-02-28%20221151.png)
#### 用户界面
-  *用户首页*
![](https://github.com/SAO-rookie/springcloudsubentry/blob/master/pngs/%E6%89%B9%E6%B3%A8%202020-02-28%20221223.png)
-  *用户查询订单页面*
![](https://github.com/SAO-rookie/springcloudsubentry/blob/master/pngs/%E6%89%B9%E6%B3%A8%202020-02-28%20221240.png)
#### 管理员界面 
-  *管理员首页*
![](https://github.com/SAO-rookie/springcloudsubentry/blob/master/pngs/%E6%89%B9%E6%B3%A8%202020-02-28%20221332.png)
-  *菜品添加*
![](https://github.com/SAO-rookie/springcloudsubentry/blob/master/pngs/%E6%89%B9%E6%B3%A8%202020-02-28%20221346.png)
-  *订单处理*
![](https://github.com/SAO-rookie/springcloudsubentry/blob/master/pngs/%E6%89%B9%E6%B3%A8%202020-02-28%20221420.png)
-  *查询用户*
![](https://github.com/SAO-rookie/springcloudsubentry/blob/master/pngs/%E6%89%B9%E6%B3%A8%202020-02-28%20221434.png)
-  *添加用户*
![](https://github.com/SAO-rookie/springcloudsubentry/blob/master/pngs/%E6%89%B9%E6%B3%A8%202020-02-28%20221447.png)
