package Methods;

public class CompterStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.procesor = "Intel i5";
        comp1.memory = 8192;

        Computer comp2 = new Computer();
        comp2.procesor = "Ryzen 3";
        comp2.memory = 16384;

        System.out.println(comp1.processor + " " + comp1.memory);
        System.out.println(comp2.processor + " " + comp2.memory);
    }
}
