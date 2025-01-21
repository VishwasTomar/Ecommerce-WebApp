package com.shreyians.major.service;

import com.shreyians.major.model.Category;
import com.shreyians.major.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    private Category category;

    public List<Category> getCategoryAll(){
        return categoryRepository.findAll();
    }
    public void addCategory(Category category){
        this.category = category;
        categoryRepository.save(category);
    }
    public void removeCategoryById(int id){
        categoryRepository.deleteById(id);
    }
    public Optional<Category> getCategoryById(int id){
        return categoryRepository.findById(id);
    }
}
