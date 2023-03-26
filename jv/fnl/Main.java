package fnl;

import java.util.*;

class Laptop {
    private int ram;
    private int storage;
    private String os;
    private String color;

    public Laptop(int ram, int storage, String os, String color) {
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(4, 256, "Windows", "Silver"));
        laptops.add(new Laptop(8, 512, "MacOS", "Gray"));
        laptops.add(new Laptop(16, 1024, "Linux", "Black"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Map<String, Object> filter = new HashMap<>();
        switch (choice) {
            case 1:
                System.out.print("Введите минимальный объем ОЗУ: ");
                int ram = scanner.nextInt();
                scanner.nextLine();
                filter.put("ram", ram);
                break;
            case 2:
                System.out.print("Введите минимальный объем жесткого диска: ");
                int storage = scanner.nextInt();
                scanner.nextLine();
                filter.put("storage", storage);
                break;
            case 3:
                System.out.print("Введите название операционной системы: ");
                String os = scanner.nextLine();
                filter.put("os", os);
                break;
            case 4:
                System.out.print("Введите цвет: ");
                String color = scanner.nextLine();
                filter.put("color", color);
                break;
            default:
                System.out.println("Неправильный критерий фильтрации.");
                return;
        }

        ArrayList<Laptop> filteredLaptops = filterLaptops(laptops, filter);
        System.out.println("Результаты фильтрации:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }

    public static ArrayList<Laptop> filterLaptops(ArrayList<Laptop> laptops, Map<String, Object> filter) {
        ArrayList<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean passFilter = true;

            for (Map.Entry<String, Object> entry : filter.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                switch (key) {
                    case "ram":
                        if (laptop.getRam() < (int)value) {
                            passFilter = false;
                        }
                        break;
                    case "storage":
                        if (laptop.getStorage() < (int)value) {
                            passFilter = false;
                        }
                        break;
                    case "os":
                        if (!laptop.getOs().equals(value)) {
                            passFilter = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equals(value)) {
                            passFilter = false;
                        }
                        break;
                    default:
                        System.out.println("Неправильный критерий фильтрации.");
                        return new ArrayList<Laptop>();
                }
            }
    
            if (passFilter) {
                filteredLaptops.add(laptop);
            }
        }
    
        return filteredLaptops;
    }
}
