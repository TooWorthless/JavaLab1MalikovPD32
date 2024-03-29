package com.university;

public class Product {
    private int productId;
    private String title;
    private double price;
    private String description;
    private Category productCategory;
    
    
    public Product(int productId, String title, double price, String description, Category productCategory) {
        this.productId = productId;
        this.title =  title;
        this.price = price;
        this.description = description;
        this.productCategory = productCategory;
    }


    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public int getProductId() {
        return this.productId;
    }
    public String getTitle() {
        return this.title;
    }
    public double getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
    public Category getCategory() {
        return this.productCategory;
    }


    @Override
    public String toString() {
        return this.productId + " | " + this.title + " | " + this.price + " | " + this.description + "\nProduct category - " + this.productCategory.toString();
    }
}
