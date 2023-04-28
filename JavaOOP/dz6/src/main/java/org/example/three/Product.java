package org.example.three;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void decreaseQuantity(int amount) {
        if (amount > quantity) {
            throw new IllegalArgumentException("Not enough quantity");
        }
        quantity -= amount;
    }

    public void increaseQuantity(int amount) {
        quantity += amount;
    }
}
