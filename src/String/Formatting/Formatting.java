package String.Formatting;

public class Formatting {
    public static void main(String[] args) {

        String firstName = "Jan";
        String lastName = "Kowalski";
        int age = 23;
        char gender = 'M';
        double height = 1.89;

//        %b - boolean
//        %s - string
//        %c - char
//        %f - float
//        %d - decimal
//        %n - znak nowego wiersza

        System.out.printf("Imię: %s, Nazwisko: %s, Wiek: %d, Płeć: %c, Wzrost: %f%n",
                firstName,lastName,age,gender,height);

    }
}
