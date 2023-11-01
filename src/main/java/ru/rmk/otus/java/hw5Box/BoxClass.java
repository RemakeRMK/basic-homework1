package ru.rmk.otus.java.hw5Box;

public class BoxClass {
    public static void main(String[] args) {
        Box box = new Box("красная", 15, 25, 30);
            box.info();
            box.setColor("жёлтенькая");
            box.info();
            box.opened();
            box.add("Палка");
            box.add("Вилка");
            box.closed();
            box.add("Ложка");
            box.add("Кружка");
            box.add("Кекс");
            box.add("Печенье");

            box.info();





    }



}
