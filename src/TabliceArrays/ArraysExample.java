package TabliceArrays;

import java.util.Arrays;

class ArraysExample {
    public static void main(String[] args) {
        String[] names = {"Basia", "Kasia", "Wojtek", "Agnieszka", "Kacper"};
        Integer[] numbers = {4, 7, 2, 1, 14, 23, 10, 5};

        System.out.println("Names: ");
        printArray(names);
        System.out.println(Arrays.toString(names));
        System.out.println("Numbers: ");
        printArray(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

}