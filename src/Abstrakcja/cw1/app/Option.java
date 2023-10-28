package Abstrakcja.cw1.app;

public enum Option {
    EXIT("WYJŚCIE Z PROGRAMU"),
    CIRCLE("KOŁO"),
    TRIANGLE("TRÓJKĄT"),
    RECTANGLE("PROSTOKĄT"),
    ;

    private final String description;

    Option(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    static void printOptions() {
        String options = "";
        for (Option value : Option.values()) {
            options += " - " + value + " (" + value.ordinal() + ")";
        }
        System.out.println(options);
    }

    static Option getOptionFromInt(int option) {
        Option[] optionsArray = Option.values();
        return optionsArray[option];
    }

//
}
