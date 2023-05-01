package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        CustomLogger logger = new CustomLogger();

        while (true) {
            System.out.println("Enter a complex number in the form (a,b) or q to quit:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            String[] parts = input.split(",");

            if (parts.length != 2) {
                System.out.println("Invalid input");
                continue;
            }

            double real = Double.parseDouble(parts[0].substring(1));
            double imaginary = Double.parseDouble(parts[1].substring(0, parts[1].length() - 1));
            ComplexNumber number = new ComplexNumber(real, imaginary);

            System.out.println("Enter an operation (+, *, /):");
            String operation = scanner.nextLine();
            switch (operation) {
                case "+":
                    calculator.add(number);
                    logger.log("Added " + number);
                    break;
                case "*":
                    calculator.multiply(number);
                    logger.log("Multiplied by " + number);
                    break;
                case "/":
                    calculator.divide(number);
                    logger.log("Divided by " + number);
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue;
            }

            System.out.println("Result: " + calculator.getResult());
        }
    }
}

