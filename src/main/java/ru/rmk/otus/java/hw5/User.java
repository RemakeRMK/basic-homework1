package ru.rmk.otus.java.hw5;

import java.util.PrimitiveIterator;

public class User {
    private String surName;
    private String name;
    private String patronymic;
    private int yearOfBirth;
    private String email;
    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public User(String surName, String name, String surName2, int age, String email) {
        this.surName = surName;
        this.name = name;
        this.patronymic = surName2;
        this.yearOfBirth = age;
        this.email = email;
    }

    public void info() {
        System.out.println("ФИО: " + surName + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("E-mail: " + email);
    }
}
