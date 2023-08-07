import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;
        do {
            try {
                System.out.println("Podaj pierwszą liczbę");
                numbers[0] = sc.nextInt();
                System.out.println("Podaj drugą liczbę");
                numbers[1] = sc.nextInt();
                System.out.println("Którą liczbę (1 lub 2) chcesz wyświetlić ?");
                System.out.println("Liczba " + numbers[sc.nextInt() - 1]);
                error = false;
            } catch (InputMismatchException e) {
                System.err.println("Błędna wartość, proszę podać liczbę całkowitą");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Miało być 1 lub 2, spróbuj jeszcze raz");
            } finally {
                sc.nextLine();
            }
        } while (error);
        sc.close();
    }
}
