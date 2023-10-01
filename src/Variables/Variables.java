package Variables;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        int age;
        double height;
        final String pesel;

        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadź swoje imię");
        firstName = input.nextLine();

        System.out.println("Wprowadź swoje nazwisko");
        lastName = input.nextLine();

        System.out.println("Wprowadź swój wiek");
        age = input.nextInt();
        input.nextLine();

        System.out.println("Wprowadź swój pesel");
        pesel = input.nextLine();

        System.out.println("Wprowadź swój wzrost");
        height = input.nextDouble();



        System.out.println(firstName + " " + lastName + " ma " + age + " lat.");

        System.out.println(lastName + " ma pesel " + pesel);
        System.out.println(firstName +" ma wzrost " + height + "cm");
        System.out.println("Jeżeli " + firstName +  " urośnie o 5 cm to będzie miał " + (height + 5) + "cm");

    }
}
