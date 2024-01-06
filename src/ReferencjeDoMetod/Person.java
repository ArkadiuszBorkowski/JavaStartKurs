package ReferencjeDoMetod;

import java.util.Random;

class Person {
    private static String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
    private static String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
    private static int[] ages = {22, 33, 44, 55};
    private static Random random = new Random();

    private String firstName;
    private String lastName;
    private int age;

    Person() {
        firstName = firstNames[random.nextInt(firstNames.length)];
        lastName = lastNames[random.nextInt(lastNames.length)];
        age = ages[random.nextInt(ages.length)];
    }

    //dodanie konstruktora do celów edukacyjnych, tablice tworzy w klasie PersonOperators
    Person(String[] firstNames, String [] lastNames, int[] ages) {
        firstName = firstNames[random.nextInt(firstNames.length)];
        lastName = lastNames[random.nextInt(lastNames.length)];
        age = ages[random.nextInt(ages.length)];
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
}