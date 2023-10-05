package Methods.calc;

public class Calculate {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a = 5;
        double b = 10;

        System.out.println("a + b = " + calc.add(5,10));
        System.out.println("a - b = " + calc.subtract(5,10));
        System.out.println("a * b = " + calc.multiply(5,10));
        System.out.println("a / b = " + calc.divide(5,10));
    }

}
