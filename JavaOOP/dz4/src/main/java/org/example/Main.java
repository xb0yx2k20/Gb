package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleBox ob1 = new SimpleBox(123);
        SimpleBox ob2 = new SimpleBox("qwe");
        SimpleBox ob3 = new SimpleBox(100);





        GenBox <Integer> g1 = new GenBox<>(10);
        GenBox <Integer> g2 = new GenBox<>(20);

        int sum = g1.getObj() + g2.getObj();


        Double[] arr1 = new Double[2];
        arr1[0] = 10.0;
        arr1[1] = 60.0;

        Integer[] arr2 = new Integer[2];
        arr2[0] = 30;
        arr2[1] = 40;

        BoxWithNumber<Double> box1 = new BoxWithNumber<>(arr1);
        BoxWithNumber<Integer> box2 = new BoxWithNumber<>(arr2);
        System.out.println(box1.compare(box2));

        System.out.println(box1.getAv());
        System.out.println(box2.getAv());

        Calculator calc = new Calculator();
        List<Double> mas1 = new ArrayList<>();
        List<Integer> mas2 = new ArrayList<>();
        mas1.add(100.0);
        for (int i = 0; i < 10; i++) {
            mas1.add((double) i);
            mas2.add(i);
        }
        System.out.println(calc.getSum(mas1));
        System.out.println(calc.getSum(mas2));
        System.out.println(calc.getCom(mas2));
        System.out.println(calc.getDiv(mas2));
        System.out.println(calc.decimalToBinary(mas2));


        /*List<Employ> empl = new ArrayList<>();
        LRUCache<Employ> cache = new LRUCache<>(5);
        for (int i = 0; i < 10; i++) {
            Employ em = new Employ("Ivanov" + i, 12345.0, "art" + i);
            cache.addElem(em);
        }
        System.out.println(cache.getALLElem());*/



    }
}