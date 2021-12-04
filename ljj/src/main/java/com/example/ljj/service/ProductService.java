package com.example.ljj.service;

import com.example.ljj.pojo.Product;

import java.util.List;

public interface ProductService {

    List<Product> selectAllProduct();

    Product selectProduct(Integer id);

    boolean deleteProductById(Integer id);

    boolean updateProductById(Product product);

    boolean insertProduct(Product product);

}
