package WyrazeniaLambda;

public class Person {
    String firstName;
    String lastName;
    double salaty;

    public Person(String firstName, String lastName, double salaty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaty = salaty;
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

    public double getSalaty() {
        return salaty;
    }

    public void setSalaty(double salaty) {
        this.salaty = salaty;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salaty=" + salaty +
                '}';
    }
}
