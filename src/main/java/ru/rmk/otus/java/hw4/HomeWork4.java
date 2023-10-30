package ru.rmk.otus.java.hw4;

import java.util.Arrays;

public class HomeWork4 {
    public static int SIZE_X;
    public static int SIZE_Y;

    public static void main(String[] args) {
        int[][] array = {{5, 13, 10}, {17, 20, 31}, {21, 12, 18}};
        sumOfPositiveElements(array);
        System.out.println(sumOfPositiveElements(array));
        SIZE_X = 3;
        SIZE_Y = 5;
        int[][] size = new int[SIZE_X][SIZE_Y];
        starsVKvadrate(size);
        diagonalTwo(array);
        diagonal(array);
        findMax(array);
        System.out.println(findMax(array));
        fiveHomeTask(array);
        System.out.println(fiveHomeTask(array));
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void starsVKvadrate(int[][] size) {
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diagonalTwo(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static void diagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int fiveHomeTask(int[][] array) {
        int sum = 0;
        if (array.length <= 1) {
            sum = -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                sum += array[1][i];
            }
        }
        return sum;
    }
}






