package com.example.ljj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.ljj.mapper")
public class LjjApplication {

    public static void main(String[] args) {
        SpringApplication.run(LjjApplication.class, args);
    }

}
