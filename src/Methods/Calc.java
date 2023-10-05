package Methods;

class Calc {

    double addTwoNumbers(double a, double b) {
        double sum = a + b;
        return  sum;
    }

    void addAndPrint(double a, double b) {
        double sum = addTwoNumbers(a,b);
        System.out.println("Wynik dodawania = " + sum);
    }
}
