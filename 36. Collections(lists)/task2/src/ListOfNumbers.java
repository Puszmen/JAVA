import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = readNumbersFromUser();
        showStats(numbers);

    }

    private static void showStats(List<Integer> numbersCorrect) {
        int sum = sumNumbers(numbersCorrect);
        double avg = ((double) sum) / numbersCorrect.size();

        System.out.println("Ilość prób z poprawną liczbą: " + numbersCorrect.size());
        System.out.println("Suma liczb z tych prób: " + sum);
        System.out.println("Ich średnia: " + avg);
    }

    private static int sumNumbers(List<Integer> numbersCorrect) {
        int sum = 0;
        for (Integer integer : numbersCorrect) {
            sum += integer;
        }
        return sum;
    }

    private static List<Integer> readNumbersFromUser() {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int next = 0;
        boolean correctNumbers = true;

        while (correctNumbers) {
            System.out.println("Podaj liczbę nieujemną i podzielną przez 5");
            next = sc.nextInt();
            if (next >= 0 && next % 5 == 0) {
                numbers.add(next);
            } else {
                correctNumbers = false;
            }
        }
        return numbers;
    }
}
