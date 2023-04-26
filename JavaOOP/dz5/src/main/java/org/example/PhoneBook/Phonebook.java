package org.example.PhoneBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
    private ArrayList<Record> records;
    private Scanner scanner;

    public Phonebook() {
        records = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addRecord() {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        System.out.println("Введите телефон:");
        String phoneNumber = scanner.nextLine();

        Record record = new Record(name, phoneNumber);
        records.add(record);

        System.out.println("Запись добавлена");
    }

    public void deleteRecord() {
        System.out.println("Введите имя для удаления:");
        String name = scanner.nextLine();

        Record recordToRemove = null;
        for (Record record : records) {
            if (record.getName().equals(name)) {
                recordToRemove = record;
                break;
            }
        }

        if (recordToRemove != null) {
            records.remove(recordToRemove);
            System.out.println("Запись удалена");
        } else {
            System.out.println("Запись не найдена");
        }
    }

    public void findRecord() {
        System.out.println("Введите имя для поиска:");
        String name = scanner.nextLine();
        boolean foundRecord = false;
        for (Record record : records) {
            if (record.getName().equals(name)) {
                System.out.println(record.toString());
                foundRecord = true;
                break;
            }
        }

        if (!foundRecord) {
            System.out.println("Запись не найдена");
        }
    }

    public void exportData() {
        try {
            FileWriter writer = new FileWriter("phonebook.txt");
            for (Record record : records) {
                writer.write(record.getName() + "," + record.getPhoneNumber() + "\n");
            }
            writer.close();
            System.out.println("Данные экспортированы в файл phonebook.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при экспорте данных");
            e.printStackTrace();
        }
    }

    public void importData() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("phonebook.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String phoneNumber = parts[1];
                Record record = new Record(name, phoneNumber);
                records.add(record);
            }
            reader.close();
            System.out.println("Данные импортированы из файла phonebook.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при импорте данных");
            e.printStackTrace();
        }
    }
}


