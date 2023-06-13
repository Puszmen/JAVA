package app;

import logic.Car;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car(10,true,true,false,false);
        System.out.println("Uruchamiam samochochód z paliwem, sprawnym silnikiem i wszystkim zamknietym");
        car.start();
        System.out.println(car.status());
        car.setDoorsOpen(true);
        System.out.println(car.status());

        System.out.println("Kończy się paliwo");
        car.setFuel(0);
        System.out.println(car.status());
    }
}
