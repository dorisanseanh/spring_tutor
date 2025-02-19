package com.spring.service;

import com.spring.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
   void create(Category category);


}
