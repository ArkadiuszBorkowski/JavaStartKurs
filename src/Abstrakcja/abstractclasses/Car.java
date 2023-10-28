package Abstrakcja;

class Car extends Vehicle {
    
    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 5);
    }

}
