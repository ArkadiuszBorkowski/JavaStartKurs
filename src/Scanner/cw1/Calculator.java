package Scanner.cw1;


import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    private double calculate(double firstNumber, String operator, double secondNumber) {

        double result = 0;

        switch (operator) {
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            default:
                System.out.println("Podany operator nie istnieje");
        }
        return result;
    }

    public void calcApp() {
        double result = 0;
        double firstNumber;
        String operator;
        double secondNumber;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Wprowadź pierwszą liczbę");
        firstNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Wprowadź operator matematyczny");
        operator = scanner.nextLine();

        System.out.println("Wprowadź drugą liczbę");
        secondNumber = scanner.nextDouble();

        result = calculate(firstNumber, operator, secondNumber);
        System.out.println(result);
    }

}

