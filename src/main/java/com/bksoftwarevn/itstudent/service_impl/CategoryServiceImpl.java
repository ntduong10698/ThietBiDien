package com.bksoftwarevn.itstudent.service_impl;


import com.bksoftwarevn.itstudent.dao.CategoryDao;
import com.bksoftwarevn.itstudent.dao_impl.CategoryDaoImpl;
import com.bksoftwarevn.itstudent.model.Category;
import com.bksoftwarevn.itstudent.service.CategoryService;

import java.sql.SQLException;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = new CategoryDaoImpl();

    @Override
    public List<Category> findAll() throws SQLException {
        return categoryDao.findAll();
    }

    @Override
    public Category findById(int id) throws SQLException {
        // check nếu id > 0 thì sẽ thực hiện tìm kiếm.
        return id > 0 ? categoryDao.findById(id) : null;
    }

    @Override
    public Category insert(String name) throws SQLException {
        Category category = new Category();
        category.setName(name);
        category.setDeleted(false); // khi thêm mới thì trường deleted luôn mặc định là false
        return categoryDao.insert(category);
    }

    @Override
    public boolean update(Category category) throws SQLException {
        return category.getId() > 0 ? categoryDao.update(category) : false;
    }

    @Override
    public boolean deleted(int id) throws SQLException {
        return id > 0 ? categoryDao.delete(id) : false;
    }
}
