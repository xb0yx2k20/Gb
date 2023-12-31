package org.example;

public class Barriers implements Obstacles{
    private int height;
    private String name;


    public Barriers(int height, String name) {
        this.height = height;
        this.name = name;

    }

    @Override
    public int getCharacteristic() {
        return height;
    }

    @Override
    public String getName() {
        return name;
    }


}
