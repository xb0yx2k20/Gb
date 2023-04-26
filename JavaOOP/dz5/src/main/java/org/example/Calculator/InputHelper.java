package org.example.Calculator;


import java.util.Scanner;

public class InputHelper {

    public static Number getNumberInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Number number = null;

        try {
            if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
                String[] parts = input.split("(?=\\+)|(?=\\-)|(?=\\*)|(?=\\/)");
                double real = Double.parseDouble(parts[0]);
                double imaginary = Double.parseDouble(parts[1].replace("i", ""));
                number = new ComplexNumber(real, imaginary);
            } else {
                String[] parts = input.split("/");
                if (parts.length == 1) {
                    number = new RationalNumber(Integer.parseInt(parts[0]), 1);
                } else if (parts.length == 2) {
                    int numerator = Integer.parseInt(parts[0]);
                    int denominator = Integer.parseInt(parts[1]);
                    number = new RationalNumber(numerator, denominator);
                } else {
                    System.out.println("Неверный формат числа");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа");
        }

        return number;
    }

    public static char getOperationInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char operation = 0;

        if (input.length() == 1) {
            operation = input.charAt(0);
        } else {
            System.out.println("Неверная операция");
        }

        return operation;
    }
}
