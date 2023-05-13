public class HelloName {
    public static void main(String[] args) {
        final String name1 = "Piotr";
        final String name2 = "Radek";
        final String name3 = "Patryk";
        final String name4 = "Paweł";

        String name = "Radek";

        switch (name) {
            case name1:
            case name2:
            case name3:
                System.out.println("Elo, witaj w appce!");
                break;
            case name4:
                System.out.println("Dzień dobry Panie prezesie, witamy w aplikacji.");
                break;
            default:
                System.out.println("Witaj nieznajomy w naszej aplikacji.");
        }
        System.out.println("Koniec aplikacji");

        int option = 2;
        switch (option) {
            case 0:
                System.out.println("Koniec programu(2)");
                break;
            case 1:
                System.out.println("Dodawanie nowego użytkownika");
                break;
            case 2:
                System.out.println("Modyfikacja użytkownika");
            default:
                System.out.println("Opcja nieznana");
        }
        System.out.println("Zamknięcie programów");

    }
}