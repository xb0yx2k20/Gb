package org.example.three;

public interface Warehouse {
    void addProduct(Product product);
    void removeProduct(Product product);
    void increaseProductQuantity(Product product, int amount);
    void decreaseProductQuantity(Product product, int amount);
}
