package CompareComparator.cw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortCompare {

    static Random rand = new Random();

    public static void main(String[] args) {

        Integer[] tab = new Integer[20];
        fillTableWithRandomNumbers(tab);

        System.out.println("Nieposortowana:");
        System.out.println(Arrays.toString(tab));

        System.out.println("Posortowana rosnąco:");
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

        System.out.println("Posortowana malejąco:");
        Arrays.sort(tab, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(tab));

    }

    static Integer[] fillTableWithRandomNumbers(Integer[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(100);
        }
        return tab;
    }
}
