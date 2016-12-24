package com.ace;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/9/28.
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan

public class Application {
    private static final Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class,args);
        logger.info("=======Application start Success========");
    }
}
