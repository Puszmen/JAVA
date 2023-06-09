package app;

import data.Thermostat;

import java.util.Scanner;

public class TempControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj aktualną temperaturę");
        double actualTemperature = sc.nextDouble();
        System.out.println("Podaj temperaturę docelową");
        double targetTemperature = sc.nextDouble();

        Thermostat thermostat = new Thermostat(actualTemperature,targetTemperature);

        while (!thermostat.targetTemperatureReached()) {
            System.out.println("Aktualna temperatura wynosi: "+thermostat.getCurrentTemperature());
            thermostat.adjustTemperature();
        }
        System.out.println("Osiągnięto optymalną temperaturę która wynosi: "+thermostat.getCurrentTemperature());
    }
}
