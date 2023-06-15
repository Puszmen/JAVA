import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {

        int next = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (next = scanner.nextInt(); next <= 100; next = scanner.nextInt() ) {
            sum += next;
        }

        int mod = sum % 2;

        if (mod == 0) {
            System.out.println(sum + " Liczba jest parzysta");
        } else {
            System.out.println(sum + " Liczba jest nieparzysta");
        }

    }
}
