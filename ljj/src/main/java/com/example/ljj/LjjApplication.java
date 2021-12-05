package com.example.ljj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author asus
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.ljj.mapper")
@EnableCaching
public class LjjApplication {

    public static void main(String[] args) {
        SpringApplication.run(LjjApplication.class, args);
    }

}
