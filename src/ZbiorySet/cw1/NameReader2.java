package ZbiorySet.cw1;

import java.io.*;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class NameReader2 {
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
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String nextLine = null;
            int lines = 0;
            while ((nextLine = bufferedReader.readLine()) != null) {
                names.add(bufferedReader.readLine());
                lines++;
            }
            System.out.println("Liczba imion = " + names.size() + " (" + lines + ")");
            System.out.println("Pierwsze imię " + names.first());
            System.out.println("Drugie imię " + names.last());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
