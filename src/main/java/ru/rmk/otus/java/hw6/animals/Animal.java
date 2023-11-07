package ru.rmk.otus.java.hw6.animals;

public class Animal {
    String name;
    int speedRun;
    int swimingSpeed;
    int endurance;

    public Animal(String name, int speedRun, int swimingSpeed, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.swimingSpeed = swimingSpeed;
        this.endurance = endurance;
    }

    public int run(int distance) {
        int time = distance / speedRun;
        if (endurance < distance) {
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

    public int swim(int distance) {
        int time = distance / swimingSpeed;
        int swimDog = 2;
        int swimHorse = 4;
        if (this instanceof Dog) {
            if (endurance * swimDog < distance) {
                System.out.println("Затраченое время: -1. Вы обоссались, поменяйте штанцы " + name);
                return -1;
            }
            if (this instanceof Horse) {
                if (endurance * swimHorse < distance) {
                    System.out.println("Затраченое время: -1. Вы обоссались, поменяйте штанцы " + name);
                    return -1;
                }
            }
            if (swimingSpeed > 0) {
                System.out.println(name + " пробежит " + distance + " метров за " + time);
                endurance -= distance;
                return time;
            }
        }
        return -1;
    }

            public void info () {
                System.out.println(name + " бегает  со скоростью " + speedRun + "м/с, плавает со скоростью " + swimingSpeed + "м/с.");
            }
        }