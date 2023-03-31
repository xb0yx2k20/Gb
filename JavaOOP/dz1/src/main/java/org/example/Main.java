package org.example;

import jdk.jfr.Category;

public class Main {
    public static void main(String[] args) {
        // создание товаров
        Product product1 = new Product("Телефон", 10000, 5.0);
        Product product2 = new Product("Ноутбук", 50000, 4.5);
        Product product3 = new Product("Планшет", 20000, 3.3);

        // создание категорий
        Categry category1 = new Categry("Электроника");
        Categry category2 = new Categry("Компьютеры");

        // добавление товаров в категории
        category1.addProduct(product1);
        category1.addProduct(product3);
        category2.addProduct(product2);

        // создание пользователей
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        // добавление товаров в корзину пользователей
        user1.addProductToBasket(product1);
        user1.addProductToBasket(product2);
        user2.addProductToBasket(product3);

        // вывод каталога товаров
        System.out.println("Каталог товаров:");
        System.out.println(category1);
        System.out.println(category2);

        // вывод покупок пользователей
        System.out.println("Покупки пользователей:");
        System.out.println("Корзина пользователя " + user1.login + ":");
        user1.printBasket();
        System.out.println("Корзина пользователя " + user2.login + ":");
        user2.printBasket();
    }
}