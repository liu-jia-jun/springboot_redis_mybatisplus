package com.example.ljj.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.math.BigDecimal;

@TableName(value = "test_product")
public class Product  {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "numbers")
    private Integer numbers;
    @TableField(value = "category")
    private String category;
    @TableField(value = "brand")
    private String brand;
    @TableField(value = "sales")
    private Integer sales;
    @TableField(value = "univalence")
    private BigDecimal univalence;
    @TableField(value = "imgurl")
    private String imgurl;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numbers=" + numbers +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", sales=" + sales +
                ", univalence=" + univalence +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public BigDecimal getUnivalence() {
        return univalence;
    }

    public void setUnivalence(BigDecimal univalence) {
        this.univalence = univalence;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
