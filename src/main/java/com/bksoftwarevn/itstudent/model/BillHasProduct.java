package com.bksoftwarevn.itstudent.model;

public class BillHasProduct {

    private int productId;

    private int billId;

    private int quantity;

    private double producPrice;

    public BillHasProduct() {
    }

    public BillHasProduct(int productId, int billId, int quantity, double producPrice) {
        this.productId = productId;
        this.billId = billId;
        this.quantity = quantity;
        this.producPrice = producPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProducPrice() {
        return producPrice;
    }

    public void setProducPrice(double producPrice) {
        this.producPrice = producPrice;
    }

    @Override
    public String toString() {
        return "BillHasProduct{" +
                "productId=" + productId +
                ", billId=" + billId +
                ", quantity=" + quantity +
                ", producPrice=" + producPrice +
                '}';
    }
}
