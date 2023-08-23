public class FullTimeEmployee extends Employee {

    private static final double BONUS = 0.05;
    private double basicSalary;

    public FullTimeEmployee(String name, String surname, double basicSalary) {
        super(name, surname);
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double getMonthlySalary() {
        return basicSalary;
    }

    @Override
    public double getYearlySalary() {
        double yearlySalary = getMonthlySalary() * Employee.NO_OF_MONTHS;
        double bonus = yearlySalary * BONUS;
        return bonus + yearlySalary;
    }

}
