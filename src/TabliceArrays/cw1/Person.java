package TabliceArrays.cw1;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String Pesel;

    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        Pesel = pesel;
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
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(Pesel, person.Pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, Pesel);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + Pesel;
    }
}
