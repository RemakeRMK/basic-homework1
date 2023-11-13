package ru.rmk.otus.java.hw6.animals;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int swimingRun, int endurance) {
        super(name, speedRun, swimingRun, endurance, 0);
    }

    @Override
    public int swim(int distance) {
        System.out.println("Котики не умеют плавать! Особенно " + name);
        return -1;
    }

    @Override
    public void info() {
        System.out.println("Котик по имени " + name + " бегает со скоростью " + speedRun + "м/с, а вот плавать не умеет!");
    }
}
