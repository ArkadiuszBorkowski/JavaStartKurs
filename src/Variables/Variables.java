package Variables;

public class Variables {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int age;
        double height;
        final String pesel;


        firstName = "Jan";
        lastName = "Kowalski";
        age = 25;
        height = 180;
        pesel = "123456789";




        System.out.println(firstName + " " + lastName + " ma " + age + " lat.");
        System.out.println("Pan " + lastName + " ma pesel " + pesel);
        System.out.println(firstName +" ma wzrost " + height + "cm");
        System.out.println("Jeżeli " + firstName +  " urośnie o 5 cm to będzie miał 185cm");

    }
}
