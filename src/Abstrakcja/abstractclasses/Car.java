package Abstrakcja.abstractclasses;

class Car extends Vehicle {

    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 5);
    }

}
