import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź swój wiek:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wprowadź swoje imię:");
        String firstName = scanner.nextLine();
        System.out.println("Wprowadź swoje nazwisko:");
        String lastName = scanner.nextLine();

        System.out.println("Cześć "+firstName+" "+lastName+" !");
        System.out.println("Masz już "+age+" lat, starość nie radość :(");
    }
}