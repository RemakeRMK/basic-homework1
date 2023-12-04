package ru.rmk.otus.java.hw8;

public class Car implements Transport {
    private final int consuption;
    private int petrol;
    public Car() {
        this.consuption = 3;
        this.petrol = 30;
    }
    @Override
    public boolean drive(int distance, Terrain location){
        if(location == Terrain.SWAMP && location == Terrain.FOREST){
            System.out.println("Машина ездит только по дороге");
            return false;
        }
        if((distance * consuption) / 100000 < petrol){
            petrol -= (consuption * distance) / 100000;
            System.out.println("Вездеход проехал: " + distance + " метровю Осталось: " + petrol + " литров");
            return true;
        }
        System.out.println("Бензина не хватит");
        return false;
    }
}

