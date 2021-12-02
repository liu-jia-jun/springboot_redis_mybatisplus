package com.example.ljj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ljj.pojo.Product;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
