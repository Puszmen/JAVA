import java.util.Scanner;

public class PrintNumbers {
    private static final int EXIT = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Podaj pierwszą liczbę");
            int start = input.nextInt();
            System.out.println("Podaj drugą liczbę");
            int end = input.nextInt();
            printNumbers(start, end);
            System.out.println("Jeśli chcesz zakończyć program wprowadź " + EXIT);
        } while (input.nextInt() != EXIT);

        System.out.println("Do widzenia :)))");
        input.close();
    }

    private static void printNumbers (int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
