package demo.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: VenkoXie
 * @Date: 2019/1/10 11:15
 * @Version 1.0
 * @Description: Spring Boot Hello 案例
 */
@RestController
public class HelloBookController {

    @RequestMapping(value = "/book/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello，《Spring Boot 2.x 核心技术实战 - 上 基础篇》！";
    }
}
