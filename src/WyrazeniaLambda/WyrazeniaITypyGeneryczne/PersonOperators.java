package WyrazeniaLambda.WyrazeniaITypyGeneryczne;

import WyrazeniaLambda.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PersonOperators {
    public static void main(String[] args) {
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Jan", "Kowalski", 42));
//        people.add(new Person("Kasia", "Kruczkowska", 22));
//        people.add(new Person("Piotr", "Adamiak", 15));
//        people.add(new Person("Jan", "Zawadzki", 17));
//        people.add(new Person("Krzysztof", "Wojtyniak", 16));
//        people.add(new Person("Agnieszka", "Zagumna", 18));
//        people.add(new Person("Basia", "Cyniczna", 28));
//
//        for (Person person : people) {
//            int currentAge = person.getAge();
//            person.setAge(currentAge + 1);
//            System.out.println(person);
//        }

        String[] firstNamesArray = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNamesArray = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] agesArray = {22, 33, 44, 55};
        Random random = new Random();
        Supplier<Person> supplier = () -> {
            String firstName = firstNamesArray[random.nextInt(firstNamesArray.length)];
            String lastName = lastNamesArray[random.nextInt(lastNamesArray.length)];
            int age = agesArray[random.nextInt(agesArray.length)];
            return new Person(firstName, lastName, age);
        };

        //List<Person> people = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            people.add(supplier.get());
//        }

        List<Person> people = generateRandomList(5, supplier);


        getFirstNames(people);

        //printList(people);
        System.out.println(" --> people age + 1");
        consumerList(people, (Person person) -> person.setAge(person.getAge() + 1));

        System.out.println(" --> people adults ");
        //List<Person> adults = filterAdults(people);
        // ==> z wykorzystaniem predykatu:
        List<Person> adults2 = filterByPredicate(people, (Person p) -> p.getAge() >= 18);
        consumerList(adults2, p -> System.out.println(p));

        System.out.println(" --> Jan people");
        // ==> z wykorzystaniem predykatu:
        //List<Person> janPeople = filterJanPeople(people);
        List<Person> janPeople2 = filterByPredicate(people, person -> person.getFirstName().equals("Jan"));
        consumerList(janPeople2, p -> System.out.println(p));

        System.out.println(" --> FirstNames");
        //List<String> firstNames = getFirstNames(people);
        List<String> firstNames = convertList(people, person -> person.getFirstName());
        consumerList(firstNames, str -> System.out.println(str));

        System.out.println(" --> ages");
        List<Integer> ages = convertList(people, person -> person.getAge());



    }

    public static  List<String>  getFirstNames(List<Person> people) {
        List<String> firstNames = new ArrayList<>();
        for (Person person : people) {
            firstNames.add(person.getFirstName());
        }
        return firstNames;
    }


    private static <T> void consumerList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }


    // uogólnienie metody
    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }

    private static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            R result = function.apply(t);
            resultList.add(result);
        }
        return resultList;
    }

    private static <T> List<T> generateRandomList(int elements, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add(supplier.get());
        }
        return result;
    }

}
