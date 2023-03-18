package dz4;

import java.util.LinkedList;

public class task2 {

    public static void enqueue(LinkedList<Integer> list, int num) 
    {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) 
    {
        int n = list.getFirst();
        list.removeFirst();
        return n;
    }

    public static int first(LinkedList<Integer> list) 
    {
        return list.getFirst();
    }
    
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        LinkedList<Integer> mas = new LinkedList<>();
        for (Integer temp : arr) {
            mas.add(temp);
        }

        System.out.println(mas);

        enqueue(mas, 10);
        System.out.println(mas);

        int d = dequeue(mas);
        System.out.print(d + " ");
        System.out.println(mas);


        int f = first(mas);
        System.out.print(f + " ");
        System.out.println(mas);

    }
}