package ZbiorySet.cw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameReader {
    final static String fileName = "namespl.txt";

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareTo(s2);
            }
        });

        loadData(names);


    }

    private static void loadData(TreeSet<String> names) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                names.add(scanner.nextLine());
            }

            System.out.println("Liczba imion w zbiorze = " + names.size());
            System.out.println("Pierwsze imię w zbiorze = " + names.first());
            System.out.println("Ostatnie imię w zbiorze = " + names.last());
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku " + fileName);
        }


    }
}
