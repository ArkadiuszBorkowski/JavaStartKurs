package WyrazeniaLambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {
    public static void main(String[] args) {
        //wykorzystanie wyrażenia funkcyjnego FUNCTION:
        //Funkcja przyjmuje parametr T i zwraca parametr R -> Function<T,R>
        String original = "Wielki napis";
        Function<String, String> func = s -> s.toLowerCase().trim();
        String changed = func.apply(original);

        Consumer<String>  print3Times = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };

        print3Times.accept(changed);

        Predicate<Integer> checkIfAdult = age -> age >= 18;
        boolean checkAge = checkIfAdult.test(19);

        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();
        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };

    }
}
