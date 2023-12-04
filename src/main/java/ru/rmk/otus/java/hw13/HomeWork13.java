package ru.rmk.otus.java.hw13;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В приложении 2 текстов фала, выберите 1 или 2: ");
        int choose = scanner.nextInt();
        if (choose == 1) {
            try (InputStreamReader in = new InputStreamReader(new FileInputStream("C:\\Users\\user\\Desktop\\java-basic-hw-1\\src\\main\\java\\ru\\rmk\\otus\\java\\hw13\\1text"))) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = in.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (choose ==2) {
            try (InputStreamReader in = new InputStreamReader(new FileInputStream("C:\\Users\\user\\Desktop\\java-basic-hw-1\\src\\main\\java\\ru\\rmk\\otus\\java\\hw13\\2text"))) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = in.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Нет файлов!");
        }
        String data = "Но я тысячу раз обрывал провода,\nсам себе кричал ухожу навсегда,\nне понятно как доживал до утра,\n";
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\user\\Desktop\\java-basic-hw-1\\src\\main\\java\\ru\\rmk\\otus\\java\\hw13\\2text", true))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

