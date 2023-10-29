package Abstrakcja.cw2.app;

import Abstrakcja.cw2.io.ConsolePrinter;
import Abstrakcja.cw2.io.DataReader;
import Abstrakcja.cw2.model.Company;
import Abstrakcja.cw2.model.Employee;
import Abstrakcja.cw2.model.FullTimeEmployee;
import Abstrakcja.cw2.model.PartTimeEmployee;

import java.util.InputMismatchException;

public class CompanyControl {
    private Option option;
    private Company company = new Company();
    private DataReader dataReader = new DataReader();
    private ConsolePrinter printer = new ConsolePrinter();


    public void RunApp() {
        optionSelectionLoop();
    }

    private void printOptions() {
        printer.printLine(printer.outputStringPLorUS(
                '\n' + "OPCJE:",
                '\n' + "OPTIONS:",
                true,
                true));

        for (Option value : Option.values()) {
            System.out.println(value);
        }
    }

    void optionSelectionLoop() {
        Option option;

        do {
            printOptions();
            option = getOption();
            switch (option) {
                case EXIT -> printer.printLine(printer.outputStringPLorUS(
                        "Do zobaczenia", "Good bye",
                        true, true));
                case ADD_FULL_TIME_EMPLOYEE -> { addFullTimeEmployee(); }
                case ADD_PART_TIME_EMPLOYEE -> {addPartTimeEmployee(); }
                case PRINT_ALL_EMPLOYEE -> { printEmployee();
                }
                case PRINT_FULL_TIME_EMPLOYEE -> { printFullTimeEmployee();
                }
                case PRINT_PART_TIME_EMPLOYEE -> { printPartTimeEmployee();
                }
                case EDIT_EMPLOYEE -> {
                    System.out.println("W budowie...");
                }
            }
        } while (option != Option.EXIT);

    }

    private void addFullTimeEmployee() {
        FullTimeEmployee fullTimeEmployee = dataReader.readAndCreateFullTimeEmployee();
        company.addFullTimeEmployee(fullTimeEmployee);
    }

    private void addPartTimeEmployee() {
        PartTimeEmployee partTimeEmployee = dataReader.readAndCreatePartTimeEmployee();
        company.addPartTimeEmployee(partTimeEmployee);
    }

    private void printEmployee() {
        Employee[] employee = company.getEmployee();
        for (Employee employee1 : employee) {
            System.out.println(employee1);
        }
    }

    private void printFullTimeEmployee() {
        Employee[] employees = company.getEmployee();
        printer.printFullTimeEmployee(employees);
    }

    private void printPartTimeEmployee() {
        Employee[] employees = company.getEmployee();
        printer.printPartTimeEmployee(employees);
    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.getOptionFromInt(dataReader.getInt());
                optionOk = true;
            } catch (InputMismatchException ignored) {
                printer.printLine("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
            }
        }

        return option;
    }



}
