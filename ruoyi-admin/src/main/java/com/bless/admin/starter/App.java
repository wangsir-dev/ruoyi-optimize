package com.bless.admin.starter;


import com.bless.common.annoations.EnableRequest;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.bless.web.controller"})
@ComponentScan(basePackages = {
        "com.bless"
})
@MapperScan(basePackages = {"com.bless.mapper"})
@EnableRequest
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
