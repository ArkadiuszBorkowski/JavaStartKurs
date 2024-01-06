package Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StreamApi {

    public static void main(String[] args) throws FileNotFoundException {

//    W Javie 8 niektóre klasy zostały zaktualizowane, aby wykorzystać potencjał strumieni. Przykładem takiej klasy
//    jest BufferedReader, w którym pojawiła się dodatkowa metoda lines() zwracająca strumień typu Stream<String>.
//    Analogiczna metoda znajduje się od Javy 9 także w klasie Scanner i nazywa się tokens().

        Scanner scanner = new Scanner(new File("namespl.txt"));
        scanner.tokens()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
