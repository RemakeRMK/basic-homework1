package ru.rmk.otus.java.hw3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        //firstHomeWork(5," Love");
        //secondHomeWork(new int[]{1, 2, 4, 7, 15, 72, 16});
        //thirdHomeWork(5, new int[]{6, 8, 21, 13, 4});
       //fourthHomeWork(3, new int[]{32, 17, 14, 22});
        fifthHomeWork(new int[]{13, 12, 15, 32, 24, 36, 1, 8});
    }
    public static void firstHomeWork(int times, String word){
        for (int i = 0; i < times; i++) {
            System.out.println(i + word);

        }
    }

    public static void secondHomeWork(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > 5){
                sum += a[i];
            }
        }
        System.out.println(sum);


    }
    public static void thirdHomeWork(int a, int[] b){
        for (int i = 0; i < b.length; i++) {
            b[i] = a;
            System.out.println(Arrays.toString(b));


        }


    }
    public static void fourthHomeWork(int a, int[] b){
        for (int i = 0; i < b.length; i++) {
            b[i] = b[i] + a;
        }
        System.out.println(Arrays.toString(b));

    }



    public static void fifthHomeWork(int[] a){
        int summa1 = 0;
        int summa2 = 0;
        for (int i = 0; i < a.length; i++) {
            if(i < a.length/2){
                summa1 = summa1 +a[i];
            }else {
                summa2 = summa2 +a[i];
            }
        }
if(summa1 > summa2){
    System.out.println("Сумма левой половины больше");
}else{
    System.out.println("Сумма правой половины больше");

}
    }
}