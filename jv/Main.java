import java.util.ArrayList;

// класс товара
class Product {
    String name;
    double price;
    int rating;

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
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

// класс категории
class Category {
    String name;
    ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}

// класс корзины
class Basket {
    ArrayList<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void printBasket() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

// класс пользователя
class User {
    String login;
    String password;
    Basket basket;

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

public class Main {
    public static void main(String[] args) {
        // создание товаров
        Product product1 = new Product("Телефон", 10000.0, 5);
        Product product2 = new Product("Ноутбук", 50000.0, 4);
        Product product3 = new Product("Планшет", 20000.0, 3);

        // создание категорий
        Category category1 = new Category("Электроника");
        Category category2 = new Category("Компьютеры");

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
