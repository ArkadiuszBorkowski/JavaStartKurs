package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers =new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj pierwszą liczbę:");
                numbers[0] = sc.nextInt();
                sc.nextLine();

                System.out.println("Podaj drugą liczbę");
                numbers[1] = sc.nextInt();
                sc.nextLine();

                System.out.println("Którą wartość wyświetlić? 1 czy 2");
                System.out.println("Liczba " + numbers[sc.nextInt()-1]);

                error = false;
            } catch (InputMismatchException e) {
                System.err.println("Nieprawidłowa liczba");
                sc.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Wartość powinna mieścić się w przedziale 1 - 2");
                sc.nextLine();
            }

        } while (error);
        sc.close();
    }
}
