package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        boolean logic = true;

        System.out.print("x<10 && y<11? ");
        System.out.println(x < 10 && y < 11);

        System.out.print("x<10 && y<10? ");
        System.out.println(x < 10 && y < 10);

        System.out.print("x<10 || y<10? ");
        System.out.println(x < 10 || y < 10);

        System.out.print(logic);
        System.out.print(" , !logic = ");
        System.out.println(!logic);

        System.out.print("Warunek złożony !(x<10 && y<10) ");
        System.out.println(!(x < 10 && y < 10));
    }
}