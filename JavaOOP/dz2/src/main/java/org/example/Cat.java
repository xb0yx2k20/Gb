package org.example;

public class Cat implements Runners{
    private int maxRun;
    private int maxHeight;
    private String name;

    public Cat(int maxRun, int maxHeight, String name) {
        this.maxRun = maxRun;
        this.maxHeight = maxHeight;
        this.name=name;
    }

    @Override
    public int getMaxJump() {
        return maxHeight;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public String getName() {
        return name;
    }
}
