import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tworzę nowe wydarzenie");
        System.out.println("Podaj datę wydarzenia w formacie yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String event = scanner.nextLine();

        LocalDate localEvent = LocalDate.parse(event, dateTimeFormatter);
        System.out.println("Data wydarzenia: " + localEvent);

//        LocalDate now = LocalDate.now();
//        LocalDate january2014 = LocalDate.of(2014, 1, 20);
//        System.out.println(now.getDayOfMonth());
//
//        boolean after = now.isAfter(january2014);
//        System.out.println("Czy " + now + " jest po " + january2014 + " ?");
//        System.out.println(after);

//        LocalTime now = LocalTime.now();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(now);
//            now = now.plusSeconds(1);
//            Thread.sleep(1000);
//        }

//        Instant i1 = Instant.now();
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Miernik czasu " + i);
//        }
//        Instant i2 = Instant.now();
//
//        Duration timeGap = Duration.between(i1, i2);
//        System.out.println("Pętla wykonała się w " + timeGap.getNano() + " nanosekund");
    }
}
