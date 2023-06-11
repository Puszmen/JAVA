package app;

import data.UnitConversion;

import java.util.Scanner;

public class Kitchen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj składniki przepisu");
        System.out.println("Ilość szklanek wody");
        double waterGlass = input.nextDouble();
        System.out.println("Ilość łyżek oleju");
        double oilSpoon = input.nextDouble();
        System.out.println("Ilość łyżeczek miodu");
        double honeySpoon = input.nextDouble();

        double waterToMl = UnitConversion.glassCounter(waterGlass);
        double oilToMl = UnitConversion.bigSpoonCounter(oilSpoon);
        double honeyToMl = UnitConversion.smallSpoonCounter(honeySpoon);

        System.out.println("Do przepisu potrzebujemy:");
        System.out.println(waterGlass + " szklanki wody, czyli: " + waterToMl + " ml");
        System.out.println(oilSpoon + " łyżki oleju, czyli: " + oilToMl + " ml");
        System.out.println(honeySpoon + " łyżeczki miodu, czyli: " + honeyToMl + " ml");
    }
}
