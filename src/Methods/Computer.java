package Methods;

public class Computer {
    String processor;
    int memory;

    //tworzymy konstruktor

    Computer(String proc, int mem) {
        System.out.println("Tworzę nowy komputer");
        processor = proc;
        memory = mem;
    }


    void printInfo() {
        System.out.println(getInfo());
    }

    String getInfo() {
        return "Procesor :" + processor + " , pamięć: " + memory;
    }
}
