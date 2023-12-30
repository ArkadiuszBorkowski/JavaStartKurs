package Mapy.cw1;

import java.util.Scanner;

public class CompanyLogic {
    Company company = new Company();
    private static Scanner scanner = new Scanner(System.in);

    public void mainMenuProgram() {
        Option option;


        do {
            Option.printOptions();
            option = getOption();

            switch (option) {
                case EXIT -> System.out.println("Do zobaczenia");

                case ADD_EMPLOYEE -> {
                    createEmployee();

                }
                case EDIT_EMPLOYEE -> {
                    removeEmployee();
                    createEmployee();
                }
                case REMOVE_EMPLOYEE -> removeEmployee();
                case SHOW_EMPLOYEE -> printEmployee();
                case FIND_EMPLOYEE -> findEmployee();

            }
        } while (option != Option.EXIT);
    }

    public void createEmployee() {
        Employee employee = readAndCreateEmployee();
        boolean tryAddEmployee = company.addEmployee(employee);
        if (tryAddEmployee) {
            System.out.println("Dodano pracownika: " + employee.getFirstName() + " " + employee.getLastName());
        } else {
            System.out.println("Nie udało się dodać pracownika");
        }
    }

    private void removeEmployee() {
        System.out.println("Dane pracownika do edycji");
        company.removeEmployee(keyEmployee());


    }

    private String keyEmployee() {
        System.out.println("Podaj imię i nazwisko");
        return  scanner.nextLine();
    }

    private void findEmployee() {
        scanner.nextLine();
        System.out.println("Podaj imię");
        String firstName = scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();

        Employee employee = company.getEmployee(firstName, lastName);
        if (employee == null)
            System.out.println("Brak pracownika " + firstName + " " + lastName);
        System.out.println(employee);
    }

    private Option getOption() {
        System.out.println("Wprowadź wartość liczbową by wybrać daną opcję:");
        int option = scanner.nextInt();
        return Option.getOptionFromInt(option);
    }

    private void printEmployee() {
        company.printEmployee();
    }

    private Employee readAndCreateEmployee() {
        scanner.nextLine();
        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wypłatę:");
        double salary = scanner.nextDouble();


        return new Employee(firstName, lastName, salary);
    }



    private enum Option {
        EXIT("WYJŚCIE"),
        ADD_EMPLOYEE("DODAJ PRACOWNIKA"),
        EDIT_EMPLOYEE("EDYTUJ DANE PRACOWNIKA"),
        REMOVE_EMPLOYEE("USUŃ DANE PRACOWNIKA"),
        SHOW_EMPLOYEE("LISTA PRACOWNIKÓW"),
        FIND_EMPLOYEE("ZNAJDŹ PRACOWNIKA");

        String description;

        Option(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        static void printOptions() {
            Option[] values = Option.values();
            for (Option value : values) {
                System.out.println(value);
            }
        }

        static Option getOptionFromInt(int option) {
            Option[] values = Option.values();
            return values[option];
        }

        @Override
        public String toString() {
            return ordinal() + " - " + description;
        }

    }

}
