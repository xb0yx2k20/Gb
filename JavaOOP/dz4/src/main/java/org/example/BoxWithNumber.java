package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BoxWithNumber<T extends Number>{
    private T[] mas;

    public double getAv() {
        double res = 0;
        for (T elem: mas) {
            res += elem.doubleValue();
        }
        return res / mas.length;
    }

    public boolean compare(BoxWithNumber<?> box) {
        return Math.abs(getAv() - box.getAv()) < 0.00001;
    }
}
