package org.example.three;


public class Main {
    public static void main(String[] args) {

        Product product = new Product("Product 1", 10, 100.0);
        Warehouse warehouse = new WarehouseImpl();
        warehouse.addProduct(product);

        Order order = new Order(warehouse);
        order.processOrder(product, 5);

        System.out.println(product.getQuantity()); // output: 5

    }
}