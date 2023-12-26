package TabliceArrays.cw.io;

import TabliceArrays.cw.model.Person;

public class ConsolePrinter {

    public void printLine (String s) {
        System.out.println(s);
    }

    public void printPerson(Person[] people) {
        int counter = 0;

        for (Person person : people) {

            if (person != null) {
            System.out.println(person);
            counter++;
            }

        }

        if (counter == 0)
            System.out.println("Brak rekordów w bazie");

    }
}
