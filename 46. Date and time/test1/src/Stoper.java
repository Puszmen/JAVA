import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Naciśnij ENTER aby zacząć odliczanie czasu");
            scanner.nextLine();
            Instant i1 = Instant.now();

            System.out.println("Nasiśnij ponownie ENTER aby zatrzymać odliczanie czasu");
            scanner.nextLine();
            Instant i2 = Instant.now();

            Duration stoper = Duration.between(i1, i2);
            System.out.println("Zamierzony czas wyniósł " + stoper.getSeconds() + " sekund");
        }
    }
}
