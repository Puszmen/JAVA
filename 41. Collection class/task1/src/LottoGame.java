import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {

        System.out.println("Witaj w losowaniu lotto (DUŻY LOTEK) :)");
        List<Integer> userNumbers = readNumbersFromUser();
        Lotto lotto = new Lotto();
        int result = lotto.checkResult(userNumbers);
        List<Integer> lottoResult = lotto.getLottoResult();
        System.out.println("Twoje liczby " + userNumbers);
        System.out.println("Wynik losowania: " + lottoResult);
        if (result > 0) {
            System.out.println("GRATULACJE KOTKU !!");
            System.out.println("Ilość trafień: " + result);
        } else {
            System.out.println("Nic nie trafiłaś :(");
        }
    }

    private static List<Integer> readNumbersFromUser() {
        List<Integer> userNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        try {
        for (int i = 0; i < Lotto.MAX_NUMBERS; i++) {
            System.out.println("Podaj kolejną liczbę od 1 do 49" + ", jeszcze " + (Lotto.MAX_NUMBERS - i));
            int numbers = input.nextInt();
            if (numbers > 49) {
                System.out.println("za duża cyfra, wpisuj jeszcze raz");
                i--;
            } else if (userNumbers.contains(numbers)) {
                System.out.println("nie można tej samej cyfry");
                i--;
            } else {
                userNumbers.add(numbers);
            }
        }
            } catch (InputMismatchException e) {
                System.err.println("Wpisujemy cyferki nie literki :)");
            }
        return userNumbers;
        }
    }

