package dz4;

import java.util.LinkedList;

public class task1 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        LinkedList<Integer> mas = new LinkedList<>();

        for (int temp : arr) {
            mas.add(temp);
        }

        for (int i = mas.size(); i > 0; i--) {
            mas.add(i, mas.getFirst());
            mas.removeFirst();
        }
        System.out.println(mas);
    }
}