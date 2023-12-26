package TabliceArrays.cw.io;

import TabliceArrays.cw.model.Person;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter printer = new ConsolePrinter();


    public Person createPerson() {
        printer.printLine("Podaj imię");
        String firstName = scanner.nextLine();

        printer.printLine("Podaj nazwisko");
        String lastName = scanner.nextLine();

        printer.printLine("Podaj pesel");
        String pesel = scanner.nextLine();

        return new Person(firstName,lastName, pesel);
    }

    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

}
