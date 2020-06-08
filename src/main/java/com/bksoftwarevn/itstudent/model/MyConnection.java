package com.bksoftwarevn.itstudent.model;

import com.bksoftwarevn.itstudent.common.AppConfig;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    public static Connection connection = null;

    //kiểm tra driver jdbc đã tồn tại trong project dedekeet nối
    public void driverTest() throws ClassNotFoundException {
        try {
            Class.forName(AppConfig.DRIVER);
        } catch (ClassNotFoundException ex) {
            throw new ClassNotFoundException("JDBC Driver not found" + ex.getMessage());
        }
    }

    // hàm để kết nối database
    public Connection connectDB() throws ClassNotFoundException, SQLException {
        driverTest();
        try {
            //cú pháp kết nối datanase
            connection = DriverManager.getConnection(AppConfig.URL_DATABASE, AppConfig.USERNAME, AppConfig.PASSWORD);
            if (connection != null) System.out.println("Connect DB successfully");
        } catch (Exception e) {
            throw new SQLException("Connect DB fail " + e.getMessage());
        }
        return connection;
    }

    // đóng kết nối database
    public void closeConnection() throws SQLException {
        if(connection != null) {
            connection.close();
            System.out.println("Connection is closed");
        }
    }
}
