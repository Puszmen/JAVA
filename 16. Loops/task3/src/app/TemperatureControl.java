package app;

import java.util.Scanner;

public class TemperatureControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj aktualną temperaturę");
        double currentTemperature = sc.nextDouble();
        System.out.println("Podaj temperaturę docelową");
        double targetTemperature = sc.nextDouble();

        while (currentTemperature != targetTemperature) {
            System.out.println("Aktualna temperatura: "+currentTemperature);
            double temperatureDif = targetTemperature - currentTemperature;
            if (temperatureDif > 0) {
                currentTemperature += 0.5;
            } else if (temperatureDif < 0) {
                currentTemperature -= 0.5;
            }
        }
        System.out.println("Osiągnięto temperaturę docelową " + currentTemperature);
    }
}
