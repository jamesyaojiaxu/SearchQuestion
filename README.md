# 项目介绍

小狗嗅题是一个搜题网站,项目采用 SpringBoot+Thymeleaf 开发

## 项目技术栈

### 后端技术栈

1.Spring Boot
2.MyBatis
3.MySQL

### 前端技术栈

1.HTML
2.CSS
3.JavaScript

## 项目效果图

![f9451eecc1c62389dd1c5a71fc416ba7.png](https://raw.githubusercontent.com/zxrdtcfvyguh/-SpringBoot-/main/image/1.png)
![d5f2ffdebdc7b9feb14c9482606ffadd.png](C:\Users\Administrator\Desktop\javaCode\SearchQuestion\image\d5f2ffdebdc7b9feb14c9482606ffadd.png)
![38fca9ea534e6751de0598fe14fd3883.png](C:\Users\Administrator\Desktop\javaCode\SearchQuestion\image\38fca9ea534e6751de0598fe14fd3883.png)
网站体验地址:http://81.70.93.5(因题库较小,请搜题时输入"计算机")

## 主要功能

题目搜索,分页显示,选项切割(实现每个选项换行显示),字符串过滤,访问日志记录

## Linux服务器部署方法

1.修改application.properties中的mysql配置
2.打包,生成文件SearchQuestion-0.0.1-SNAPSHOT.jar
3.在Linux上执行nohup java -jar xuexiaoyi-0.0.1.jar
4.访问网站(默认端口80)
