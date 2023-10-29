package Abstrakcja.cw2.io;

import Abstrakcja.cw2.model.Employee;
import Abstrakcja.cw2.model.FullTimeEmployee;
import Abstrakcja.cw2.model.PartTimeEmployee;

import java.util.Locale;
import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter printer = new ConsolePrinter();

    public FullTimeEmployee readAndCreateFullTimeEmployee() {
        ConsolePrinter.printLine(ConsolePrinter.outputStringPLorUS("DODAWANIE PRACOWNIKA: ", "ADD EMPLOYEE", true, false));

        ConsolePrinter.printLine(ConsolePrinter.outputStringPLorUS("Podaj imię pracownika: ", "Enter the employee's name", false, true));
        String firstName = scanner.next();

        ConsolePrinter.printLine(ConsolePrinter.outputStringPLorUS("Podaj nazwisko pracownika: ", "Enter the employee's lastname", false, true));
        String lastName = scanner.next();

        ConsolePrinter.printLine(ConsolePrinter.outputStringPLorUS("Podaj miesięczne wynagrodzenie pracownika (w zł): ", "Enter the employee's month salary", false, true));
        double salary = scanner.nextDouble();

        FullTimeEmployee employee = new FullTimeEmployee(firstName, lastName, salary);
        ConsolePrinter.printLine(ConsolePrinter.outputStringPLorUS("Utworzono pracownika: ", "Create employee: ", false,
                true) + " " + employee);
        return new FullTimeEmployee(firstName, lastName, salary);
    }

    public PartTimeEmployee readAndCreatePartTimeEmployee() {
        ConsolePrinter.printLine(ConsolePrinter.outputStringPLorUS("Podaj imię pracownika: ", "Enter the employee's name", false, true));
        String firstName = scanner.next();

        ConsolePrinter.printLine(ConsolePrinter.outputStringPLorUS("Podaj nazwisko pracownika: ", "Enter the employee's lastname", false, true));
        String lastName = scanner.next();

        ConsolePrinter.printLine(ConsolePrinter.outputStringPLorUS("Podaj przepracowane godziny pracownika: ", "Enter the number of working hours per month", false, true));
        double hours = scanner.nextDouble();

        ConsolePrinter.printLine(ConsolePrinter.outputStringPLorUS("Podaj stawkę godzinową pracownika (w zł): ", "Enter the employee's hourly rate", false, true));
        double hourlyWage = scanner.nextDouble();

        PartTimeEmployee employee = new PartTimeEmployee(firstName, lastName, hours, hourlyWage);
        ConsolePrinter.printLine(ConsolePrinter.outputStringPLorUS("Utworzono pracownika: ", "Create employee: ", false, true) + " " + employee);
        return employee;
    }


    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public void setLanguage() {
        System.out.println("Wybierz język - Choose language :   1 - PL   -  2 - US");
        int lang = scanner.nextInt();
        if (lang == 2) {
            Locale.setDefault(Locale.US);
        }
    }
}
