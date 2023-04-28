package org.example.three;

public class Order {
    private Warehouse warehouse;

    public Order(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void processOrder(Product product, int amount) {
        warehouse.decreaseProductQuantity(product, amount);
        System.out.println("Order processed successfully");
    }
}
