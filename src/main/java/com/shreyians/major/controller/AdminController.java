package com.shreyians.major.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String adminHome(){
        return "adminHome";
    }
    @GetMapping("/admin/categories")
    public String getCat(){
        return "Categories";
    }
    @GetMapping("/admin/categories/add")
    public String getCatAdd(){
        return "CategoriesAdd";
    }
    @GetMapping("/admin/products")
    public String getproducts(){
        return "Products";
    }
}
