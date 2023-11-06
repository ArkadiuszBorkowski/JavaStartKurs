package TypyGeneryczne.test;

public class StringContainer {
    private String[] array;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void printArray() {
        for (String i : array) {
            System.out.println(i);
        }
    }
}
