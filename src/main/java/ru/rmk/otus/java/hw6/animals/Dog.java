package ru.rmk.otus.java.hw6.animals;

public class Dog extends Animal{
    public Dog(String name, int speedRun, int swimingRun, int endurance){
        super(name, speedRun, swimingRun, endurance);
    }
@Override
    public int swim(int distance){
    int time = distance / speedRun;
    if (endurance*2 < distance) {
        System.out.println("Затраченое время: -1. Вы обоссались, поменяйте штанцы " + name);
        return -1;
    }
    if(speedRun > 0){
        System.out.println(name +" пробежит " + distance + " метров за " + time);
        endurance -= distance;
        return time;
    }
    return -1;
}

}
