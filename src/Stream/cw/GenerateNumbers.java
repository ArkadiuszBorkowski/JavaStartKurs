package Stream.cw;

import java.util.stream.Stream;

public class GenerateNumbers {
    public static void main(String[] args) {
        Stream.iterate(0,n -> n + 1)
                .filter(n -> n > 100 & n <1000 & n % 5 ==0)
                .limit(10)
                .map( n -> n * 3)
                .forEach(System.out::println);


    }
}
