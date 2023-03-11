package jv;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");

        int[][] array = new int[3][2];
        
        for (int i = 0; i < arr.length; i+=2) {
            char[] chars = arr[i].toCharArray();
            array[i / 2][0] = chars[0];
            array[i / 2][1] = chars[1];
        }
        int fl = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (array[i][j] == '?') {
                    if ((array[2][j] - array[1][j] - array[0][j] + 63) < 0)  {
                        array[i][j] = (array[2][j] - array[1][j] - array[0][j] + 111 + 10);
                        fl += 1;
                    } else {
                        array[i][j] = (array[2][j] - array[1][j] - array[0][j] + 111 - fl);
                        //System.out.println("\n--------" + array[i][j]);
                    }
                    if ('0' > array[i][j] || '9' < array[i][j]) {
                        System.out.println("No solution");
                        System.exit(0);
                    }
                }
                System.out.print((char)array[i][j]);
            }
            if (i == 0) {
                System.out.print(" + ");
            } else if (i != 2) {
                System.out.print(" = ");
            }
        }
    }
}
