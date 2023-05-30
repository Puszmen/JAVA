package logic;

import java.util.Random;
import java.util.Scanner;

public class ThrowTest {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    private final int obverse = 1;
    private final int reverse = 0;
    private final int noChoice = -1;
    private int userChoice = noChoice;
    private int flipResult = -1;

    private void showOptions () {
        System.out.println("Wybierz jedną z dwóch opcji");
        System.out.println(obverse + " - orzeł");
        System.out.println(reverse + " - reszka");
    }

    public void betResult () {
        showOptions();
        userChoice = input.nextInt();
    }

    public void flipCoin () {
        flipResult = random.nextInt(2);
    }

    public void showResults () {
        if (userChoice == noChoice) {
            System.out.println("Nie obstawiono wyniku");
        } else if (flipResult == noChoice) {
            System.out.println("Nie rzucono monetą");
        } else if (userChoice == flipResult) {
            if (flipResult == obverse) {
                System.out.println("Brawo !! wypadł orzeł, wygrałeś !!");
            } else {
                System.out.println("Brawo !! wypadła reszka, wygrałeś !!");
            }
        } else {
            System.out.println("Niestety przegrałeś");
        }
    }
}