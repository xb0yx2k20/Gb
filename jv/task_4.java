package jv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_4 {

    public static String solve(String equation) {
        String[] arr = equation.split(" ");
        String number1 = arr[0];
        String number2 = arr[2];
        String number3 = arr[4];

        int j = 0;
        while (true) {
            int k = j;
            StringBuilder builder1 = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();
            for (int i = 0; i < number1.length(); i++) {
                if (number1.charAt(i) != '?') {
                    builder1.append(number1.charAt(i));
                } else {
                    builder1.append(k % 10);
                    k /= 10;
                }
            }

            for (int i = 0; i < number2.length(); i++) {
                if (number2.charAt(i) != '?') {
                    builder2.append(number2.charAt(i));
                } else {
                    builder2.append(k % 10);
                    k /= 10;
                }
            }

            if (k > 0) {
                break;
            }

            if (Integer.parseInt(builder1.toString()) + Integer.parseInt(builder2.toString()) == Integer.parseInt(number3)) {
                return builder1.toString() + " + " + builder2.toString() + " = " + number3;
            }

            j++;
        }

        return "No solution"; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        System.out.println(solve(str));
    }
}
