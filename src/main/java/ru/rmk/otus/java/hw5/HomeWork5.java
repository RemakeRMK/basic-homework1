package ru.rmk.otus.java.hw5;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        int date = 1983;
        User[] userArray = new User[]{
                new User("Иванов", "Иван", "Иванович", 1978, "ivanov@gmail.com"),
                new User("Сидоров", "Василий", "Петрович", 1992, "sidorov@gmail.com"),
                new User("Петров", "Михаил", "Александрович", 2002, "petrov@gmail.com"),
                new User("Немелов", "Кирилл", "Андреевич", 1965, "nemelov@gmail.com"),
                new User("Контемиров", "Пётр", "Дмитриевич", 1975, "kontemirov@gmail.com"),
                new User("Маскалёв", "Андрей", "Генадьевич", 1987, "maskalev@gmail.com"),
                new User("Коволёв", "Дмитрий", "Иосипович", 2000, "kovolev@gmail.com"),
                new User("Краснов", "Константин", "Васильевич", 1995, "krasnov@gmail.com"),
                new User("Колосов", "Василий", "Владимирович", 1964, "kolosov@gmail.com"),
                new User("Осипов", "Алексей", "Сергеевич", 1996, "osipov@gmail.com"),
        };
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].yearOfBirth < date) {
                userArray[i].info();
            }

        }
    }
}



