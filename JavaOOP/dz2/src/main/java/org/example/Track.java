package org.example;

public class Track implements Obstacles {
    private int length;
    private String name;

    public Track(int length, String name) {
        this.length = length;
        this.name = name;

    }


    @Override
    public int getCharacteristic() {
        return length;
    }

    @Override
    public String getName() {
        return name;
    }
}
