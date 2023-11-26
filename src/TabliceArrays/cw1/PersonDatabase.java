package TabliceArrays.cw1;

import java.util.Arrays;

public class PersonDatabase {

    private Person[] people = new Person[1];
    private int numbersOfPerson = 0;

    public void add(Person person) {
        if (person == null)
            throw new NullPointerException("person cannot be null");
        if (numbersOfPerson == people.length) {
            people = Arrays.copyOf(people, (people.length * 2));
        }
            people[numbersOfPerson] = person;
            numbersOfPerson++;
    }

    public void remove(Person person) {
        if (person == null)
            throw new NullPointerException("person cannot be null");
        final int notFound = -1;
        int foundIndex = notFound;
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals(person)) {
                foundIndex = i;
            }
        }
        if (foundIndex != notFound) {
            System.arraycopy(people, foundIndex +1, people, foundIndex, people.length - foundIndex -1);
            numbersOfPerson--;
            people[numbersOfPerson] = null;
        }

    }

    Person get(int index) {
        if (index >= numbersOfPerson || index < 0)
            throw new ArrayIndexOutOfBoundsException("Index has to be positive and lower than " + numbersOfPerson);
        return people[index];
    }

    int size() {
        return numbersOfPerson;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonDatabase size: ");
        sb.append(numbersOfPerson);
        sb.append("\n");
        for (int i = 0; i < numbersOfPerson; i++) {
            sb.append(" > ");
            sb.append(people[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }



}
