public class Nurse extends Person {

    private double overtime;

    public Nurse(String name, String surname, double salary, double overtime) {
        super(name, surname, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", nadgodziny: " + overtime;
    }
}
