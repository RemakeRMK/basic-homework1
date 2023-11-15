package ru.rmk.otus.java.hw7;

public class Cat {
    String name;
    int appetite;
    boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    public boolean catSatiety(Plate plate) {
        if (satiety && plate.decreasePlate(appetite)) {
            satiety = false;
            return false;
        }
        return true;
    }


    public void catEat(Plate plate) {
        if (satiety && plate.decreasePlate(appetite)) {
            System.out.println(" Котик решил перекусить и осталось в тарелке " + plate.currentEat);
        }
    }
}


