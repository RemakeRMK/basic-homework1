package ru.rmk.otus.java.hw8;
public class HomeWork8 {
    public static void main(String[] args) {
        Human human = new Human("Vasya", 5);
        Horse horse = new Horse();
        Bike bike = new Bike(human);
        AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle();


        human.info();
        human.setDrive(allTerrainVehicle);
        human.drive(Terrain.FOREST, 300);
        human.setDrive(horse);
        human.drive(Terrain.FOREST, 100);
        human.setDrive(bike);
        human.drive(Terrain.FOREST, 200);
    }
}
