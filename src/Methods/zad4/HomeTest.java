package Methods.zad4;

public class HomeTest {
    public static void main(String[] args) {
        Home home = new Home(10_000, 1000);
        home.getStatus();
        System.out.println("Bierzemy prysznic");
        home.takeShower();
        home.getStatus();

        System.out.println("Oglądamy TV przez 4 godziny");
        home.watchTV(4);
        home.getStatus();

        System.out.println("Gotujemy wodę");
        home.boilWater();
        home.getStatus();
    }
}