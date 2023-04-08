package org.example;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Human human1 = new Human();
        human1.setRunAndHeight(120, 100, "human1");

        Cat cat1 = new Cat();
        cat1.setRunAndHeight(300, 50, "cat1");

        Robot robot1 = new Robot();
        robot1.setRunAndHeight(300, 300, "robot1");*/

        ArrayList<Runners> runners = new ArrayList<>();
        runners.add(new Human(100, 130, "human1"));
        runners.add(new Cat(200, 50, "cat1"));
        runners.add(new Robot(300, 300, "robot1"));


        ArrayList<Obstacles> obstacles = new ArrayList<>();
        obstacles.add(new Track(130, "track1"));
        obstacles.add(new Barriers(300, "barrier1"));


        Success suc = new Success();
        boolean check = false;
        for (Runners runner : runners) {
            for (Obstacles obstacle : obstacles) {
                check = suc.isSuccess(runner, obstacle);
                if (!check) {
                    break;
                }
            }
            if (check) {
                System.out.println(runner.getName() + " passed all obstacles!");
            }
        }

    }
}