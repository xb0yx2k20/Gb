import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Toy {
    private int id;
    private String name;
    private int quantity;
    private double weight;

    public Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void decreaseQuantity() {
        quantity--;
    }
}

class ToyStore {
    private List<Toy> toys;

    public ToyStore() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyWeight(int toyId, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public Toy choosePrizeToy() {
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        double randomWeight = Math.random() * totalWeight;
        double currentWeight = 0;

        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (randomWeight <= currentWeight) {
                Toy prizeToy = new Toy(toy.getId(), toy.getName(), 1, toy.getWeight());
                toy.decreaseQuantity();
                return prizeToy;
            }
        }

        return null; // Если список игрушек пуст
    }
}

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy(new Toy(1, "Кукла", 10, 20));
        toyStore.addToy(new Toy(2, "Мяч", 15, 30));
        toyStore.addToy(new Toy(3, "Машинка", 8, 15));

        toyStore.updateToyWeight(1, 40); // Изменяем вес куклы

        Toy prizeToy = toyStore.choosePrizeToy();
        if (prizeToy != null) {
            writePrizeToyToFile(prizeToy);
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        } else {
            System.out.println("Нет доступных игрушек");
        }
    }

    private static void writePrizeToyToFile(Toy toy) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("prize.txt"))) {
            writer.write("Выигрышная игрушка: " + toy.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}