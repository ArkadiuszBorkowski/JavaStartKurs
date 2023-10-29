package Abstrakcja.cw2.model;

import javax.xml.crypto.dom.DOMCryptoContext;

public class PartTimeEmployee extends Employee {

    private double hours;
    private double hourlyWage;

    public PartTimeEmployee(String firstName, String lastName, double hours, double hourlyWage) {
        super(firstName, lastName);
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }


    @Override
    public double totalMonthlySalary() {
        return hours * hourlyWage;
    }

    @Override
    public double totalYearlySalary() {
        return  totalMonthlySalary() * NO_OF_MONTH;
    }
}
