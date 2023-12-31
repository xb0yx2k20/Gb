package org.example.PhoneBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить запись");
            System.out.println("2. Удалить запись");
            System.out.println("3. Найти запись");
            System.out.println("4. Экспорт данных");
            System.out.println("5. Импорт данных");
            System.out.println("6. Выйти из программы");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    phonebook.addRecord();
                    break;
                case 2:
                    phonebook.deleteRecord();
                    break;
                case 3:
                    phonebook.findRecord();
                    break;
                case 4:
                    phonebook.exportData();
                    break;
                case 5:
                    phonebook.importData();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный выбор");
                    break;
            }
        }
    }
}
