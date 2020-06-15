package com.bksoftwarevn.itstudent.view;

import com.bksoftwarevn.itstudent.dao.CategoryDao;
import com.bksoftwarevn.itstudent.dao_impl.CategoryDaoImpl;
import com.bksoftwarevn.itstudent.model.MyConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) {
        MyConnection myConnection = new MyConnection();
        CategoryDao categoryDao = new CategoryDaoImpl();
        try {
            Connection myConnect = myConnection.connectDB();
            System.out.println(categoryDao.findAll());
            System.out.println(categoryDao.findById(10));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
