package Class.zad3;

import java.sql.SQLOutput;
import java.util.Scanner;

class Garden {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Plant plant1 = new Plant();
        plant1.name = "Storczyk";
        plant1.description = "Kolorowy kwiatek";

        System.out.println("Wpisz zapotrzebowanie dzienne na wodę dla kwiatka: " + plant1.name);
        plant1.waterConsumption = scanner.nextDouble();
        scanner.nextLine();


        Plant plant2 = new Plant();
        plant2.name = "Monstera";
        plant2.description = "Duży zielony kwiat z wielkimi liścmi";

        System.out.println("Wpisz zapotrzebowanie dzienne na wodę dla kwiatka: " + plant2.name);
        plant2.waterConsumption = scanner.nextDouble();
        scanner.nextLine();


        Plant plant3 = new Plant();
        plant3.name = "Fikus";
        plant3.description = "Zielony kwiatek";

        System.out.println("Wpisz zapotrzebowanie dzienne na wodę dla kwiatka: " + plant3.name);
        plant3.waterConsumption = scanner.nextDouble();
        scanner.nextLine();

        double dailyWaterConsumption = plant1.waterConsumption + plant2.waterConsumption + plant3.waterConsumption;
        double weeklyWaterConsumption = 7 * dailyWaterConsumption;
        double yearlyWaterConsumption = 365 * dailyWaterConsumption;

        System.out.println("Dzienne zużycie przez rośliny wynosi " + dailyWaterConsumption + " litrów wody");
        System.out.println("Tygodniowe zużycie przez rośliny wynosi " + weeklyWaterConsumption + " litrów wody");
        System.out.println("Roczne zużycie przez rośliny wynosi " + yearlyWaterConsumption + " litrów wody");
    }
}
