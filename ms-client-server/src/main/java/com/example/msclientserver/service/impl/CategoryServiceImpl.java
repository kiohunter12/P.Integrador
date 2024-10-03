package com.example.mscatalog.service.impl;

import com.example.mscatalog.entity.Category;
import com.example.mscatalog.repository.CategoryRepository;
import com.example.mscatalog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> list() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getById(Integer Id) {
        return categoryRepository.findById(Id);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category update(Integer Id, Category category) {
        category.setId(Id);
        return categoryRepository.save(category);
    }

    @Override
    public void delete(Integer Id) {
        categoryRepository.deleteById(Id);
    }
}
