package vehicles;

public class Car extends WheeledVehicle {

    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }


    public void printInfo() {
        System.out.println("Informacje o samochodzie:");
        System.out.println("Silnik: " + getEngine().getType());
        System.out.println("Ilość koni: " + getEngine().getPower());
        System.out.println("Ilość drzwi: " + getDoors());
    }
}
