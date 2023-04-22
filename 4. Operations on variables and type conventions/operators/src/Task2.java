import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random randomValue = new Random();

        int netto = randomValue.nextInt(1000);
        double tax = 0.23;
        double brutto = netto * tax;
        double cenaPoOpodatkowaniu = netto + brutto;
        double procentTAX = tax * 100;

        System.out.println("Cena towaru wynosi: " + netto + " zł");
        System.out.println("Podatek z towaru wynosi: " + brutto + " zł");
        System.out.println("Podatek wynosi: " + procentTAX + " %");
        System.out.println("Cena towaru po opodatkowaniu wynosi: " + cenaPoOpodatkowaniu + " zł");

    }
}
