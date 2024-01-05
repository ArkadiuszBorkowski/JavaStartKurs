package WyrazeniaLambdaReferencjeMetod;

import org.w3c.dom.ls.LSOutput;

class Computer {
    private String name;
    private int cpu;
    private int temperature;

    public Computer(String name, int cpu, int temperature) {
        this.name = name;
        this.cpu = cpu;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

//    void overclock() {
//        cpu *= 1.1;
//    }

    static void overclock(Computer computer) {
        computer.cpu *= 1.1;
    }

    @Override
    public String toString() {
        String textToPrint = name + " " + cpu;
        if (temperature < 50)
            textToPrint += " / cold";
        else
            textToPrint += " / cold";
        return textToPrint;
    }
}