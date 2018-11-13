###日志
a.springboot日志可以通过logging.level.*来设置,*可以是包也可以是某个类
b.也可以通过启动参数"--debug=true"来设置

    
    file: D:\IdeaProject\demo1\src\main\java\com\demo\log\UserDao.log
    path: D:\IdeaProject\demo1\src\main\java\com\demo\log 默认为spring.log
    pattern:
      console: 指定格式
c. 可以直接放logback.xml文件