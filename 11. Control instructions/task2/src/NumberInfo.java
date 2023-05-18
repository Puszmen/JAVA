import java.util.Random;

public class NumberInfo {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10000);
        Number n1 = new Number();
        System.out.println("Wylosowana liczba: "+number);
        n1.compareNumber(number, 5000);
        n1.evenNumber(number);
        System.out.println("Uzupełniona liczba do 4 cyfr to: "+n1.countNumber(number));
    }
}