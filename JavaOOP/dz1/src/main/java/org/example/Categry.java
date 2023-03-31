package org.example;

import java.util.ArrayList;

public class Categry {

    private String name;

    private ArrayList<Product> items;

    public Categry(String name) {
        this.name=name;
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }
    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + items +
                '}';
    }

}
