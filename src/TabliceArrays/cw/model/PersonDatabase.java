package TabliceArrays.cw.model;

import TabliceArrays.cw.model.Person;

import java.util.Arrays;

public class PersonDatabase {
    private static final int INITIAL_SIZE = 1;
    private int emptyPlace = 0;
    Person[] people = new Person[INITIAL_SIZE];

    public Person[] getPeople() {
        return people;
    }

    public void add (Person person) {
        if (person == null)
            throw new NullPointerException("person cannot be null");
        if (emptyPlace == people.length) {
            people = Arrays.copyOf(people, people.length * 2);
        }
        people[emptyPlace] = person;
        emptyPlace++;
    }

    public int getSize() {
        return emptyPlace;
    }

    public void deletePerson(Person person) {
        if (person == null)
            throw new NullPointerException("person cannot be null");
        final int notFound = -1;
        int foundIndex = notFound;
        for (int i = 0; i < emptyPlace && foundIndex == notFound; i++) {
            if (person.equals(people[i])) {
                foundIndex = i;
            }
        }
        if (foundIndex != notFound) {
            System.arraycopy(people, foundIndex + 1, people, foundIndex, people.length - foundIndex - 1);
            emptyPlace--;
            people[emptyPlace] = null;
            System.out.println("Skasowano :" + person);
        }
    }




}
