package ru.rmk.otus.java.hw6.animals;

public class Dog extends Animal {
    int swimDog;

    public Dog(String name, int speedRun, int swimingRun, int endurance, int swimDog) {
        super(name, speedRun, swimingRun, endurance);
        this.swimDog = swimDog;
    }
}
