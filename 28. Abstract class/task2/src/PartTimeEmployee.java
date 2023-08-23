public class PartTimeEmployee extends Employee {

    private int workingHours;
    private double hoursSalary;

    public PartTimeEmployee(String name, String surname, int workingHours, double hoursSalary) {
        super(name, surname);
        this.workingHours = workingHours;
        this.hoursSalary = hoursSalary;
    }
    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getHoursSalary() {
        return hoursSalary;
    }

    public void setHoursSalary(double hoursSalary) {
        this.hoursSalary = hoursSalary;
    }

    @Override
    public double getMonthlySalary() {
        return workingHours * hoursSalary;
    }

    @Override
    public double getYearlySalary() {
        return getMonthlySalary() * Employee.NO_OF_MONTHS;
    }
}
