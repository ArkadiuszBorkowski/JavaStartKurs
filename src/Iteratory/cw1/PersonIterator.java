package Iteratory.cw1;

import java.util.*;

public class PersonIterator {
    public static void main(String[] args) {

        Map<String, Person> persons = new TreeMap<>();
        persons.put("Kowalski", new Person("Jan", "Kowalski", 35));
        persons.put("Adamiak", new Person("Ania", "Adamiak", 21));
        persons.put("Zaręba", new Person("Adam", "Zaręba", 17));
        persons.put("Piotrowski", new Person("Karol", "Piotrowski", 42));
        persons.put("Bobrowska", new Person("Michalina", "Bobrowska", 15));

        Collection<Person> values = persons.values();
        Iterator<Person> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}
