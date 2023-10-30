package InnerClass.Inner;

public class Car {
    private int fuel;
    private Engine engine;



    public Car() {
        engine = new Engine("Ferrari");
        System.out.println("Utworzono samochód z silnikiem: " + engine);
    }

    public void go()  {
        while (fuel > 0) {
            engine.consumeFuel();
            System.out.println("Pozostało " + fuel + " litrów paliwa");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("brak paliwa");
    }

    public void refuel(int liters) {
        fuel += liters;
    }

    public class Engine {
        private String engineType;
        private static final int FUEL_CONSUMPTION = 8;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public void consumeFuel() {
            fuel = fuel - FUEL_CONSUMPTION;
        }


    }
}
