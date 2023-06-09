package data;

public class Thermostat {

    private double currentTemperature;
    private double targetTemperature;

    public Thermostat(double currentTemperature, double targetTemperature) {
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public boolean targetTemperatureReached () {
        return currentTemperature == targetTemperature;
    }

    public void adjustTemperature () {
        double temperatureDiff = targetTemperature - currentTemperature;
        if (temperatureDiff > 0) {
            currentTemperature += 0.5;
        } else {
            currentTemperature -= 0.5;
        }
    }
}
