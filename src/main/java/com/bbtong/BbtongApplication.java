package com.bbtong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.bbtong.Dao")
@SpringBootApplication
public class BbtongApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BbtongApplication.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BbtongApplication.class);
    }

//        @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return super.configure(application);
//    }

}
