package ru.rmk.otus.java.hw5.box;

public class BoxClass {
    public static void main(String[] args) {
        Box box = new Box("красная", 15, 25, 30);
            box.info();
            box.setColor("жёлтенькая");
            box.info();
            box.open();
            box.add("Палка");
            box.add("Вилка");
            box.add("Ложка");
            box.close();
            box.add("Кружка");
            box.add("Кекс");
            box.add("Печенье");

            box.info();





    }



}
