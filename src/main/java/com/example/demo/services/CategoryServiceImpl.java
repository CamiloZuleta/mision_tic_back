package com.example.demo.services;

import com.example.demo.persistence.entities.Category;
import com.example.demo.persistence.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements EntityService<Category>{
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category saveEntity(Category entity) {
        boolean cumple = entity.getDescription().length()<=250 && entity.getNombre().length() <=45;
        if (cumple){
            return categoryRepository.save(entity);
        }
        return new Category(null, null);
    }

    @Override
    public List<Category> getEntity() {
        return categoryRepository.findAll();
    }
}
