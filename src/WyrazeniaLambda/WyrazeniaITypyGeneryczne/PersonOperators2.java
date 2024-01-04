package WyrazeniaLambda.WyrazeniaITypyGeneryczne;

import WyrazeniaLambda.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonOperators2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 42));
        people.add(new Person("Kasia", "Kruczkowska", 22));
        people.add(new Person("Piotr", "Adamiak", 15));
        people.add(new Person("Jan", "Zawadzki", 17));
        people.add(new Person("Krzysztof", "Wojtyniak", 16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna", 28));

        for (Person person : people) {
            int currentAge = person.getAge();
            person.setAge(currentAge + 1);
            System.out.println(person);
        }

        System.out.println(">>FirstNames");
        List<String> firstNames = new ArrayList<>();
        for (Person person : people) {
            firstNames.add(person.getFirstName());
        }
        System.out.println(firstNames);
    }
}
