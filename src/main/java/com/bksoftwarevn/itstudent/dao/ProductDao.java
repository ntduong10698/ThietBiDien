package com.bksoftwarevn.itstudent.dao;

import com.bksoftwarevn.itstudent.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao extends BaseDao<Product> {

    List<Product> sortByCreateDate() throws SQLException;
}
