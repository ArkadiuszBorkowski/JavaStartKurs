package ForForEach.cw2;

import java.util.Scanner;

public class Patient {
    private String firstName;
    private String lastName;
    private String pesel;

    Scanner scanner = new Scanner(System.in);

    public Patient(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public Patient() {
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Patient createPatient() {
        System.out.println("Wprowadź imię pacjenta");
        firstName = scanner.nextLine();
        System.out.println("Wprowadź nazwisko pacjenta");
        lastName = scanner.nextLine();
        System.out.println("Wprowadź pesel pacjenta");
        pesel = scanner.nextLine();
        return new Patient(firstName, lastName,pesel);
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + " " +pesel;
    }
}
