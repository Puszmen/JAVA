import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {

        try {
            LocalDate date1 = readDate();
            LocalDate date2 = readDate();

            showLaterDate(date1, date2);
            showPeriodBetween(date1, date2);
        } catch (DateTimeParseException e) {
            System.err.println("Nieprawidłowy format daty");
        }
    }
    private static void showPeriodBetween(LocalDate date1, LocalDate date2) {
        Period between = Period.between(date1, date2);
        int days = Math.abs(between.getDays());
        int months = Math.abs(between.getMonths());
        int years = Math.abs(between.getYears());
        System.out.printf("Podane daty dzieli %d lat, %d miesięcy i %d dni", years, months, days);
    }

    private static void showLaterDate(LocalDate date1, LocalDate date2) {
        LocalDate laterDate = date1.isAfter(date2) ? date1 : date2;
        System.out.println("Późniejsza data: " + laterDate);
    }

    private static LocalDate readDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać datę w formacie yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dataFormat = sc.nextLine();
        return LocalDate.parse(dataFormat, dateTimeFormatter);
    }


}
