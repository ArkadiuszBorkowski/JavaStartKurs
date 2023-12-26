package TabliceArrays.cw.app;

import TabliceArrays.cw.io.ConsolePrinter;
import TabliceArrays.cw.io.DataReader;
import TabliceArrays.cw.model.Person;
import TabliceArrays.cw.model.PersonDatabase;

import javax.xml.crypto.Data;

public class DatabaseControl {
    DataReader dataReader = new DataReader();
    ConsolePrinter consolePrinter = new ConsolePrinter();
    PersonDatabase personDatabase = new PersonDatabase();
    Person person;

    void controlLoop()  {
        consolePrinter.printLine("Dostępne opcje:");
        Option option;

        do {
            printOptions();
            option = getOption();

            switch (option) {
                case EXIT -> System.out.println("Bye bye");
                case ADD_PERSON ->  addPerson();
                case PRINT_PERSON -> printPerson();
                case PRINT_SIZE -> printSize();
                case DELETE_PERSON -> deletePerson();
            }

        } while (option != Option.EXIT);
    }

    private void deletePerson() {
        person = dataReader.createPerson();
        personDatabase.deletePerson(person);
    }

    private void printSize() {
        System.out.println("Rozmiar bazy = " + personDatabase.getSize());
    }

    private void addPerson() {
        person = dataReader.createPerson();
        personDatabase.add(person);
        System.out.println("Dodano: " + person);
    }

    private void printPerson() {
        consolePrinter.printPerson(personDatabase.getPeople());
    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            option = Option.createFromInt(dataReader.getInt());
            optionOk = true;
        }
        return option;
    }

    private void printOptions() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }
    }


    private enum Option {
        EXIT(0, "Wyjście z programu"),
        ADD_PERSON(1, "Dodaj użytkownika"),
        PRINT_PERSON(2, "Wyświetl użytkowników"),
        PRINT_SIZE(3, "Wyświetl rozmiar bazy"),
        DELETE_PERSON(4, "Usuń użytkownika");

        private int value;
        private String description;

        public int getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }

        Option(int value, String desc) {
            this.value = value;
            this.description = desc;
        }

        @Override
        public String toString() {
            return value + " - " + description ;
        }

        static Option createFromInt(int option){
                return Option.values()[option];
        }
    }
}
