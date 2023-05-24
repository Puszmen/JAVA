public class Company {
    public static void main(String[] args) {

        Employee[] employees = new Employee[20];
        employees[0] = new Employee("Jan","Kowalski",3500);
        employees[1] = new Employee("Adam","Nowak",4000);
        employees[2] = new Employee("Jan","Niezbędny",4500);

        int employeeIndex = 25;

        if (employeeIndex >= 0 && employeeIndex < employees.length) {
            System.out.println(employees[employeeIndex - 1].getFirstName() + " " + employees[employeeIndex - 1].getLastName()
                    + ", wynagrodzenie: " + employees[employeeIndex - 1].getSalary() + " zł");
        } else {
            System.out.println("Index wykracza za granicę tablicy");
        }
    }
}
