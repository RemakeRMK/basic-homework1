package ru.rmk.otus.java.hw8;

public class AllTerrainVehicle implements Transport {
    private final int consuption;
    private int petrol;
    public AllTerrainVehicle() {
        this.consuption = 4;
        this.petrol = 40;
    }
    @Override
    public boolean drive(int distance, Terrain location){
        if((distance * consuption) / 100000 < petrol){
            petrol -= (consuption * distance) / 100000;
            System.out.println("Вездеход проехал: " + distance + " метровю Осталось: " + petrol + " литров");
            return true;
        }
        System.out.println("Бензина не хватит");
        return false;
    }
}
