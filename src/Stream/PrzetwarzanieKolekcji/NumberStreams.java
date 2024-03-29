package Stream.PrzetwarzanieKolekcji;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NumberStreams {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
        // lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = numStream.map(x -> x*x)
                .limit(100)
                .collect(Collectors.toList());
        // zbiór kwadratów liczb
        Set<Integer> biggerThan5 = squareNumbers.stream()
                .filter(x -> x%10 ==0)
                .map(x -> x/10)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareNumbers.forEach(x -> System.out.print(x + " ; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x -> System.out.print(x + " ; "));
    }
}