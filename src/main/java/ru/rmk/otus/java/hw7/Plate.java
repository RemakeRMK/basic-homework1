package ru.rmk.otus.java.hw7;

public class Plate {
    int maxEat;
    int currentEat;

    public Plate(int maxEat, int currentEat) {
        this.maxEat = maxEat;
        this.currentEat = currentEat;
    }
    public int addEat(int eat) {
        if (currentEat + eat > maxEat) {
            currentEat = maxEat;
            System.out.println("Извини уважаемый, переборщил!");
        }
        if(currentEat<maxEat) {
            currentEat = currentEat + eat;
            System.out.println("Вы заполнили тарелку едой " + currentEat);
        }
        return maxEat;
    }
    public boolean decreasePlate(int decreaseEat) {
        int finalEat = currentEat - decreaseEat;
        if (finalEat >= 0) {
            currentEat = finalEat;
            System.out.println("В тарелке осталось " + finalEat + " еды");
        }
        if (finalEat < 0) {
            currentEat = 0;
            System.out.println("В тарелке еды: " + currentEat);
            System.out.println("Тарелка пустая!");
        }
        return false;
    }
    public void info(){
        System.out.println("В тарелке " + currentEat);
    }
    }


