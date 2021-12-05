package com.example.ljj.service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ljj.mapper.ProductMapper;
import com.example.ljj.pojo.Product;
import com.example.ljj.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Autowired
    RedisUtil redisUtil;

    /**
     * @return
     */
    @Override
    public List<Product> selectAllProduct() {
        List<Product> products = new ArrayList<>();
        if (redisUtil.hasKey("products")) {
            System.out.println("+++++++++++++++key存在，从redis中取值");
            List<Object> products1 = redisUtil.lGet("products", 0, -1);
            for (Object product : products1) {
                Product product1 = JSON.parseObject((String) product, Product.class);
                products.add(product1);
            }
            System.out.println(products);
        } else {
            products = productMapper.selectAllProduct();
            for (Product product : products) {
                String json = JSON.toJSONString(product);
                redisUtil.lSet("products", json);
            }
        }
        return products;
    }

    @Override
    public List<Product> selectProductByKeyWord(String keyword) {
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", keyword);
        List<Product> products = productMapper.selectList(queryWrapper);
        return products;
    }

    @Override
    public Product selectProduct(Integer id) {

        return productMapper.selectById(id);
    }

    @Override
    public boolean deleteProductById(Integer id) {
        int i = productMapper.deleteById(id);
        redisUtil.del("products");
        return i > 0 ? true : false;
    }

    @Override
    public boolean updateProductById(Product product) {
        redisUtil.del("products");
        return product.updateById();
    }

    @Override
    public boolean insertProduct(Product product) {
        redisUtil.del("products");
        return productMapper.insert(product) > 0 ? true : false;
    }
}
