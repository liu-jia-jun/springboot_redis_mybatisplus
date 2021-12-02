package com.example.ljj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProduceController {

    @GetMapping("index")
    public String toIndex(){



        return "index";
    }




}
