package ru.rmk.otus.java.hw6.animals;

public class Horse extends Animal {
    int swimHorse;

    public Horse(String name, int speedRun, int swimingRun, int endurance, int swimingHorse) {
        super(name, speedRun, swimingRun, endurance);
        this.swimHorse = swimingHorse;

    }
}
