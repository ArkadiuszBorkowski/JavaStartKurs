package Throws.cw1;
import Throws.cw1.Exceptions.UnknownOperatorExceptions;


public class Calculator {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    static double calculate(double a, String operator, double b) {
        double result = 0;

        switch(operator) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                if (b == 0)
                throw new ArithmeticException("Nie dzieli się przez zero");

                result = a / b;
                break;
            default:
                throw new UnknownOperatorExceptions("Wykorzytujesz niezdefiniowany operator");
        }
            return result;
    }
}
