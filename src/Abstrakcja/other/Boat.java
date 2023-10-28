package Abstrakcja.other;

public interface Boat {
    public default void printName() {
        System.out.println("Boat");
    }
}
