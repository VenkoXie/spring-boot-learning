package demo.springboot.web;

import demo.springboot.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: VenkoXie
 * @Date: 2019/1/10 11:46
 * @Version 1.0
 * @Description:
 */
@RestController
public class HelloBookController {

    @Autowired
    BookProperties bookProperties;

    @GetMapping("/book/hello")
    public String sayHello(){
        return "Hello,      " + bookProperties.getWriter() + " is writing " + bookProperties.getName() + "!";
    }
}
