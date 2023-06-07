import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Podaj ile liczb chcesz zsumować");

        int sum = 0;
        int number = reader.nextInt();

        while (number-- > 0) {
            System.out.println("Podaj liczbę");
            sum = sum + reader.nextInt();
        }
        System.out.println("Suma liczb wynosi: " + sum);
        reader.close();
    }
}
