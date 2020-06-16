package com.bksoftwarevn.itstudent.controller;

import com.bksoftwarevn.itstudent.model.Category;
import com.bksoftwarevn.itstudent.service.CategoryService;
import com.bksoftwarevn.itstudent.service_impl.CategoryServiceImpl;

import java.util.List;

public class CategoryController {

    private CategoryService categoryService = new CategoryServiceImpl();

    public List<Category> findAll() {
        try {
            return categoryService.findAll();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Category findByid(int id) {
        try {
            return categoryService.findById(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Category insert(String name) {
        try {
            return categoryService.insert(name);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean update(Category category) {
        try {
            return categoryService.update(category);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean delete(int id) {
        try {
            return categoryService.deleted(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
