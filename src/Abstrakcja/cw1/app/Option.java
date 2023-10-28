package Abstrakcja.cw1.app;

public enum Options {
    EXIT("WYJŚCIE Z PROGRAMU"),
    CIRCLE("KOŁO"),
    TRIANGLE("TRÓJKĄT"),
    RECTANGLE("PROSTOKĄT"),
    ;

    private final String description;

    Options(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    public void printOptions() {
        for (Options value : Options.values()) {
            value.getDescription();
        }
    }
}
