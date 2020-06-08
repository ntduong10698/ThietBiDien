package com.bksoftwarevn.itstudent.model;

import java.util.Date;

public class Product {

    private int id;

    private String name;

    private double price;

    private Date createDate;

    private boolean deleted;

    public Product() {
    }

    public Product(int id, String name, double price, Date createDate, boolean deleted) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createDate = createDate;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createDate=" + createDate +
                ", deleted=" + deleted +
                '}';
    }


}
