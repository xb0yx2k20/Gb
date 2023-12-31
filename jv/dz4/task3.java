package dz4;

import java.util.Scanner;

public class task3 {
    private static Scanner scanner = new Scanner(System.in);
    private static double result = 0.0;
    private static double prevResult = 0.0;
    private static char operator;

    public static void main(String[] args) {
        System.out.println("Calculator is on.");
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the operator (+, -, *, /, u for undo): ");
            operator = scanner.next().charAt(0);
            if (operator == 'u') {
                result = prevResult;
            } else {
                System.out.println("Enter the second number: ");
                double num2 = scanner.nextDouble();
                prevResult = result;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: division by zero.");
                        }
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        break;
                }
                System.out.println("Result: " + result);
            }
            System.out.println("Press q to quit or any other key to continue.");
            char choice = scanner.next().charAt(0);
            quit = (choice == 'q');
        }
        System.out.println("Calculator is off.");
    }
}

