package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number =0;
        boolean error = true;

        do {
            try {
                number = sc.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.err.println("podana wartość nie jest liczbą całkowitą");
                sc.nextLine();
            }
        } while (error);

        System.out.println("Podałeś: " + number);
        sc.close();
    }
}
