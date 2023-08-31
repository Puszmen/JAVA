import java.io.*;
import java.util.Scanner;

public class CompanyApp {

    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;
    private static final String FILE_NAME = "employees.info";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Wybierz opcję:");
        System.out.println(READ_FROM_USER + " - wprowadź dane pracowników");
        System.out.println(READ_FROM_FILE + " - wczytaj i wyświetl dane pracowników");

        int option = scanner.nextInt();
        scanner.nextLine();

        if (option == READ_FROM_USER) {
            Company company = createCompany();
            writeFile(company);
        } else if (option == READ_FROM_FILE) {
            try {
                Company company = readFile();
                System.out.println(company);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Błąd wczytywania pliku.");
            }
        }
        scanner.close();
    }

    private static Company readFile() throws IOException, ClassNotFoundException {
        try (
                var fis = new FileInputStream(FILE_NAME);
                var ois = new ObjectInputStream(fis);
            ) {
            return (Company) ois.readObject();
        }
    }

    private static void writeFile(Company company) {
        try (
                var fos = new FileOutputStream(FILE_NAME);
                var oos = new ObjectOutputStream(fos);
            ) {
            oos.writeObject(company);
            System.out.println("Zapisano dane do pliku.");
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku.");
        }
    }

    private static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < Company.MAX_EMPLOYEES; i++) {
            System.out.println("Wprowadź imię pracownika");
            String firstName = scanner.nextLine();
            System.out.println("Wprowadź nazwisko pracownika");
            String secondName = scanner.nextLine();
            System.out.println("Wprowadź zarobki pracownika");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            company.add(new Employee(firstName, secondName, salary));
        }
        return company;
    }

}
