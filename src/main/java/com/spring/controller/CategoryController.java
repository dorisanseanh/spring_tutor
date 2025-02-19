package com.spring.controller;

import com.spring.entity.Category;
import com.spring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping("/api/public/categories")
    public List<Category> getCategory() {
        return categoryService.getAllCategories();
    }
    @PostMapping("/api/public/categories")
    public String addCategory(@RequestBody Category category) {
        categoryService.create(category);
        return "success";
    }

}
