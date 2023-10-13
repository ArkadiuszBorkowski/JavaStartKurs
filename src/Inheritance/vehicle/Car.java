package Inheritance.vehicle;

class Car extends WheeledVehicle {
    private int doors;

    void printInfo() {
        System.out.println("Samochód: silnik: " + getEngine().getType() + ", liczba kół: " + getWheels()  );
    }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
