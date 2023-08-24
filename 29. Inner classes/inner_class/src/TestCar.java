public class TestCar {
    public static void main(String[] args) throws InterruptedException {

        Car car = new Car();
        car.refuel(100);
        car.drive();

        // Car.Engine engine = new Car().new Engine("BMW"); // new engine from inner class
        // Car.Engine engine = new Car.Engine("BMW"); // new engine from static class (nested)

    }
}
