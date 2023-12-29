package List.cw;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum {
    private static final String EXIT = "exit";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        fillList(list);
        printData(list);
    }

    static void fillList(List<Double> list) {
        String input;

        do {
            System.out.println("Podaj kolejną liczbę lub wpisz \"exit\" by wyświetlić sumę");
            input = scanner.nextLine();

            if (input.equals(Sum.EXIT))
                return;

            Double num = Double.parseDouble(input);
            list.add(num);

        } while (!input.equals(Sum.EXIT));

    }

    static void printData(List<Double> list) {
        double sum = 0;
        StringBuilder sb = new StringBuilder();
        for (double d : list) {
            sum += d;
            sb.append(d);
            sb.append(" + ");
        }
        sb.replace(sb.length() -2 , sb.length(), " = ");
        sb.append(sum);
        System.out.println(sb);
    }



}
