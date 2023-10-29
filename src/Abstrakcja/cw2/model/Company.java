package Abstrakcja.cw2.model;

import Abstrakcja.cw2.io.ConsolePrinter;
import Abstrakcja.cw2.io.DataReader;

public class Company {

    private static final int MAX_EMPLOYEE = 100;
    private int employeeNumber = 0;
    private Employee[] employees = new Employee[MAX_EMPLOYEE];

    public Employee[] getEmployee() {
        Employee[] result = new Employee[employeeNumber];

        for (int i = 0; i < employeeNumber; i++) {
            result[i] = employees[i];
        }
        return result;
    }


    public void addEmployee(Employee employee) {
        employees[employeeNumber] = employee;
        employeeNumber++;

        if (employeeNumber >= MAX_EMPLOYEE) {
            String error = ConsolePrinter.outputStringPLorUS(
                    "Maksymalna liczba pracowników osiągnieta",
                    "Max employees exceeded",
                    false, true);
            throw new ArrayIndexOutOfBoundsException(error + MAX_EMPLOYEE);
        }
    }

    public void addPartTimeEmployee(PartTimeEmployee partTimeEmployee) {
       addEmployee(partTimeEmployee);
    }

    public void addFullTimeEmployee(FullTimeEmployee fullTimeEmployee) {
        addEmployee(fullTimeEmployee);
    }
}
