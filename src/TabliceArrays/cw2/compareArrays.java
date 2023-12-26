package TabliceArrays.cw2;

import java.util.Arrays;
import java.util.Scanner;

public class compareArrays {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String firstWord = inputText();
        String secondWord = inputText();

        boolean compareResult = compareLetters(firstWord, secondWord);
        if (compareResult)
            System.out.println("Wyrazy składają się z takich samych liter");
        else
            System.out.println("Wyrazy nie składają się z takich samych liter");

    }

    private static char[] makeArraysSort(String arg) {
        char[] chars = arg.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return chars;
    }

    private static String inputText() {
        System.out.println("Wpisz wyraz:");
        return scanner.nextLine();
    }

    private static boolean compareLetters(String s1, String s2) {
        if (s1 == null && s2 == null)
            return true;
        if (s1 == null || s2 == null || s1.length() != s2.length())
            return false;
        char[] chars1 = makeArraysSort(s1);
        char[] chars2 = makeArraysSort(s2);

        return Arrays.equals(chars1, chars2);
    }

}
