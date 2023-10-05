package Methods;

class Test {
    public static void main(String[] args) {
        int x = 5;
        int y  = 10;
        int sum = x + y;

        Calc calc = new Calc();
        double sum2 = calc.addTwoNumbers(x, y);
        System.out.println("Suma wg metody 1 dla x = "  + x + " oraz y = " + y + " = " + sum);
        System.out.println("Suma wg metody 2 dla x = "  + x + " oraz y = " + y + " = " + sum2);

        calc.addAndPrint(4,6);
    }
}
