package String.cw1;

import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę imion:");
        int sizeArray = input.nextInt();
        input.nextLine();

        String[] arrays = new String[sizeArray];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Podaj kolejne imię:");
            arrays[i] = input.nextLine();
            builder.append(arrays[i].substring(arrays[i].length() - 1));
        }
        builder.toString();
        System.out.println("Nowe słowo " + builder.toString());
        input.close();
    }
}
