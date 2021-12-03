package com.example.ljj.service;

import com.example.ljj.mapper.ProductMapper;
import com.example.ljj.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> selectAllProduct() {

        return productMapper.selectAllProduct();

    }

    @Override
    public Product selectProduct(Integer id) {

        return productMapper.selectById(id);
    }

    @Override
    public boolean deleteProductById(Integer id) {
        int i = productMapper.deleteById(id);
        return i > 0 ? true : false;
    }

    @Override
    public boolean updateProductById(Product product) {

        return product.updateById();
    }
}
