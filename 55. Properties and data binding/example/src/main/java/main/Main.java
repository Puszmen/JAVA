package main;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntegerProperty first = new SimpleIntegerProperty();
        IntegerProperty second = new SimpleIntegerProperty();

        second.bind(first);
        second.addListener((observableValue, oldValue, newValue) -> System.out.println("Liczba po zmianie: " + newValue));

        System.out.println("Podaj pierwszą liczbę:");
        first.set(sc.nextInt());
        sc.nextLine();

        System.out.println("Podaj drugą liczbę:");
        first.set(sc.nextInt());

        sc.close();

    }
}
