package TryCatch.cw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPY = "*";
    private static final String DIVIDE = "/";

    static double calculate(double a, double b, String operator) {
        double result = 0;

        switch (operator) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPY:
                result = a * b;
                break;
            case DIVIDE:
                if (b == 0)
                    throw new ArithmeticException("Nie można dzielić przez 0");
                result = a / b;
                break;
            default:
                throw new UnknownOperatorException("Niezdefiniowany operator arytmetyczny");

        }
        return result;
    }




}
