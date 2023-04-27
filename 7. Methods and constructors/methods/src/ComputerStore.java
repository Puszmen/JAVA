public class ComputerStore {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer comp1 = factory.create("Intel i5", 8192);
//        comp1.procesor = "Intel i5";
//        comp1.memory = 8192;

        Computer comp2 = factory.create("AMD Ryzen 700", 16_384);
//        comp2.procesor = "AMD Ryzen 700";
//        comp2.memory = 16_384;

        comp1.printInfo();
        comp2.printInfo();

        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(comp1, 1024);
        comp1.printInfo();
    }
}
