package logic;

public class Car {

    public final static int OK = 100;
    public final static int ERROR_CHECK_ENGINE = 200;
    public final static int ERROR_NO_FUEL = 300;
    public final static int ERROR_FUEL_FLAP = 400;
    public final static int ERROR_DOOR_OPEN = 500;


    private int fuel;
    private boolean engineOk;
    private boolean engineOn;
    private boolean fuelFlapOpen;
    private boolean doorsOpen;

    public Car(int fuel, boolean engineOK, boolean engineOn, boolean fuelFlapOpen, boolean doorsOpen) {
        this.fuel = fuel;
        this.engineOk = engineOK;
        this.engineOn = engineOn;
        this.fuelFlapOpen = fuelFlapOpen;
        this.doorsOpen = doorsOpen;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel <= 0) {
            engineOn = false;
        }
        this.fuel = fuel;
    }

    public boolean isEngineOK() {
        return engineOk;
    }

    public void setEngineOK(boolean engineOK) {
        if (!engineOK) {
            engineOn = false;
        }
        this.engineOk = engineOK;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        int systemCheck = systemCheck();
        if (systemCheck == ERROR_CHECK_ENGINE || systemCheck == ERROR_NO_FUEL) {
            this.engineOn = false;
        } else {
            this.engineOn = engineOn;
        }
    }

    public boolean isFuelFlapOpen() {
        return fuelFlapOpen;
    }

    public void setFuelFlapOpen(boolean fuelFlapOpen) {
        this.fuelFlapOpen = fuelFlapOpen;
    }

    public boolean isDoorsOpen() {
        return doorsOpen;
    }

    public void setDoorsOpen(boolean doorsOpen) {
        this.doorsOpen = doorsOpen;
    }

    public int start() {
        int systemCheck = systemCheck();
        setEngineOn(true);
        return systemCheck;
    }

    private int systemCheck() {
        if (!engineOk) {
            return ERROR_CHECK_ENGINE;
        }
        if (fuel == 0) {
            return ERROR_NO_FUEL;
        }
        if (fuelFlapOpen) {
            return ERROR_FUEL_FLAP;
        }
        if (doorsOpen) {
            return ERROR_DOOR_OPEN;
        }
        return OK;
    }

    public String status() {
        if (systemCheck() == OK)
            return "Wszystkie systemy sprawne, możesz jechać";
        String status = "Status samochodu: \n";
            if (!engineOk)
                status += " > silnik uszkodzony \n";
            if (fuel == 0)
                status += " > brak paliwa \n";
            if (fuelFlapOpen)
                status += " > zamknij wlew paliwa \n";
            if (doorsOpen)
                status += " > zamknij drzwi lub bagażnik \n";
            if (engineOn)
                status += " > silnik włączony \n";
            else
                status += " > silnik wyłączony \n";
            return status;
    }
}