package Methods;

public class ComputerFactory {

    Computer create(String processor, int memory) {
        Computer computer = new Computer();
        computer.processor = processor;
        computer.memory = memory;
        return computer;
    }

}
