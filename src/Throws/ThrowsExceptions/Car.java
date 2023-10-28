package Throws.ThrowsExceptions;

class Car {
    private static final double FUEL_CONSUMPTION = 8;  // 8l//100km
    private static final double MAX_FUEL = 50;
    private double fuel;

    public void refuel(double additionalFuel) {
        if(fuel + additionalFuel > MAX_FUEL)
            throw new IllegalArgumentException("Nie możesz zatankować tyle paliwa. Maksymalnie się jeszcze zmieścci");
            //System.out.println("Nie możesz zatankować tyle paliwa. Maksymalnie się jeszcze zmieścci" + (MAX_FUEL -
            // fuel));
        else
            fuel += additionalFuel;
    }

    public void drive() {
        if( fuel - FUEL_CONSUMPTION < 0)
            throw new IllegalStateException("Masz za mało paliwa na podróż. Zatankuj");
            //System.out.println("Masz za mało paliwa. Zatankuj");
        else
            fuel -= FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Stan paliwa: " + fuel;
    }
}
