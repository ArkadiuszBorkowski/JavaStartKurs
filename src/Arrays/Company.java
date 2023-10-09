package Arrays;

public class Company {
    public static void main(String[] args) {
        Employee employee[] = new Employee[20];
        employee[0] = new Employee("Szymon", "Hołowczyc", 3500);
        employee[1] = new Employee("Krzysztof", "Kosak", 3500);
        employee[2] = new Employee("Donald", "Musk", 3500);
        employee[3] = new Employee("Mateusz", "Bobrowiecki", 3500);


        int employeeIndex = 2;
        System.out.println(employee[employeeIndex-1].getFirstName() + " " +
                employee[employeeIndex-1].getLastName() + " " +
                employee[employeeIndex-1].getSalary() + " zł");

    }
}
