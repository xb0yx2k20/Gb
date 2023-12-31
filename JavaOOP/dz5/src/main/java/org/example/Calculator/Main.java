package org.example.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number num1, num2, result;
        char operation;

        System.out.println("Калькулятор для работы с рациональными и комплексными числами");
        System.out.println("Введите первое число:");
        num1 = InputHelper.getNumberInput();

        while (num1 == null) {
            System.out.println("Введите первое число:");
            num1 = InputHelper.getNumberInput();
        }

        System.out.println("Введите операцию (+, -, *, /):");
        operation = InputHelper.getOperationInput();

        while (operation == 0) {
            System.out.println("Введите операцию (+, -, *, /):");
            operation = InputHelper.getOperationInput();
        }

        System.out.println("Введите второе число:");
        num2 = InputHelper.getNumberInput();

        while (num2 == null) {
            System.out.println("Введите второе число:");
            num2 = InputHelper.getNumberInput();
        }

        switch (operation) {
            case '+':
                result = num1.add(num2);
                break;
            case '-':
                result = num1.subtract(num2);
                break;
            case '*':
                result = num1.multiply(num2);
                break;
            case '/':
                result = num1.divide(num2);
                break;
            default:
                System.out.println("Неверная операция");
                return;
        }

        System.out.println("Результат: " + result.toString());
    }
}
