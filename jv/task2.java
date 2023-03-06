package jv;

import java.util.ArrayList;

public class task2 {

    public static boolean simple(int a) {
        int d = 2;
        while (d * d <= a) {
            if (a % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> mas = new ArrayList<Integer>();
        for (int i = 2; i < 1001; i++) {
            if (simple(i)) {
                mas.add(i);
            }
        }
        System.out.println(mas);
    }
}
