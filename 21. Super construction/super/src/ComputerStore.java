public class ComputerStore {

    public static void main(String[] args) {

        Computer computer = new Computer(45, 16384);

        Notebook notebook = new Notebook(40, 8192, 10000);

        System.out.println(notebook.getCpuTemperature());
        System.out.println(notebook.getRamMemory());
        System.out.println(notebook.getBatteryCapacity());

        notebook.coolDown();
        System.out.println(notebook.getCpuTemperature());

    }
}
