package com.example.ljj.service;

import com.example.ljj.mapper.ProductMapper;
import com.example.ljj.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductMapper productMapper;
    @Override
    public List<Product> selectAllProduct() {

       return productMapper.selectAllProduct();

    }
}
