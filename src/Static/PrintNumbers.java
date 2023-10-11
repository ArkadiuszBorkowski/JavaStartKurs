package Static;

import java.util.Scanner;

class PrintNumbers {
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Pierwsza liczba");
            int start = scanner.nextInt();

            System.out.println("Druga liczba");
            int end = scanner.nextInt();

            printNumbers(start, end);

            System.out.println("Koniec programu? Wprowadź " + EXIT);

        }   while (scanner.nextInt() !=EXIT);
    }

    private static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
