package JavaControlStatements;

import java.util.Scanner;

public class IfTestWithUserCase {
    public static void main(String[] args) {
        User user = new User("Jan", "Kowalski");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybirz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informację o użytkowniku");
        System.out.println("2 - modyfikacja danych");

        String firstName;
        String lastName;

        int option = scanner.nextInt();

        if (option == 0) {
            System.out.println("Goodbye");
        } else if (option == 1){
            System.out.println("Użytkownik " + user.getFirstName() + " " + user.getLastName());
        } else if (option == 2) {
            scanner.nextLine();
            System.out.println("Wpisz imię:");
            user.setFirstName(scanner.nextLine());

            System.out.println("Wpisz nazwisko:");
            user.setLastName(scanner.nextLine());

            System.out.println("Użytkownik " + user.getFirstName() + " " + user.getLastName());
        } else {
            System.out.println("Błędna opcja");
        }

    }
}
