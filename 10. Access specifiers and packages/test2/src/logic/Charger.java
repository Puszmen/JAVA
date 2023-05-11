package logic;
import model.Telephone;

public class Charger {

    public void charge (Telephone battery) {
        int batteryCharging = battery.getChargeLevel() + 1;
        battery.setChargeLevel(batteryCharging);
    }
}