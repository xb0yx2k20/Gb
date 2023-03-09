package dz1;

import java.util.Scanner;

public class task1 {

    public static int triangle_num(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        return sum;
    }

    public static int triangle_num1(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int num = scan.nextInt();
            System.out.println(triangle_num(num));
            System.out.println(triangle_num1(num));
        }
    }
}
