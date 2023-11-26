package TextFile.cw.io;

import TextFile.cw.model.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);
    private ConsolePrinter printer = new ConsolePrinter();

    public Employee createNewEmployee() {
        String firstName = null;
        String lastName = null;
        double salary = 0;
            printer.printLine("Podaj imię:");
            firstName = sc.nextLine();

            printer.printLine("Podaj nazwisko:");
            lastName = sc.nextLine();

            printer.printLine("Podaj kwotę zarobków:");
            salary = sc.nextDouble();

        return new Employee(firstName, lastName, salary);
    }

    public int getInt() {
        try {
            return sc.nextInt();
        } finally {
            sc.nextLine();
        }
    }
}
