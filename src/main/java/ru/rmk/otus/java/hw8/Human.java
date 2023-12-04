package ru.rmk.otus.java.hw8;

public class Human {
    private final String name;
    private Transport currentTransport;
    private int stamina;
    private final int staminaPerMeter;
    private boolean isSitingOnTransport;
    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Human(String name, int stamina) {
        this.name = name;
        this.currentTransport = null;
        this.stamina = stamina;
        this.staminaPerMeter = 4;
        this.isSitingOnTransport = false;
    }
    public boolean drive(Terrain location, int distance){
        if(distance < 0){
            System.out.println("Расстояние меньше нуля");
            return false;
        }
        if(currentTransport != null){
            return currentTransport.drive(distance, location);
        }
        if(stamina > distance * staminaPerMeter){
            stamina -= distance * staminaPerMeter;
            System.out.println(name + " Идет пешком " + distance + " метров");
            return true;
        }else{
            System.out.println("Человек ослаб");
            return false;
        }
    }
    public void info(){
        System.out.println("Выносливость человека: " + stamina);
    }
    public void setDrive(Transport transport){
        if(!isSitingOnTransport){
            currentTransport = transport;
            System.out.println(name + " сел в: " + transport);
        }else {
            System.out.println(name + " уже сидит в "  + transport);
        }
    }
}
