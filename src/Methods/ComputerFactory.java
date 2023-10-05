package Methods;

public class ComputerFactory {

    Computer create(String processor, int memory) {
        Computer computer = new Computer(processor, memory);
        computer.processor = processor;
        computer.memory = memory;
        return computer;
    }

}
