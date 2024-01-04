package WyrazeniaLambda.cw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionRandom {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        // generujemy liczby
        generateRandom(randomNumbers, 10, () -> r.nextInt(1000));

        // 1 wyświetlenie
        printNumbers(randomNumbers,x -> System.out.print(x + " "));
        // usuwamy podzielne przez 2
        predicateFilter(randomNumbers, t -> t % 2 == 0);
        // 2 wyświetlenie
        System.out.println();
        printNumbers(randomNumbers,x -> System.out.print(x + " "));

    }

    private static <T> void generateRandom (List<T> list, int toGenerate, Supplier<T> sup ) {
        for (int i = 0; i < toGenerate; i++) {
            list.add(sup.get());
        }
    }

    private static <T> void printNumbers (List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    private static <T> void predicateFilter (List<T> list, Predicate<T> predicate) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.test(next)) {
                iterator.remove();
            }
        }
    }



}
