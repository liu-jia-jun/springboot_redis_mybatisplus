# 工程简介
> 这是一个使用 springboot + mybatisplus + redis + tymeleaf 为技术栈的小型项目,具体的配置请看application.properties配置文件

## 运行该项目

1. 第一步需要创建名为project的数据库并运行该项目下的project.sql文件
2. 启动LjjApplication主类中的main方法
3. 在浏览器中访问http://localhost:8080/
4. 在浏览器中页面的提示完成操作

**注意**
+ 在浏览器中访问时需要保证网络连通，因为访问图片需要网络
+ 在添加product商品时，需要注意添加数据的类型，
+ 在添加product商品图片时，图片地址需要网络地址进行存储

## 目录解析
+ config：配置类，配置redis相关配置
+ controller：控制层，负责请求分发
+ filter：过滤器，这里设置过滤器是为了，保证在访问时字符编码为utf-8
+ mapper：数据持久层
+ pojo：java bean  商品对象
+ service：服务层，主要用于对于请求的处理，写主要的逻辑代码
+ utils：工具包，redisutil类封装了springboot集成redis的操作，以方法的形式来返回执行
+ resources > mapper 用于存储mapper文件用于mybatis-plus中的特殊操作
+ resources > templates 用于存储html文件，属于视图部分