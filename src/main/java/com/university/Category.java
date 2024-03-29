package com.university;

public class Category {
    private int categoryId;
    private String title;
    
    
    public Category(int categoryId, String title) {
        this.categoryId = categoryId;
        this.title =  title;
    }


    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public int getCategoryId() {
        return this.categoryId;
    }
    public String getTitle() {
        return this.title;
    }


    @Override
    public String toString() {
        return this.categoryId + " | " + this.title;
    }
}
