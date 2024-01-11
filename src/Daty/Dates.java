package Daty;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Dates {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Podaj pierwszą datę w formacie dd-mm-rrrr");
        String date1 = sc.nextLine();
        LocalDate dateInput1 = LocalDate.parse(date1, dateTimeFormatter);


        System.out.println("Podaj drugą datę w formacie dd-mm-rrrr");
        String date2 = sc.nextLine();
        LocalDate dateInput2 = LocalDate.parse(date2, dateTimeFormatter);

        String dateAfter = "Póżnijszą datą jest data ";
        LocalDate localDate = dateInput1.isAfter(dateInput2) ? dateInput1 : dateInput2;
        System.out.println(dateAfter + localDate);

        showPeriodBetween(dateInput1, dateInput2);

    }

    private static void showPeriodBetween(LocalDate date1, LocalDate date2) {
        Period between = Period.between(date1, date2);
        int days = Math.abs(between.getDays());
        int months = Math.abs(between.getMonths());
        int years = Math.abs(between.getYears());
        System.out.printf("Podane daty dzieli %d lat, %d miesięcy i %d dni", years, months, days);
    }
}
