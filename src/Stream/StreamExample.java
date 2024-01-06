package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

// W celu utworzenia strumirnia typów String, wykorzystujemy generyczną klasę Stream  z listą 3 obiektów a - > b - > c
// W nawiasach <> określamy typ obiektów jakie chcemy przechowywać. Nie powinnismy wykorzystywać typów prostych
// (lepiej opakowujące).

        Stream<String> stream = Stream.of("a", "b", "c");

//Są specjalne klasy do typów prostych np IntStream, bardziej efektywne.

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

// na strumieniach można wykonywać różne operacje, np filtrowanie, które jest bardzo czytelne.
// Wykorzystujemy parametr Predicte z metodą test, którą sprawdzamy za pomocą wyrażeń lambda.
// Operacje na strumieniach mogą być wykonywane tylko raz.
// Np filtrowanie wymaga utworzenia nowej zmiennej (ref) --> evenStream na której wykonujemy kolejną akcję
// Są metody pośrednie np filter  albo terminalne (które zwracają pojedyńczy wynik lub obliczanie wyników w
// struminiu

        IntStream evenStream = intStream.filter(x -> x % 2 == 0);
        int[] evenNumbers = evenStream.toArray();
        System.out.println(Arrays.toString(evenNumbers));

// Pomimo, że powyższy przykłąd nie jest błędny, dużo częściej zamiast rozbijać akcje na kolejne wiersze łaczymy
// procedury, które chemy wykonać. Np filtrowanie i wyświetlanie w jednym poleceniu.
// Dla czytelności zapisujemy każdą operacje w nowym wierszy, (.kropka na początku lini)
        IntStream streamInt = IntStream.of(1, 2, 3, 4, 5);

        int[] evenStreamMoreReadable = streamInt
                .filter(x -> x % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(evenStreamMoreReadable));

    }
}
