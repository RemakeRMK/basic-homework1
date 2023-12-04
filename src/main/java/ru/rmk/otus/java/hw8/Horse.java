package ru.rmk.otus.java.hw8;

public class Horse implements Transport {
    private int stamina;
    public Horse() {
        this.stamina = 500;
    }
    @Override
    public boolean drive(int distance, Terrain location){
        if(location == Terrain.SWAMP){
            System.out.println("Лошадь не скачет по болоту");
            return false;
        }
        if(stamina < distance){
            System.out.println("Лошадь устала");
            return false;
        }
        stamina -= distance / 2;
        System.out.println("Пройдено " + distance + " метров. Осталось: " + stamina + " выносливости");
        return true;
    }
}
