package Abstrakcja.cw2.app;

import Abstrakcja.cw2.io.ConsolePrinter;

public enum Option {
    EXIT( "WYJŚCIE Z PROGRAMU"),
    ADD_FULL_TIME_EMPLOYEE ("DODAJ PRACOWNIKA PEŁNOETATOWEGO"),
    ADD_PART_TIME_EMPLOYEE("DODAJ PRACOWNIKA NIEPEŁNOETATOWEGO"),
    PRINT_ALL_EMPLOYEE("POKAŻ LISTĘ WSZYSTKICH PRACOWNIKÓW"),
    PRINT_FULL_TIME_EMPLOYEE("POKAŻ LISTĘ PRACOWNIKÓW PEŁNOETATOWYCH"),
    PRINT_PART_TIME_EMPLOYEE("POKAŻ LISTĘ PRACOWNIKÓW NIEPEŁNOETATOWYCH"),
    EDIT_EMPLOYEE("EDYTUJ DANE PRACOWNIKA");

    private String description;

    Option(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Option getOptionFromInt(int option) {
        Option[] values = Option.values();
        return values[option];
    }

    @Override
    public String toString() {
        String text_PL = " - (" + ordinal() +") " + description;
        String text_US = " - (" + ordinal() +") " +  name();

        return  ConsolePrinter.outputStringPLorUS(text_PL, text_US,false, true);
    }


}
