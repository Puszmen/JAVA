import java.util.Scanner;
public class CompanyApp {
    private static final int ADD_EMPLOYEE = 1;
    private static final int FIND_EMPLOYEE = 2;
    private static final int EXIT = 3;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Company company = new Company();
        int userOption;

        do {
            printOptions();
            userOption = chooseOption();
            scanner.nextLine();
            switch (userOption) {
                case ADD_EMPLOYEE -> {
                    Employee employee = addAndCreateEmployee();
                    company.addEmployee(employee);
                }
                case FIND_EMPLOYEE -> findEmployee(company);
                case EXIT -> System.out.println("Zamknięcie programu");
            }
        } while (userOption != EXIT);

    }

    private static void findEmployee(Company company) {
        System.out.println("Podaj imię pracownika");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wynagrodzenie pracownika");
        Employee employee = company.getEmployee(firstName,lastName);
        if (employee == null) {
            System.out.println("Brak takiego pracownika");
        } else {
            System.out.println(employee);
        }
    }

    private static Employee addAndCreateEmployee() {
        System.out.println("Podaj imię pracownika");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wynagrodzenie pracownika");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        return new Employee(firstName, lastName, salary);
    }

    private static int chooseOption() {
        System.out.println("Wybierz opcję");
        return scanner.nextInt();
    }

    private static void printOptions() {
        System.out.println("Wybierz dostępne opcje");
        System.out.println("Dodaj pracownika wybierz " + ADD_EMPLOYEE);
        System.out.println("Wyszukaj pracownika wybierz " + FIND_EMPLOYEE);
        System.out.println("Wyjście z programu wybierz " + EXIT);
    }
}
