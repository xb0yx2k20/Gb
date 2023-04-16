package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
/*@AllArgsConstructor
@NoArgsConstructor*/
public class LRUCache<T> {

    private ArrayList<T> list;

    private Integer size;

    public LRUCache(Integer size) {
        this.size=size;
        this.list=new ArrayList<>();
    }

    public void addElem(T elem) {
        if (list.size()<size) {
            list.add(elem);
        } else {
            list.remove(0);
            list.add(elem);
        }
    }

    public T getElem(Integer ind) {
        if (ind < list.size() && ind > 1) {
            return list.get(ind);
        } else {
            System.out.println("\u001B[31m" + "NULL" + "\u001B[0m");
            return null;
        }
    }

    public List<T> getALLElem() {
        return list;
    }
}
