package Stream;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMapExample {

    public static void main(String[] args) {

//Oprócz prostych operacji jak np filtrowanie na strumieniach można wykonać - mapowanie.
//Mapowanie to wykonywanie pewnej operacji na każdym obiekcie lub elemencie streeamu.
//Mapowanie też jest operację pośrednią - tj w wyniku otrzymujemyn nowy strumień.

        Stream<String> letters = Stream.of("a", "b", "c");
// Metoda map przyjmuje w argumencie interfejs funkcyjny, który przyjmuje obiekt T i zwracs obiekt R
// =>  letters.map(Function<T,R> )
        String[] upperCaseLetters = letters
                .map(s -> s.toUpperCase())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(upperCaseLetters));
    }

}
