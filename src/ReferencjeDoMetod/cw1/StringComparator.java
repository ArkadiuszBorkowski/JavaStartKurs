package ReferencjeDoMetod.cw1;

//Stwórz listę 5 imion w losowej kolejności. Korzystając z metody Collections.sort() oraz referencji do metody
//String.compareToIgnoreCase() posortuj ją w porządku rosnącym, a następnie wyświetl wynik na ekranie.

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek");

        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        names.forEach(System.out::println);

    }
}
