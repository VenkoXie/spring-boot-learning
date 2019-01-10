package demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * @Author: VenkoXie
 * @Date: 2019/1/10 11:14
 * @Version 1.0
 * @Description: Spring Boot 应用启动类
 */
@SpringBootApplication
public class QuickStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickStartApplication.class,args);
    }

}
