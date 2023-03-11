package dz1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Num1:");
            double num1 = scan.nextDouble();
            System.out.println("Num2:");
            double num2 = scan.nextDouble();
            System.out.println("Operation (+, -, *, /):");
            char operator = scan.next().charAt(0);
            double result;
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
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ошибка! Неверный оператор.");
                    return;
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
