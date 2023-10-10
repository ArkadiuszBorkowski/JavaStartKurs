package ForForEach;

import java.util.Scanner;

public class cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumbers;
        int sum = 0;

        System.out.println("Wprowadź ilość liczb, które chcesz zsumować");
        int numbers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numbers; i++) {
            System.out.println("Wprowadź liczbę nr " + (i + 1));
            inputNumbers = scanner.nextInt();
            sum += inputNumbers;
        }

        System.out.println("Wprowadzono " + numbers + " liczb, których suma wynosi " + sum);
    }
}
