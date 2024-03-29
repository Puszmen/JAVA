public class Employee extends Person {

    private double salary;

    public Employee(String firstName, String secondName, double salary) {
        super(firstName, secondName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", wynagrodzenie: " + salary;
    }
}
