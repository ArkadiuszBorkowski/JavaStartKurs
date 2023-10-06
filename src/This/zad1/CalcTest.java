package This.zad1;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(6, 7));
        System.out.println(calculator.add(6, 7, 9));
        System.out.println(calculator.subtract(6, 7));
        System.out.println(calculator.subtract(6, 7, 9));
    }
}
