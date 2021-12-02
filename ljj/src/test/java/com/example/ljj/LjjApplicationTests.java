package com.example.ljj;

import com.example.ljj.mapper.ProductMapper;
import com.example.ljj.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LjjApplicationTests {

    @Autowired(required = false)
    ProductMapper productMapper;

    @Test
    void contextLoads() {

        System.out.println(productMapper.selectById(1));
    }

}
