import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double a = 0;
        double b = 0;
        String operator = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                System.out.println("Podaj pierwszą liczbę");
                a = input.nextDouble();
                input.nextLine();
                System.out.println("Podaj operator arytmetyczny (+, - , * lub /)");
                operator = input.nextLine();
                System.out.println("Podaj drugą liczbę");
                b = input.nextDouble();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.err.println("Wprowadzono nieprawidłowe dane, spróbuj jeszcze raz");
            } finally {
                input.nextLine();
            }
        }

        try {
            double result = Calculator.calculate(a, b, operator);
            System.out.println(a + operator + b + " = " + result);
        } catch (UnknownOperatorException | InputMismatchException e) {
            System.err.println(e.getMessage());
            System.err.println("Nie udało się obliczyć wyrażenia " + a + operator + b);
        }
    }
}
