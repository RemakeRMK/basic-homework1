package ru.rmk.otus.java.hw5.box;

public class Box {
    private String items;
    private String color;
    private final int width;
    private final int length;
    private final int height;
    private boolean isOpen;


    public void setColor(String color) {
        this.color = color;
    }

    public Box(String color, int width, int length, int height) {
        this.items = null;
        this.color = color;
        this.width = width;
        this.length = length;
        this.height = height;
        this.isOpen = true;
    }

    public void open() {
        if (isOpen) {
            System.out.println("Коробка открыта!");
        }else{
            System.out.println("Коробка уже открыта");
            this.isOpen = true;
        }
    }

    public void close(){
        if(isOpen){
            System.out.println("Коробка закрыта!");
            this.isOpen = false;
        }else{
            System.out.println("Коробка уже закрыта");
        }
    }

    public void add(String item) {
        if(!isOpen){
            System.out.println("Вы не можете добавить предмет, коробка закрыта!");
            return;
        }
        if (items == null){
            items = item;
            System.out.println("Вы положили в коробку " + item);
            return;
        }
        if(items != null){
            System.out.println("В коробке уже есть предмет " + items);
        }
    }


    public void info() {
        System.out.println("У нас " + color + " коробка с размерами " + width + "x" + length + "x" + height + "\nВ коробке находятся: ");
         {
            System.out.println(items);
        }
    }
}