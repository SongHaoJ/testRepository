package com;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.bean.dao")
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
public class SpringbootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(SpringbootApplication.class);
    }

    public static void main(String args[]){
        SpringApplication.run(SpringbootApplication.class,args);

    }
}
