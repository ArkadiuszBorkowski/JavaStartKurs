package Package.logic;

import Package.data.Car;

class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2014, "Audi", "A5", "Czarne");
        Car audiA4 = new Car(2015, "Audi", "A4");
        //w międzyczasie klient wybiera kolor:
        audiA4.setColor("Czerwony");

        System.out.println(audiA4.getBrand() + " " + audiA4.getModel() + " " + audiA4.getYear() + " " + audiA4.getColor());
        System.out.println(audiA5.getBrand() + " " + audiA5.getModel() + " " + audiA5.getYear() + " " + audiA5.getColor());
    }
}