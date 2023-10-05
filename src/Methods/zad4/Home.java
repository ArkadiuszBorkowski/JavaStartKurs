package Methods.zad4;

public class Home {
    double water;
    double fuel;

    Home(double w, double f) {
        water = w;
        fuel = f;
    }

    void takeShower() {
        water -= 48;
    }

    void takeBath() {
        water -= 86;
    }

    void makeDinner() {
        water -=  4;
        fuel -=  0.1;
    }

    void boilWater() {
        water -= 0.5;
        fuel -= 0.1;
    }

    void watchTV(int hour) {
        fuel -= (hour * 0.06);
    }

    void getStatus() {
        System.out.println("Stan wody = " + water + " , stan paliwa = " + fuel);
    }
}
