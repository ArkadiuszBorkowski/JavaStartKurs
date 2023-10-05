package Methods;

public class Computer {
    String processor;
    int memory;

    void printInfo() {
        System.out.println(getInfo());
    }

    String getInfo() {
        return "Procesor :" + processor + " , pamięć: " + memory;
    }
}
