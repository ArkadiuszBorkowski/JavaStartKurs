package Abstrakcja.cw2.model;

public class FullTimeEmployee extends Employee {

    private double baseSalary;

    public FullTimeEmployee(String firstName, String lastName, double baseSalary) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
    }


    @Override
    public double totalMonthlySalary() {
        return baseSalary;
    }

    @Override
    public double totalYearlySalary() {
        double salary = totalMonthlySalary() * NO_OF_MONTH;
        double bonus = salary * 0.05;
        return salary + bonus;
    }
}
