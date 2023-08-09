public class Car {

    private static final double FUEL_CONSUMPTION = 8;
    private static final double MAX_FUEL = 50;
    private double fuel;

    public void refuel (double additionalFuel) {
        if (fuel + additionalFuel > MAX_FUEL)
            throw new IllegalArgumentException("Błąd takowania. Możesz zatankować " + (MAX_FUEL - fuel) + " l paliwa.");
//            System.out.println("Błąd takowania. Możesz zatankować " + (MAX_FUEL - fuel) + " l paliwa.");
         else
            fuel += additionalFuel;
    }

    public void drive () {
        if (fuel - FUEL_CONSUMPTION <= 0)
            throw new IllegalStateException("Masz za mało paliwa. Zatankuj pojazd.");
//            System.out.println("Masz za mało paliwa. Zatankuj pojazd");
         else
            fuel -= FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Stan paliwa " + fuel;
    }
}
