package other;

public class Amphibia implements Car, Boat {
    @Override
    public void printName() {
        System.out.println("Amphibia to pół:");
        Car.super.printName();
        System.out.println("pół");
        Boat.super.printName();
    }
}
