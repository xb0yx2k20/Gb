package org.example;

public class Human implements Runners {
    private int maxHeight;
    private int maxRun;
    private String name;

    public Human(int maxRun, int maxHeight, String name) {
        this.maxRun=maxRun;
        this.maxHeight=maxHeight;
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
