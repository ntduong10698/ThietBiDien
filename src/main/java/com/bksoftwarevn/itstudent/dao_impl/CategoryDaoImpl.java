package com.bksoftwarevn.itstudent.dao_impl;

import com.bksoftwarevn.itstudent.dao.CategoryDao;
import com.bksoftwarevn.itstudent.model.Category;
import com.bksoftwarevn.itstudent.model.MyConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    private MyConnection myConnection = new MyConnection();

    //hàm dùng để đọc ra các trường trong resultSet để trả về đối tượng có các thuộc tính tương ứng
    @Override
    public Category getObject(ResultSet resultSet) throws SQLException {
        Category category = null;
        // Sử dụng contructor full tham số (int id , String name,boolean deleleted)
        //resultSet.getInt("tên cột") để lấy ra giá trị của tên cột tương ứng ví dụ resultSet.getInt("id") để lấy ra
        //giá trị cột id
        category = new Category(resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getBoolean("deleted"));
        return category;
    }

    @Override
    public List<Category> findAll() throws SQLException {
        List<Category> categoryList = new ArrayList<>();
        //select *(là lấy tất cả các trường) from category(là thực hiện với bảng nào) where deleted = false (chứa các điều kiện khi lấy)
        String sql = "select * from category where deleted = false"; //câu lệnh sql cần thực hiện để find all
        PreparedStatement preparedStatement = myConnection.prepar(sql); // lấy ra prepare dùng cho câu lệnh query
        ResultSet resultSet = preparedStatement.executeQuery(); // thực thi câu lệnh query và lấy resultSet trả về
        //resetSet.first() để đưa con trỏ resetSet về bản ghi đầu tiên lấy được nếu tồn tại trả về true, còn không thì false
        if(resultSet.first()) {
            do {
                Category category = getObject(resultSet);
                if(category != null) categoryList.add(category);
            } while (resultSet.next()); //.next() đưa con trỏ resultSet đến dòng kết tiếu nếu tồn tại trả về true, còn không thì false
        }
        return categoryList;
    }

    @Override
    public Category findById(int id) throws SQLException {
        Category category = null;
        String sql = "select * from category where deleted = false and id = ?";
        PreparedStatement preparedStatement = myConnection.prepar(sql);
        preparedStatement.setInt(1, id); // dùng để set giá trị vào index chấm hỏi tương ứng từ 1
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.first()) {
            category = getObject(resultSet);
        }
        return category;
    }

    @Override
    public Category insert(Category category) throws SQLException {
        return null;
    }

    @Override
    public boolean update(Category category) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }
}
