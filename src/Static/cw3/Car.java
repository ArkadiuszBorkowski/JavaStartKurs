package Static.cw3;

public class Car {
    private static int OK  = 100;
    private static int ERROR_CHECK_ENGINE = 200;
    private static int ERROR_FUEL_EMPTY = 300;
    public static final int WARNING_FUEL_FLAP_OPEN= 400;
    public static final int WARNING_DOORS_OPEN = 500;
    
    private double fuel;
    private boolean engineOk;
    private boolean engineOn;
    private boolean doorsOpen;
    private boolean fuelFlapOpen;

    public Car(double fuel, boolean engineOk, boolean engineOn, boolean doorsOpen, boolean fuelFlapOpen) {
        this.fuel = fuel;
        this.engineOk = engineOk;
        this.doorsOpen = doorsOpen;
        this.fuelFlapOpen = fuelFlapOpen;
        setEngineOn(engineOn);
    }

    public void setEngineOn(boolean engineOn) {
        int systemCheck = systemCheck();
        if (systemCheck == ERROR_CHECK_ENGINE || systemCheck == ERROR_FUEL_EMPTY)
            this.engineOn = false;
        else
            this.engineOn = engineOn;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        if (fuel <= 0)
            engineOn = false;
        this.fuel = fuel;
    }

    public boolean isEngineOk() {
        return engineOk;
    }

    public void setEngineOk(boolean engineOk) {
        if (!engineOk)
            engineOn = false;
        this.engineOk = engineOk;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public boolean isDoorsOpen() {
        return doorsOpen;
    }

    public void setDoorsOpen(boolean doorsOpen) {
        this.doorsOpen = doorsOpen;
    }

    public boolean isFuelFlapOpen() {
        return fuelFlapOpen;
    }

    public void setFuelFlapOpen(boolean fuelFlapOpen) {
        this.fuelFlapOpen = fuelFlapOpen;
    }

    private int systemCheck() {
        if (!engineOk)
            return ERROR_CHECK_ENGINE;
        if (fuel == 0)
            return ERROR_FUEL_EMPTY;
        if (fuelFlapOpen)
            return WARNING_FUEL_FLAP_OPEN;
        if (doorsOpen)
            return WARNING_DOORS_OPEN;
        return OK;
    }

    int start() {
        int systemCheck = systemCheck();
        setEngineOn(true);
        return systemCheck;
    }

    String status() {
        if (systemCheck() == OK)
            return "Wszystkie systemy sprawne, możesz wyruszyć w bezpieczną podróż";
        String status = "Status samochodu: \n";
        if (!engineOk)
            status += " > Silnik uszkodzony\n";
        if (fuel == 0)
            status += " > Brak paliwa\n";
        if (fuelFlapOpen)
            status += " > Zamknij wlew paliwa\n";
        if (doorsOpen)
            status += " > Drzwi lub bagażnik są otwarte\n";
        if (engineOn)
            status += " > Silnik włączony";
        else
            status += " > Silnik wyłączony";
        return status;
    }
}
