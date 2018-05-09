package com.test;


import com.test.DataSource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import java.util.Date;


@MapperScan("com.test.Dao")
@SpringBootApplication
@Import({DynamicDataSourceRegister.class})
public class SpringbootApplication extends SpringBootServletInitializer {
    public static final Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(SpringbootApplication.class);
    }

    public static void main(String args[]){
        logger.debug("SpringBootWeb开始启动");
        logger.info(new Date().toString());
        logger.info(new Date().toString().substring(8,12));
        SpringApplication.run(SpringbootApplication.class,args);
    }
}
