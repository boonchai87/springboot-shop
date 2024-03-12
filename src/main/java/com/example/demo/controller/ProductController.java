package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/product")
public class ProductController {
    @GetMapping("/category/${categoryId}")
    public String category(String name){
        return "ok";
    }
}
