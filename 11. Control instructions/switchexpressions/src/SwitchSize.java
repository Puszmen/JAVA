import java.util.Scanner;
public class SwitchSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar S, M, L lub XL");
        String shortSize = scanner.nextLine();

//        switch (shortSize) {
//            case "S" -> System.out.println("Mały");
//            case "M" -> System.out.println("Średni");
//            case "L" -> System.out.println("Duży");
//            case "XL","XXL" -> System.out.println("Bardzo duży");
//            default -> System.out.println("Rozmiar nienany");
//        }
        String size = switch (shortSize) {
            case "S" -> {
                System.out.println("Przypisuję rozmiar mały");
                yield "mały";
            }
            case "M" -> "średni";
            case "L" -> "duży";
            case "XL" -> "bardzo duży";
            default -> "rozmiar nieznany";
        };
        System.out.println("Wybrany rozmiar to: " + size);

//        switch (shortSize) {
//            case "S":
//                size = "mały";
//                break;
//            case "M":
//                size = "średni";
//                break;
//            case "L":
//                size = "duży";
//                break;
//            case "XL":
//                size = "bardzo duży";
//                break;
//            default:
//                size = "rozmiar nieznany";
//        }
    }
}