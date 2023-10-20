package ru.rmk.otus.java.lesson6;

public class Bag {

    String[] items = new String[5]; // { branch, car, null, null, null }

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("В сумку положили предмет: " + item);
                return;
            }
        }
        System.out.println("В сумке нет места для: " + item);
    }

    public void contains(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                System.out.println("Предмет " + item + " найден");
                return;
            }
        }
        System.out.println("Предмет " + item + " не найден");
    }

    public void count(String item) {
        int counter = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                counter++;
            }
        }
        System.out.println("Предмет " + item + " встречается в сумке " + counter + " раз");
    }

    public void clear() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println("Из сумки выброшено: " + items[i]);
            }
        }
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
    }

    public void info() {
        System.out.println("Bag:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}
