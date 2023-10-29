package Abstrakcja.cw2.model;

public abstract class Employee {
    public static final int NO_OF_MONTH = 12;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract double totalMonthlySalary();
    public abstract double totalYearlySalary();

    @Override
    public String toString() {
        return firstName + " " + lastName +
                ", wypłata miesięczna: " + totalMonthlySalary() +
                ", wypłata roczna: " + totalYearlySalary();
    }
}

