package App;

import java.util.Scanner;
import calc.Calc;


public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w kalkulatorze!");
        System.out.println("Podaj pierwszą liczbę");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj działanie matematyczne które chcesz wykonać (+, -, *, /)");
        String operator = scanner.nextLine();
        System.out.println("Podaj drugą liczbę");
        double b = scanner.nextDouble();
        scanner.close();

        Calc calc = new Calc();

        double result = calc.Calculate(a,b,operator);
        System.out.println("Wynik działania wynosi: " + result);
    }
}