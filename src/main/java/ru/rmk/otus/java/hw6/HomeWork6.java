package ru.rmk.otus.java.hw6;

import ru.rmk.otus.java.hw6.animals.Cat;
import ru.rmk.otus.java.hw6.animals.Dog;
import ru.rmk.otus.java.hw6.animals.Horse;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Zevs", 2, 0, 100);
        Dog dog = new Dog("Polkan", 4, 2, 150);
        Horse horse = new Horse("Zarya", 10, 3, 1000);
        cat.run(100);
        dog.run(400);
        horse.run(500);
        cat.swim(50);
        dog.swim(100);
        horse.swim(500);
        cat.info();
        dog.info();
        horse.info();
    }
}
