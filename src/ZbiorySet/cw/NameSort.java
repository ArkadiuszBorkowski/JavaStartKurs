package ZbiorySet.cw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NameSort {

    final static String fileName = "namespl.txt";

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        nameReader(names);
        printName(names);
    }

   public static void nameReader(TreeSet<String> names) {
       try (Scanner scanner = new Scanner(new File(fileName))){
           while (scanner.hasNextLine()) {
               names.add(scanner.nextLine());
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }

   public static void printName(TreeSet<String> names) {
       System.out.println("Pierwsze imię " + names.first());
       System.out.println("Ostatnie imię " + names.last());
       System.out.println("Liczba unikalnych imion =" + names.size());
       System.out.println();

       for (String s : names) {
           System.out.println(s);
       }
   }
}
