package Abstrakcja.abstractclasses;

abstract class Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

//    public void speedUp() { } - tworząd metodę abstrakcyjną nie trzeba tworzyć jej ciała, kończymy średnikiem

    public abstract void speedUp();

}
