package com.university;

import java.util.ArrayList;
import java.util.List;

public class PurchaseHistory {
    private List<Purchase> purchases;

    public PurchaseHistory() {
        this.purchases = new ArrayList<Purchase>();
    }

    public void addPurchase(Purchase newPurchase) {
        this.purchases.add(newPurchase);
    }

    public List<Purchase> getPurchases() {
        return new ArrayList<>(this.purchases);
    }

    public Purchase getPurchaseById(int purchaseId) {
        for(Purchase purchase : this.purchases) {
            if(purchase.getPurchaseId() == purchaseId) {
                return purchase;
            }
        }

        return null;
    }

    public void printPurchases() {
        for(Purchase purchase : this.purchases) {
            System.out.println(purchase.toString());
        }
    }
}
