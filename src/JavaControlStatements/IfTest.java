package JavaControlStatements;

public class IfTest {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        int c = 50;

        if (a > b) {
            if (a > c)
                System.out.println("A jest większe od B oraz od C!");
            else
                System.out.println("A jest większe od B, ale mniejsze od C");
        } else {
            System.out.println("A jest mniejsze od B");
        }


        int d = 40;
        boolean dPositive = d > 0;
        boolean dEven = d % 2 ==0;

        if (dPositive && dEven ) {
            System.out.println("D jest liczbą parzystą i dodatnią");
        }

        if (d > 0 && d % 2 ==0 ) {
            System.out.println("D jest liczbą parzystą i dodatnią");
        }




    }
}
