public abstract class Employee {

    public static final int NO_OF_MONTHS = 12;
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract double getMonthlySalary ();
    public abstract double getYearlySalary();

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " " + surname);
        sb.append(", wynagrodzenie miesięczne: " + getMonthlySalary());
        sb.append(", wynagrodzenie roczne: " + getYearlySalary());
        return sb.toString();
    }

}
