package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
@MapperScan("com.example.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("test");
        SpringApplication.run(DemoApplication.class, args);
    }

}
