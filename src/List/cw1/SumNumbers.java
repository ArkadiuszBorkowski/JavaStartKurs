package List.cw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    private static final String EXIT = "exit";
    private static double sumNumbers = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       List<Double> numbers = new ArrayList<>();
       sumNumbers(numbers);
       printNumbers(numbers);
    }

    private static void printNumbers(List<Double> list) {
        if (!list.isEmpty()) {
            System.out.println("Suma liczb ");
            StringBuilder stringBuilder = new StringBuilder();
            double sum = 0;
            for (Double number : list) {
                stringBuilder.append(number);
                stringBuilder.append(" + ");
                sum += number;
            }
            System.out.println(stringBuilder.toString() + " = " + sum);
        }
    }

    private static void sumNumbers(List<Double> list) {

        System.out.println("Podaj kolejną liczbę: ");
        String input = scanner.nextLine();
        if (input.equals(EXIT))
            return;
        try {
            Double num = Double.parseDouble(input);
            list.add(num);
        } catch (NumberFormatException e) {
            System.err.println("Wprowadzona wartość powinna być liczbą");
        }

        sumNumbers(list);
    }



}
