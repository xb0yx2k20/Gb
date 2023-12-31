package dz3;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        LinkedList<Integer> mas = new LinkedList<>();

        for (int temp : arr) {
            if (temp % 2 == 0){
                mas.add(temp);
            }
            
        }

        System.out.println(mas);
    }
}
