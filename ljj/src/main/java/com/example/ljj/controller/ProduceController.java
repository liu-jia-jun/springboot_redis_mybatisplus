package com.example.ljj.controller;

import com.example.ljj.pojo.Product;
import com.example.ljj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProduceController {

    @Autowired
    ProductService productService;


    @GetMapping("/")
    public String toIndex(){
        return "redirect:index";
    }


    @GetMapping("index")
    public String toIndex(Model model){

        List<Product> products = productService.selectAllProduct();


        model.addAttribute("products",products);
        return "index";
    }


    @GetMapping("/product/{id}")
    public String toProduct(@PathVariable(name = "id") Integer id, Model model){

        Product product = productService.selectProduct(id);
        model.addAttribute("product",product);
        return "product_edit";
    }

    @RequestMapping(value = "/product/update/{id}",consumes = "application/x-www-form-urlencoded",method = RequestMethod.POST)
    public String updateProduct(@PathVariable(name = "id")Integer id,
                                @RequestBody Product product){

        System.out.println("+++++++++id+++++++++"+id);
        System.out.println("+++++++++product+++++++++"+product);

        return "index";
    }



}
