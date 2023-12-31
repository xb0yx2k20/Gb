package org.example;

public class User {

    String login;

    private String password;

    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        basket = new Basket();
    }

    public void addProductToBasket(Product product) {
        basket.addProduct(product);
    }

    public void removeProductFromBasket(Product product) {
        basket.removeProduct(product);
    }

    public void printBasket() {
        basket.printBasket();
    }
}
