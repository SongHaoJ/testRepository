package com.bean;


import com.bean.dataSource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;


@MapperScan("com.bean.dao")
@SpringBootApplication

public class SpringbootApplication extends SpringBootServletInitializer {
    public static final Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

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

      Double d = 2d;
      Number n = d;
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
