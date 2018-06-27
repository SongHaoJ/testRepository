package com;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.math.BigDecimal;


@MapperScan("com.bean.dao")
@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer {
    private static final Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootApplication.class);
    }

    public static void main(String args[]) {
        logger.debug("SpringBootWeb开始启动");
        SpringApplication.run(SpringbootApplication.class, args);
        test();
    }


    public static void test() {

        BigDecimal d = new BigDecimal(2);
        Number n = d;
     int i = 1;
     int m = 2;
        System.out.println(n.intValue());
    }

    public static String upperCase(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }
}
