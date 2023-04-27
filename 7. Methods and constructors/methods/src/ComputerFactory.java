public class ComputerFactory {

    Computer create(String processor, int memory) {
        Computer computer = new Computer();
        computer.procesor = processor;
        computer.memory = memory;
        return computer;
    }
}
