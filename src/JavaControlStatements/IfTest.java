package JavaControlStatements;

public class IfTest {
    public static void main(String[] args) {
        int a = 30;
        int b = 29;

        if (a > b) {
            System.out.println("a jest większa od b");
        } else if(a < b) {
            System.out.println("a jest mniejsza od b");
        } else {
            System.out.println("a jest równe b");
        }
    }
}
