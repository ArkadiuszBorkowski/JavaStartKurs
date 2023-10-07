package JavaControlStatements;

public class Switch {

    public static void main(String[] args) {
        final String name1 = "Krzysiek";
        final String name2 = "Maciek";

        String name = "Krzysiek";

        switch (name) {
            case name1:
                System.out.println("Siema Krzychu");
                break;
            case name2:
                System.out.println("Witam Prezesa");
                break;
            default:
                System.out.println("Witaj nieznajomy");
        }


    }
}
