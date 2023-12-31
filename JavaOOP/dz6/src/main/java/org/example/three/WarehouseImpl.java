package org.example.three;

import java.util.HashMap;
import java.util.Map;

public class WarehouseImpl implements Warehouse {
    private Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product, product.getQuantity());
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void increaseProductQuantity(Product product, int amount) {
        int currentQuantity = products.getOrDefault(product, 0);
        products.put(product, currentQuantity + amount);
    }

    public void decreaseProductQuantity(Product product, int amount) {
        int currentQuantity = products.getOrDefault(product, 0);
        if (currentQuantity < amount) {
            throw new IllegalArgumentException("Not enough quantity");
        }
        products.put(product, currentQuantity - amount);
    }
}

