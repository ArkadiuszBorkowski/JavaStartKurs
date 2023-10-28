package Throws.cw1;

import Throws.cw1.Exceptions.UnknownOperatorExceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        boolean readComplete = false;
        double a = 0;
        double b = 0;
        String operator = null;


        while (!readComplete) {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                a = input.nextDouble();
                input.nextLine();

                System.out.println("Podaj operator arytmetyczny: + - / * ");
                operator = input.nextLine();

                System.out.println("Podaj drugą liczbę");
                b = input.nextDouble();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane");
            } finally {
                input.nextLine();
            }
        }

        try{
            double result = Calculator.calculate(a, operator, b);
            System.out.println(a + operator + b + " = " + result);
        } catch (UnknownOperatorExceptions e) {
            System.err.println(e.getMessage());
            System.err.println("Nie udało się wyliczyć wyniku wyrażenia " + a + operator + b);
        }



    }
}
