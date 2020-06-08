package com.bksoftwarevn.itstudent.view;

import com.bksoftwarevn.itstudent.model.MyConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) {
        MyConnection myConnection = new MyConnection();
        try {
            Connection myConnect = myConnection.connectDB();
            String sql = "insert into product (name, price, create_date, deleted) value (?, ?, ?, ?)";
            PreparedStatement preparedStatement = myConnect.prepareStatement(sql);
            preparedStatement.setString(1, "Iphone 11");
            preparedStatement.setDouble(2, 20000);
            preparedStatement.setDate(3, new Date(new java.util.Date().getTime()));
            preparedStatement.setBoolean(4, false);
            int rs = preparedStatement.executeUpdate();
            if(rs > 0) System.out.println("Insert successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
