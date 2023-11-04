package ru.rmk.otus.java.hw6.animals;

public class Horse extends Animal {
    public Horse(String name, int speedRun, int swimingRun, int endurance) {
        super(name, speedRun, swimingRun, endurance);
    }

    public int swim(int distance) {
        int time = distance / speedRun;
        if (endurance * 4 < distance) {
            System.out.println("Затраченое время: -1. Вы обоссались, поменяйте штанцы " + name);
            return -1;
        }
        if (speedRun > 0) {
            System.out.println(name + " пробежит " + distance + " метров за " + time);
            endurance -= distance;
            return time;
        }
        return -1;
    }
}
