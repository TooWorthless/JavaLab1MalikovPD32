package com.university;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<Product>();
    }


    public List<Product> getProducts() {
        return new ArrayList<>(this.products);
    }

    public Product getByTitle(String productTitle) {
        for(Product product : this.products) {
            if(product.getTitle() == productTitle) {
                return product;
            }
        }

        throw new Error("Incorrect title");
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void delProduct(int productId) {
        int counter = 0;
        for(Product product : this.products) {
            if(product.getProductId() == productId) {
                this.products.remove(counter);
                break;
            }

            counter++;
        }
    }


    public double getTotalPrice() {
        double totalPrice = 0;
        for(Product product : this.products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void clear() {
        this.products.clear();
    }


    public void printProducts() {
        for(Product product : this.products) {
            System.out.println(product.toString());
        }
    }
}
