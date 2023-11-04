package ru.rmk.otus.java.hw6.animals;

public class Cat extends Animal{
    public Cat(String name, int speedRun, int swimingRun, int endurance){
super(name, speedRun, swimingRun, endurance);
    }
    @Override
    public void info(){
        System.out.println("Котик по имени " + name + " бегает со скоростью " + speedRun + "м/с, а вот плавать не умеет!");
    }
}
