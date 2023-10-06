package This.zad2;

import java.util.Scanner;

public class DiceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice1 = new Dice(1);
        dice1.printInfo();

        Dice dice2 = new Dice();
        dice2.printInfo();

        dice1.roll();
        dice1.printInfo();

    }
}
