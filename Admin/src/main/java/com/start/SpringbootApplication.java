package com.start;



import com.bean.dataSource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;


@MapperScan("com.bean.dao")
@SpringBootApplication
/*@Import({DynamicDataSourceRegister.class})*/
@EnableScheduling
public class SpringbootApplication extends SpringBootServletInitializer {
    public static final Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(SpringbootApplication.class);
    }

    public static void main(String args[]){
        SpringApplication.run(SpringbootApplication.class,args);
    }
}
