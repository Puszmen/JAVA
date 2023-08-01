import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wciśnij ENTER aby rzucić kostką");
        sc.nextLine();
        String diceRoll = Dice.roll();
        System.out.println(diceRoll);

    }
}
