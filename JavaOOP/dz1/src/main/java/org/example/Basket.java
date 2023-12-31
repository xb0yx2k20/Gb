package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> items;

    public Basket() {
        items = new ArrayList<>();
    }
    public void addProduct(Product product) {
        items.add(product);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public void printBasket() {
        for (Product product : items) {
            System.out.println(product);
        }
    }
}
