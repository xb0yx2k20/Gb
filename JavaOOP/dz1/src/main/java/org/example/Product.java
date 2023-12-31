package org.example;

public class Product {
    private String name;

    private Integer price;

    private Double rating;


    public Product(String name, Integer price, Double rating) {
        this.name=name;
        this.price=price;
        this.rating=rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
