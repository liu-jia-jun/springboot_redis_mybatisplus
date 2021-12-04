package com.example.ljj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ljj.mapper.ProductMapper;
import com.example.ljj.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Resource
    RedisTemplate<String,Object> redisTemplate;

    @Override
    public List<Product> selectAllProduct() {

        

        return productMapper.selectAllProduct();

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

        return i > 0 ? true : false;
    }

    @Override
    public boolean updateProductById(Product product) {

        return product.updateById();
    }

    @Override
    public boolean insertProduct(Product product) {

       return productMapper.insert(product)>0 ? true:false;
    }
}
