package Polimorfizm.cw1;

class Person {
    private String firstName;
    private String lastName;
    private double salary;

    public Person(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getInfo() {
        return "Imię: " + firstName + ", Nazwisko: " + lastName + ", Wypłata " + salary;
    }
}
