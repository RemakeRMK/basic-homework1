package ru.rmk.otus.java.hw7;

public class HomeWork7 {
    public static void main(String[] args) {
Plate plate = new Plate(100, 78);
        plate.addEat(100);
        plate.decreasePlate(50);
        plate.info();

        Cat[] cats = {new Cat("Zevs", 13),
                new Cat("Murzik", 10),
                new Cat("Valenok", 25),
                new Cat(" Chypik", 20)};
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isSatiety() == true && cats[i].getAppetite() <= plate.getCurrentEat()) {
                cats[i].eating(plate);
                System.out.println("Котик по имени " + cats[i].getName() + " покушал " + plate.getCurrentEat());
            }
            else{
                System.out.println("Кот" + cats[i].getName() + " оказался без пайка!");
            }
        }
    }
}
