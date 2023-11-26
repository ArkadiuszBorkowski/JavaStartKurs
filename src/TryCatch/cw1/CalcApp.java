package TryCatch.cw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class CalcApp {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double a = 0;
        String operator = null;
        double b = 0;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                System.out.println("PODAJ PIERWSZĄ LICZBĘ");
                a = Double.parseDouble(bufferedReader.readLine());

                System.out.println("PODAJ OPERATOR MATEMATYCZNY ( + , - , * lub / )");
                operator = bufferedReader.readLine();

                System.out.println("PODAJ DRUGĄ LICZBĘ");
                b = Double.parseDouble(bufferedReader.readLine());
                readComplete = true;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                System.err.println("Nieprawidłowy format liczby");
            } catch (InputMismatchException e) {
                System.err.println("Nieprawidłowy format liczby");
            }
        }

        try {
            double result = Calc.calculate(a, b, operator);
            System.out.println(a + " " + operator + " " + b + " = " + result);
        } catch (UnknownOperatorException | ArithmeticException e ) {
            System.err.println(e.getMessage());
            System.err.println("Nie udało się obliczyć wyniku wyrażenia " + a + operator + b);
        }


    }
}
