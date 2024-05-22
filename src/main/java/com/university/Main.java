package com.university;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PurchaseHistory history = new PurchaseHistory();
        int purchaseCounter = 1;


        // System.out.println("\nCategories:");
        Category myCategory1 = new Category(1, "Category1Title");
        Category myCategory2 = new Category(2, "Category2Title");

        // System.out.println(myCategory1.toString());
        // System.out.println(myCategory2.toString());



        // System.out.println("\nProducts:");
        Product myProd = new Product(10, "MyProd1Title", 33.0, "Test product tuda suda", myCategory2);
        Product myProd2 = new Product(20, "MyProd2Title", 55.0, "Test product tuda suda", myCategory1);
        
        Product product1 = new Product(1, "Prod1Title", 100.0, "Test product tuda suda 1", myCategory1);
        Product product2 = new Product(2, "Prod2Title", 888.8, "Test product tuda suda 2", myCategory1);
        Product product3 = new Product(3, "Prod3Title", 69.32, "Test product tuda suda 3", myCategory2);
        Product product4 = new Product(4, "Prod4Title", 55.22, "Test product tuda suda 4", myCategory2);
        Product product5 = new Product(5, "Prod5Title", 77.0, "Test product tuda suda 5", myCategory1);
        

        
        // System.out.println(myProd.toString());
        System.out.println("\n");



        Cart myCart = new Cart();

        myCart.addProduct(myProd);
        myCart.addProduct(myProd2);
        myCart.printProducts();
        System.out.println("Total Price: " + myCart.getTotalPrice());

        try {
            System.out.println("\nFind by title:");
            System.out.println(myCart.getByTitle("MyProd2Title")+"\n");
        } catch (Exception e) {
            System.out.println("Error");
        }


        System.out.println("\n");


        myCart.delProduct(myProd.getProductId());
        myCart.printProducts();



        System.out.println("\n");



        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВиберіть опцію:");

            System.out.println("1 - Переглянути список товарів");
            System.out.println("2 - Додати товар до кошика");
            System.out.println("3 - Переглянути кошик");
            System.out.println("4 - Зробити замовлення");
            System.out.println("5 - Історія замовлень");
            System.out.println("0 - Вийти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(product1.toString());
                    System.out.println(product2.toString());
                    System.out.println(product3.toString());
                    System.out.println(product4.toString());
                    System.out.println(product5.toString());
                    break;

                case 2:
                    System.out.println("Введіть ID товару для додавання до кошика:");
                    int productId = scanner.nextInt();

                    if(productId == 1) myCart.addProduct(product1);
                    else if(productId == 2) myCart.addProduct(product2);
                    else if(productId == 3) myCart.addProduct(product3);
                    else if(productId == 4) myCart.addProduct(product4);
                    else if(productId == 5) myCart.addProduct(product5);
                    else System.out.println("Product ID out of range)");
                    break;

                case 3:
                    System.out.println("\n________________");
                    myCart.printProducts();
                    System.out.println("\n________________");
                    System.out.println("1 - Видалити товар за ID");
                    System.out.println("2 - Вийти з кошика");
                    int cartAction = scanner.nextInt();

                    if(cartAction == 1) {
                        System.out.println("Введіть ID товару для видалення:");
                        int productToDeleteId = scanner.nextInt();
                        myCart.delProduct(productToDeleteId);
                        System.out.println("Товар видалено");
                    }
                    else if(cartAction == 2) {
                        continue;
                    }

                    break;

                case 4:
                    if(myCart.getProducts().isEmpty()) {
                        System.out.println("Кошик порожній. Спочатку додайте до нього товари!");
                    }
                    else {
                        System.out.println("Замовлення оформленно!)");
                        history.addPurchase(
                            new Purchase(purchaseCounter, myCart.getProducts(), myCart.getTotalPrice())
                        );
                        myCart.clear();
                    }
                    break;

                case 5:
                    System.out.println("Історія замовлень:");
                    history.printPurchases();
                    break;

                case 0:
                    System.out.println("Завершенно");
                    scanner.close();
                    return;

            
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}