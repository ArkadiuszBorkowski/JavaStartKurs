package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamIterateRangeClosed {
    public static void main(String[] args) {

// Tworzenie strumieni na bazie generatora : wykorzystanie metody iterate() z klasy Stream, IntStream lub podobnej.
// Jako pierwszy argument przyjmuje ona wartość początkową strumienia (w ogólności dowolny obiekt),
// a jako drugi parametr wyrażenie lambda, zgodne z interfejsem UnaryOperator. Interfejs ten rozszerza
// interfejs Function i posiada metodę:  T apply(T t);

        IntStream numStream = IntStream.iterate(0, x -> x + 1);  // brak górnego ograniczenia
        IntStream limitedStream = numStream.limit(100);                // górne ograniczenie do 100 liczb
        int[] numbers = limitedStream.toArray();                       // strumień leniwy
        System.out.println(Arrays.toString(numbers));

// To co odróżnia UnaryOperator od interfejsu Function, to fakt, że w tym przypadku funkcja przyjmuje i zwraca obiekt
// tego samego typu. W przypadku interfejsu Function mogliśmy przyjąć obiekt jednego typu i zwrócić coś innego.

// Strumienie są leniwe, pomimo że bazowy strumień reprezentuje potencjalnie nieskończoną sekwencję elementów, to nie
// będą one generowane, dopóki nie będą potrzebne. Innym sposobem jest strumień z liczbami z zamkniętego przedziału
// jest wykorzystanie metody rangeClosed() gdzie podajemy wartość początkową i końcową strumienia

        IntStream numbersRanged = IntStream.rangeClosed(0, 99);  // brak górnego ograniczenia
        IntStream limitedStream2 = numbersRanged.limit(100);     // górne ograniczenie do 100 liczb
        int[] numbers2 = limitedStream2.toArray();               // strumień leniwy
        System.out.println(Arrays.toString(numbers2));

//        Na strumieniu utworzonym z wykorzystaniem metody iterate() możesz oczywiście wykonywać dalsze operacje.
//        Przykładowo jeżeli chcesz utworzyć tablicę 100 liczb, które będą kwadratami kolejnych 100
//        liczb całkowitych, rozpoczynając od 0, to zapiszemy to tak:

        int[] squares = IntStream.iterate(0, x -> x + 1)
                .limit(100)
                .map(x -> x * x)
                .filter(x -> x % 2 == 0)
                .toArray();

        //Jeżeli z tych liczb chcielibyśmy pobrać wyłącznie liczby parzyste, to wystarczy w sekwencję wywołania metod
        //wpleść dodatkowo metodę filter() (jak wyżej).
    }
}
