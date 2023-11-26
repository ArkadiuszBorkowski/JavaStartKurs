package TextFile.cw.model;


import TextFile.cw.model.Employee;

import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable {
    private static final int INITIAL_CAPACITY = 100;
    private int numberOfEmployees;
    private Employee[] employees = new Employee[INITIAL_CAPACITY];

    public void addEmployees(Employee employee) {
        if (numberOfEmployees <= employees.length) {
            System.err.println("Osiągnięto maksymalną wielkość tablicy.");;
        }
        employees[numberOfEmployees] = employee;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void printEmployess() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
