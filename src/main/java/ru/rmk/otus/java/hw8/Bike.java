package ru.rmk.otus.java.hw8;

public class Bike implements Transport{
    private final Human staminaHuman;



    private final  int staminaPerMeter;

    public Bike(Human staminaHuman) {
        this.staminaHuman = staminaHuman;
        this.staminaPerMeter = 2;
    }
    @Override
    public boolean drive(int distance, Terrain location){
        if(location == Terrain.SWAMP){
            System.out.println("Влеосипед не может ехать по болоту");
            return false;
        }
        if(staminaHuman.getStamina() >= staminaHuman.getStamina() - distance * staminaPerMeter){
            int remainingStamina = staminaHuman.getStamina() - distance * staminaPerMeter;
            staminaHuman.setStamina(remainingStamina);
            System.out.println("Велосипед проехал " + distance + " метров");
            return true;
        }else{
            System.out.println("Нет соляры");
            return false;
        }
    }
}
