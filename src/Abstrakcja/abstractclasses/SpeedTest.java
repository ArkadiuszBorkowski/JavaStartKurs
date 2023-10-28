package Abstrakcja.abstractclasses;

public class SpeedTest {
    public static void main(String[] args) {
//        Car car = new Car();          wykorzystujemy polimofizm, czyli uogólnimy typ referencji do Vehicle, tak by
//        Plane plane = new Plane();    móc np obiekty różnego typu wrzucić do tablicy. krok 2 niżej

        Vehicle car = new Car();        //zmiana typu powoduje, że nie można odwołać się do metod speedUp.
        Vehicle plane = new Plane();
        // Vehicle vehicle = new Vehicle();  //zdefiniowanie klasy jako abstrakcyjnej = nie można użyć referencji Veh..

        car.speedUp();
        plane.speedUp();

        System.out.println("Prędkość samochodu " + car.getSpeed());
        System.out.println("Prędkość samolotu " + plane.getSpeed());
    }
}
