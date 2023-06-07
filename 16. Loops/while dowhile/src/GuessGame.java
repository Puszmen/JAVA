import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        final int number = 5;
        int userNumber;
//        System.out.println("Podaj cyfrę od 0 do 10");
//        while ((userNumber = reader.nextInt()) != number) {
//            if (userNumber > number) {
//                System.out.println("Podana liczba jest za duża, zgaduj dalej !");
//            } else {
//                System.out.println("Podana liczba jest za mała, zgaduj dalej");
//            }
//        }
//        System.out.println("Zgadłeś liczbę !");
//        reader.close();

        do {
            System.out.println("Podaj cyfrę od 0 do 10");
            userNumber = reader.nextInt();
            if (userNumber > number) {
                System.out.println("Podana liczba jest za duża, zgaduj dalej !");
            } else if (userNumber < number) {
                System.out.println("Podana liczba jest za mała, zgaduj dalej");
            }
        } while (userNumber != number);
        System.out.println("Zgadłeś liczbę !");
        reader.close();
    }
}
