package TextFile.cw1.model;

import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable {

    public static final int MAX_EMPLOYEES = 3;
    private Employee[] employees = new Employee[MAX_EMPLOYEES];
    private int employeeNumber = 0;

    public void addEmployess(Employee employee) {
        employees[employeeNumber] = employee;
        employeeNumber++;
    }

    public Employee[] getEmployee() {
        Employee[] result = new Employee[employeeNumber];

        for (int i = 0; i < employeeNumber; i++) {
            result[i] = employees[i];
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Employee employee : employees) {
            builder.append(employee.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
