package ru.rmk.otus.java.lesson4;

import java.util.Scanner;

public class Lesson4 {

        public static void main(String[] args) {
            numbersGame();
        }

        public static void booleanBox() {
            Scanner scanner = new Scanner(System.in);
            boolean isBoxOpened = true;

            System.out.println("На столе стоит пустая коробка");
            if (isBoxOpened) {
                System.out.println("Коробка открыта");
            } else {
                System.out.println("Коробка закрыта");
            }

            System.out.println("Напишите 1, если хотите открыть коробку, или 0 если закрыть");

            int cmd = scanner.nextInt();
            if (cmd == 1) {
                if (!isBoxOpened) {
                    isBoxOpened = true;
                    System.out.println("Вы открыли коробку");
                } else {
                    System.out.println("Зачем Вы пытаетесь открыть открытую коробку?");
                }
            }
            if (cmd == 0) {
                if (isBoxOpened) {
                    isBoxOpened = false;
                    System.out.println("Вы закрыли коробку");
                } else {
                    System.out.println("Зачем Вы пытаетесь закрыть закрытую коробку?");
                }
            }

            System.out.println("Хотите ли Вы положить в коробку предмет? 0 - нет, 1 - да");
            cmd = scanner.nextInt();
            if (cmd == 0) {
                System.out.println("Ну не так нет");
            } else if (cmd == 1) {
                if (isBoxOpened) {
                    System.out.println("Вы положили предмет  коробку");
                } else {
                    System.out.println("Сложно положить предмет в коробку сквозь закрытую крышку");
                }
            }
        }

        public static void simpleCalculator() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            float a = scanner.nextFloat();
            System.out.println("Введите операцию: +, -, *, /");
            char operation = scanner.next().charAt(0);
            System.out.println("Введите второе число");
            float b = scanner.nextFloat();
            float result;
            if (operation == '+') {
                result = a + b;
            } else if (operation == '-') {
                result = a - b;
            } else if (operation == '*') {
                result = a * b;
            } else if (operation == '/') {
                result = a / b;
            } else {
                System.out.println("Попытка выполнить неизвестную операцию");
                return;
            }
            System.out.println(a + " " + operation + " " + b + " = " + result);
        }

        public static void numbersGame() {
            Scanner scanner = new Scanner(System.in);
            int triesCount;
            int interval;
            System.out.println("Добро пожаловать в игру 'Угадай число'. Выберите сложность:\n1 - легко\n2 - средне\n3 - сложно");
            int difficult = scanner.nextInt();
            if (difficult == 1) {
                triesCount = 5;
                interval = 8;
            } else if (difficult == 2) {
                triesCount = 4;
                interval = 10;
            } else if (difficult == 3) {
                triesCount = 3;
                interval = 12;
            } else {
                System.out.println("Ах ты так..... ну получай....");
                triesCount = 1;
                interval = 99999;
            }
            int aiNumber = (int) (Math.random() * interval) + 1;
            System.out.println("Компьютер загадал число от 1 до " + interval);
            while (true) {
                System.out.println("Попробуйте отгадать число. Количество попыток: " + triesCount);
                int answer = scanner.nextInt();
                if (answer == aiNumber) {
                    System.out.println("Вы победили");
                    break;
                }
                triesCount--;
                if (triesCount == 0) {
                    System.out.println("Вы потратили все свои попытки и проиграли");
                    break;
                }
                if (answer < aiNumber) {
                    System.out.println("Не отгадали. Загаданное число больше");
                } else {
                    System.out.println("Не отгадали. Загаданное число меньше");
                }
            }
            System.out.println("Игра окончена");
        }

        public static void simpleNumbersGame() {
            Scanner scanner = new Scanner(System.in);
            int aiNumber = (int) (Math.random() * 10); // [0, 9]
            System.out.println("Компьютер загадал число от 0 до 9, попробуйте отгадать");
            int answer = scanner.nextInt();
            if (answer == aiNumber) {
                System.out.println("Вы победили");
            } else {
                System.out.println("Вы проиграли");
            }
        }

        public static void hardGetNumberInInterval(int min, int max) {
            Scanner scanner = new Scanner(System.in);
            int n;
            System.out.println("Введите число от " + min + " до " + max);
            while (true) {
                n = scanner.nextInt();
                if (n >= min && n <= max) {
                    break;
                }
                System.out.println("Вы не правы");
            }
            System.out.println("Вы ввели число: " + n);
        }

        public static void getNumberInInterval(int min, int max) {
            Scanner scanner = new Scanner(System.in);
            int n;
            do {
                System.out.println("Введите число от " + min + " до " + max);
                n = scanner.nextInt();
            } while (n < min || n > max);
            System.out.println("Вы ввели число: " + n);
        }

        public static void elseIfExample() {
            int a = 2;
            if (a == 1) {
                System.out.println("Один");
            } else if (a == 2) {
                System.out.println("Два");
            } else if (a == 3) {
                System.out.println("Три");
            } else {
                System.out.println("Неизвестно");
            }
        }
    }

