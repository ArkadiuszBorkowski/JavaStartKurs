package Abstrakcja.cw2.io;

import Abstrakcja.cw2.model.Employee;
import Abstrakcja.cw2.model.FullTimeEmployee;
import Abstrakcja.cw2.model.PartTimeEmployee;

import java.util.Locale;

public class ConsolePrinter {

    public ConsolePrinter() {
    }

    public static String outputStringPLorUS(String textPL, String textUS, boolean newLine, boolean UpperCase) {
        String lang = Locale.getDefault().getCountry();
        String outputText;

        if (lang.equals("PL")) {
            outputText = textPL.toUpperCase();
        } else {
            outputText = textUS.toUpperCase();
        }

        if (UpperCase == true)
            outputText = outputText.toUpperCase();

        if (newLine == true)
            outputText += '\n';

        return outputText;
    }

    public static void printLine(String text) {
        System.out.print(text);
    }


    public void printFullTimeEmployee(Employee[] employees) {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                System.out.println(employee.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine(outputStringPLorUS("Brak pracowników", "No employees", true, true));
    }

    public void printPartTimeEmployee(Employee[] employees) {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee) {
                System.out.println(employee.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine(outputStringPLorUS("Brak pracowników", "No employees", true, true));
    }



}
