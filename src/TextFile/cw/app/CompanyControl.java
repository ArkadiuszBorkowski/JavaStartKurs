package TextFile.cw.app;

import TextFile.cw.io.ConsolePrinter;
import TextFile.cw.io.DataReader;
import TextFile.cw.model.Company;
import TextFile.cw.model.Employee;

import java.util.InputMismatchException;

public class CompanyControl {
    ConsolePrinter printer = new ConsolePrinter();
    DataReader dataReader = new DataReader();
    Company company = new Company();


    void menu() {
        Options options;
        do {
            printOptions();
            options = getOptions();
            if (options != null) {
                switch (options) {
                    case EXIT -> System.out.println("Do widzenia");
                    case READ_FROM_USERS -> readFromUser();
                    case READ_FROM_FILES -> System.out.println("Do widzenia");
                    default -> System.err.println("brak opcji");
                }
            }
        } while (options != Options.EXIT);
    }

    private void readFromUser() {
        System.out.println("Wczytywanie danych od użytkownika");
        Employee employee = dataReader.createNewEmployee();
        company.addEmployees(employee);
        company.printEmployess();
    }

    private Options getOptions() {
        boolean optionOk = false;
        Options option = null;

        while (!optionOk) {
            try {
                option = Options.createFromInt(dataReader.getInt());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Wybrałeś opcję, która nie istnieje, spróbuj ponownie");
            } catch (InputMismatchException e) {
                System.err.println("Należy wybrać wartość liczbową");
            }
            optionOk = true;
        }
        return option;
    }

    private void printOptions() {
        Options options;
        printer.printLine("Wybierz jedną z opcjci");
        for (Options value : Options.values()) {
            System.out.println(value);
        }

    }


    private enum Options {
        EXIT(0, "Wyjście"),
        READ_FROM_USERS(1, "Wczytaj dane od użytkownika"),
        READ_FROM_FILES(2, "Wczytaj dane z pliku");

        private int value;
        private String description;

        Options(int value, String description) {
            this.value = value;
            this.description = description;
        }

        @Override
        public String toString() {
            return value + " " + description;
        }

        static Options createFromInt(int option) {
            Options[] values = Options.values();
            return values[option];

        }

    }

}
