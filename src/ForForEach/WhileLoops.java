package ForForEach;

import java.util.Random;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(1000);

        int userInput;
        int counter = 0;

        System.out.println("Zgadnij liczbę");

        while ((userInput = reader.nextInt()) != number) {
            if (userInput < number) {
                System.out.println("Liczba jest za mała, próbuj dalej");
            } else {
                System.out.println("Liczba jest za duża, próbuj dalej");
            }
            counter++;
        }

        System.out.println("Bingo !! Udało Ci się odgadnąć za " + counter + " podejściem.");
        reader.close();
    }
}
