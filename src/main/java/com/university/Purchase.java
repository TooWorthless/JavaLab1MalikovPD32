package com.university;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
    private int purchaseId;
    private List<Product> products;
    private double totalPrice;

    public Purchase(int purchaseId, List<Product> products, double totalPrice) {
        this.purchaseId = purchaseId;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public int getPurchaseId() {
        return this.purchaseId;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(this.products);
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    @Override
    public String toString() {
        String productsString = "";
        for(Product product : this.products) {
            productsString += product.toString();
            productsString += "\n";
        }
        return this.purchaseId + "\n" + productsString + this.totalPrice;
    }
}
