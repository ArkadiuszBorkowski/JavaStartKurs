package Abstrakcja.abstractclasses;

class Plane extends Vehicle {

    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 100);
    }

//    public void speedUp() {
//        setSpeed(getSpeed() + 100);
//    }    - to samo można zrobić wciskając alt + enter => implements methods na nazwie klasy


}
