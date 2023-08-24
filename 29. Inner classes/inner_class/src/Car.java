public class Car {

    private static int fuel;
    private Engine engine;

    public Car() {
        engine = new Engine("Opel");
        System.out.println("Utworzono samochód z silnikiem: " + engine.engineType);
    }

    public void drive () throws InterruptedException {
        while (fuel > 0) {
            engine.consumeFuel();
            System.out.println("Pozostało " + fuel + " litrów paliwa.");
            Thread.sleep(1000);
        }
        System.out.println("Brak paliwa");
    }

    public void refuel (int litres) {
        fuel += litres;
    }

    public static class Engine {
        private String engineType;
        private static final int FUEL_CONSUMPTION = 20;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public void consumeFuel () {
            if (fuel >= FUEL_CONSUMPTION)
                fuel = fuel - FUEL_CONSUMPTION;
            else
                fuel = 0;
        }
    }
}
