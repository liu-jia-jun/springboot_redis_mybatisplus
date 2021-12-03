package com.example.ljj.controller;

import com.example.ljj.pojo.Product;
import com.example.ljj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProduceController {

    @Autowired
    ProductService productService;


    @GetMapping("/")
    public String toIndex() {
        return "redirect:index";
    }


    @GetMapping("index")
    public String toIndex(Model model) {

        List<Product> products = productService.selectAllProduct();


        model.addAttribute("products", products);
        return "index";
    }


    @GetMapping("/product/{id}")
    public String toProduct(@PathVariable(name = "id") Integer id, Model model) {

        Product product = productService.selectProduct(id);
        model.addAttribute("product", product);
        System.out.println(product);

        return "product_edit";
    }

    //    @RequestMapping(value = "/product/update/",consumes = "application/x-www-form-urlencoded",method = RequestMethod.POST)
//    @RequestMapping(value = "/product/update",method = RequestMethod.POST,
//            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
//            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @PostMapping(value = "/product/update", consumes = MediaType.ALL_VALUE)
    @ResponseBody
    public String updateProduct(@RequestBody Product product, CassandraProperties.Request request) {

        System.out.println("+++++++++product+++++++++" + product);

        boolean b = productService.updateProductById(product);
        return b == true ? "修改成功" : "修改失败";
    }

    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") Integer id) {

        boolean b = productService.deleteProductById(id);

        System.out.println(b);

        return "redirect:/index";
    }


}
