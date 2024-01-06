package ReferencjeDoMetod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

class PersonOperators {
    //dodanie tablic do celów edukacyjnych
    private static String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
    private static String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
    private static int[] ages = {22, 33, 44, 55};

    public static void main(String[] args) {

        // () -> T
        // () -> Person (wykorzystuje konstruktor bezparametrowy utworzony w klasie Person)

        // String[] fn, String[] ln, int[] a -> Person // wykorzystanie konstruktora z parametrami tablic
        Supplier<Person> supplier = Person::new;  //--> () -> new Person();

        // String[] fn, String[] ln, int[] a -> Person // wykorzystanie konstruktora z parametrami tablic
        // aby wykorzystać takie wyrażenie należy wykorzystać interfejs, który jest sparametryzowany 4 typami.
        // 3 tablice + obiekt = 4
        // wsród gotowych interfejsów nie ma takiego, który przyjmuje wejściowo 3 parametry dlatego trzeba go stworzyć.
        // ==> PersonSupplier
        PersonSupplier supplier2 = Person::new;  //--> () -> new Person();

        List<Person> people = generateRandomList(5, supplier);
        consumeList(people, System.out::println);
    }

    private static <T> List<T> generateRandomList(int elements, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    // do celów edukacyjnych
    // przerobienie metody i wykorzystanie własnego interfejsu
    private static List<Person> generateRandomList2(int elements, PersonSupplier supplier) {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add(supplier.get(firstNames, lastNames, ages));
        }
        return result;
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}