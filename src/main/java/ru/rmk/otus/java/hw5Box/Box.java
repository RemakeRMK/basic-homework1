package ru.rmk.otus.java.hw5Box;

public class Box {
    String[] items = new String[4];
    private String color;
    private int width;
    private int length;
    private int height;
    private boolean open;
    private boolean close;

    public void setColor(String color) {
        this.color = color;
    }

    public Box(String color, int width, int length, int height) {
        this.color = color;
        this.width = width;
        this.length = length;
        this.height = height;
        open = true;
        close = true;
    }

    public void opened() {
        if (open) {
            System.out.println("Коробка открыта!");
        }
    }

    public void closed() {
        if (close) {
            System.out.println("Коробка закрыта!");
        }
    }

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null && open) {
                items[i] = item;
                System.out.println("Вы добавили предмет " + item);
                return;
            } else if (close) {
                System.out.println("Вы не можете добавить предмет " + item + " коробка закрыта");
                break;
            } else {
                System.out.println("Вы не можете добавить предмет, не достаточно места " + item);
                break;
            }
        }


    }

    public void info() {
        System.out.println("У нас " + color + " коробка с размерами " + width + "x" + length + "x" + height + "\nВ коробке находятся: ");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}