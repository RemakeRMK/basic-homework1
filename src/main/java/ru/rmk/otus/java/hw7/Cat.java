package ru.rmk.otus.java.hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    public boolean eating(Plate plate) {
        if (satiety && plate.decreasePlate(appetite)) {
            satiety = false;
            return false;
        }
        return true;
    }
}


