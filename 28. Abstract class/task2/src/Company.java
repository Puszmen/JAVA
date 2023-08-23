public class Company {
    public static void main(String[] args) {
        Employee[] employees = createEmployee();
        double countMonthlySalaries = countMonthlySalaries(employees);
        double countYearlySalaries = countYearlySalaries(employees);

        printEmployees(employees);
        System.out.println("Suma miesięcznego wynagrodzenia: " + countMonthlySalaries);
        System.out.println("Suma rocznego wynagrodzenia: " + countYearlySalaries);

    }

    private static void printEmployees(Employee[] employees) {
        System.out.println("Pracownicy:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double countYearlySalaries(Employee[] employees) {
        double yearlySalary = 0;
        for (Employee employee : employees) {
            yearlySalary += employee.getYearlySalary();
        }
        return yearlySalary;
    }

    private static double countMonthlySalaries(Employee[] employees) {
        double monthlySalary = 0;
        for (Employee employee : employees) {
            monthlySalary += employee.getMonthlySalary();
        }
        return monthlySalary;
    }

    private static Employee[] createEmployee() {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Jan", "Kowalski", 5000);
        employees[1] = new PartTimeEmployee("Piotr", "Haker", 20,50);
        return employees;
    }

}
