package Methods;

public class CompterStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.processor = "Intel i5";
        comp1.memory = 8192;

        Computer comp2 = new Computer();
        comp2.processor = "Ryzen 3";
        comp2.memory = 16384;

        System.out.println(comp1.processor + " " + comp1.memory);
        System.out.println(comp2.processor + " " + comp2.memory);

        comp1.printInfo();
        comp2.printInfo();

        //robimy update ramu
        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.updateRam(comp1, 4096);
        upgrade.updateRam(comp2, 2048);

        System.out.println("Pamięć ram po zmianie: ");
        System.out.println(comp1.getInfo());
        System.out.println(comp2.getInfo());

        //
    }
}
