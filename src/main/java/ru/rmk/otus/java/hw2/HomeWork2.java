package ru.rmk.otus.java.hw2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level;
        int interval;
        System.out.println("Доброго времени суток\nВ эфире игра:\nУгадай число!!!\nВыберите уровень:\n1-изи\n2-медиум\n3-хард");
        int difficult = scanner.nextInt();
        if (difficult == 1) {
            level = 6;
            interval = 10;
        } else if (difficult == 2) {
            level = 4;
            interval = 9;
        } else if (difficult == 3) {
            level = 3;
            interval = 12;
        } else {
            System.out.println("Сам напросился!!!");
            level = 1;
            interval = 999999;
        }
        int aiNumber = (int) (Math.random() * interval) + 1;
        System.out.println("Компьютер загадал число от 1 до " + interval);

        while (true) {
            System.out.println("Попробуй угадай число.\nКоличество попыток " + level);
            int answer = scanner.nextInt();

            if (answer == aiNumber) {
                System.out.println("Congratulation!!!\nТы угадал!!!");
                break;
            }

            level--;
            if (level == 0) {
                System.out.println("Вы потратили все попытки и проиграли");
                break;
            }
            if (answer < aiNumber) {
                System.out.println(answer + " больше моего числа. Попробуй еще раз!");
            } else {
                System.out.println("Не угадал.\nЗагаданное число меньше!");
            }

        }
        System.out.println("Игра окончена!");

    }
}
