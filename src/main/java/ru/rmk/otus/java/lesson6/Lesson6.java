package ru.rmk.otus.java.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson6 {


    public static void main(String[] args) {
        bagDemo();
    }

    public static void bagDemo() {
        Bag bag = new Bag();
        bag.info();
        bag.add("ball");
        bag.add("ball");
        bag.add("ball");
        bag.add("ball");
        bag.add("ball");
        bag.add("ball");
        bag.info();
        bag.count("ball");
    }

    public static void fieldOfWonders() {
        Scanner scanner = new Scanner(System.in);
        String aiWord = "watermelon";
        boolean[] opened = new boolean[aiWord.length()];
        System.out.println("Поле чудес: слово загадано, введите букву или слово");
        while (true) {
            String answer = scanner.next();
            if (answer.length() > 1) {
                if (answer.equals(aiWord)) {
                    System.out.println("Вы победили!");
                    return;
                } else {
                    System.out.println("Не угадали, попробуйте еще раз");
                }
            } else {
                char letter = answer.charAt(0);
                for (int i = 0; i < aiWord.length(); i++) {
                    if (aiWord.charAt(i) == letter) {
                        opened[i] = true;
                    }
                }
                for (int i = 0; i < aiWord.length(); i++) {
                    if (opened[i]) {
                        System.out.print(aiWord.charAt(i));
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void answerGame() {
        Scanner scanner = new Scanner(System.in);
        String[] words = {
                "apple", "orange", "pineapple", "banana", "lemon", "melon",
                "grapefruit", "blueberry", "watermelon", "cherry", "kiwi",
                "jackfruit", "dragonfruit", "pear"
        };

        System.out.println("Игра: Угадай слово");
        System.out.println("Список слов на сегодня: " + Arrays.toString(words));
        String aiWord = words[(int) (Math.random() * words.length)];
        System.out.println("Компьютер загадал слово. Попробуйте отгадать");
        while (true) {
            String answer = scanner.next();
            if (aiWord.equals(answer)) {
                System.out.println("Вы угадали, победа!");
                return;
            }
            char[] aiWordChars = aiWord.toCharArray();
            char[] answerChars = answer.toCharArray();
            int minLength = Math.min(answerChars.length, aiWordChars.length);
            for (int i = 0; i < minLength; i++) {
                if (answerChars[i] == aiWordChars[i]) {
                    System.out.print(answerChars[i]);
                } else {
                    System.out.print('*');
                }
            }
            for (int i = 0; i < 20 - minLength; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void findMinMax() {
        int[] arr = {-10, -2, -5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

