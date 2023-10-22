package Enum.cw1;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze:");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz pizzę:");
        Pizza pizza = Pizza.valueOf(input.nextLine());

        System.out.println("Dziękujemy za wybranie pizzy: "  + pizza.name());
        input.close();
    }
}
