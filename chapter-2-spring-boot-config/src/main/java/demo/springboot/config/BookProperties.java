package demo.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: VenkoXie
 * @Date: 2019/1/10 11:47
 * @Version 1.0
 * @Description:
 */
@Component
//@PropertySource(value = "classpath:application-dev.properties",encoding = "UTF-8" )
@PropertySource(value = {"classpath:person.properties"},encoding = "UTF-8" )
@ConfigurationProperties(prefix = "demo.book")
public class BookProperties {

    /**
     * 书名
     */
    //@Value("${demo.book.name}")
    //@Value("${name}")
    private String name;

    /**
     * 作者
     */
    //@Value("${demo.book.writer}")
    //@Value("${writer}")
    private String writer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
