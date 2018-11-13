###自己开发一个SpringBootStart步骤
1.需要一个配置类,配置类里面需要装备好提供出去的类

2.a.使用@Eable,使用@Import导入需要听过出去的类
  b.main\resources\META-INF\spring.factory
  org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.demo.redis.RedisAutoConfiguration