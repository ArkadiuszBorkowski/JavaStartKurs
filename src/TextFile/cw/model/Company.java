package TextFile.cw;


import TextFile.cw.model.Employee;

import java.util.Arrays;

public class Company {
    private static final int INITIAL_CAPACITY = 3;
    private int numberOfEmployees;
    private Employee[] employees = new Employee[INITIAL_CAPACITY];

    public void addEmployees(Employee employee) {
        if (numberOfEmployees <= employees.length) {
            Arrays.copyOf(employees, employees.length + 10);
            System.err.println("Osiągnięto maksymalną wielkość tablicy. Pojemność tablicy zwiększono o 10");;
        }
        employees[numberOfEmployees] = employee;
    }


}
