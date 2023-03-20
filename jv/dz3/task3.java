package dz3;

import java.util.ArrayList;
import java.util.Collections;

public class task3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        ArrayList<Integer> mas = new ArrayList<>();

        for (int temp : arr) {
            mas.add(temp);        
        }
        System.out.println(Collections.max(mas));
        System.out.println(Collections.min(mas));


        System.out.println(mas);
    }
}
