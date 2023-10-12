package ru.rmk.otus.java.hw1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // решил довести до ума
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер домашнего задания, их всего 6:");
            int tN = scanner.nextInt();
            if (tN == 1) {
                System.out.println("Вы выбрали задание №1");
                greetings();

            }
            if (tN == 2) {
                System.out.println("Вы выбрали задание №2");
                checkSign();

            }
            if (tN == 3) {
                System.out.println("Вы выбрали задание №3");
                selectColor();

            }
            if (tN == 4) {
                System.out.println("Вы выбрали задание №4");
                compareNumbers();


            }
            if (tN == 5) {
                addOrSubstractAndPrint();
                System.out.println("Вы выбрали задание №5");
            }

            if (tN == 6) {
                randomNumber();

            }
            if (tN >= 7) {
                break;
            }
        }


        // 1 домашнее задание
        //      greetings();
        // 2 домашнее задание
        //      checkSign();
        // 3 домашнее задание
        //       selectColor();
        // 4 домашнее задание
        //      compareNumbers();
        // 5 домашнее задание
        //     addOrSubstractAndPrint();
        // задание со *
        //     randomNumber();


    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign() {
        int a = (int) (Math.random() * 6);
        int b = (int) (Math.random() * 5);
        int c = (int) (Math.random() * -20);
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 32);
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data >= 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 26);
        int b = (int) (Math.random() * 98);
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }

    }

    public static void addOrSubstractAndPrint() {
        int initValue = (int) (Math.random() * 17);
        int delta = (int) (Math.random() * 25);
        boolean increment = false;
        if (increment == true) {
            System.out.println(initValue + delta);
        }
        if (increment == false) {
            System.out.println(initValue - delta);
        }
    }

    public static void randomNumber() {
        while (true) {
            System.out.println("Введите число от 1 до 5:");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int c = (int) (Math.random() * 5);
            System.out.println(c);
            if (x > 5) {
                break;
            }

        }
    }
}

