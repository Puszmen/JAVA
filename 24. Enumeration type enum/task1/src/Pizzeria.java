import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {

        System.out.println("Dostępna pizza:");

        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }

        Scanner in = new Scanner(System.in);

        System.out.println("Jaką pizzę wybierasz ?");

        Pizza pizza = Pizza.valueOf(in.nextLine());

        System.out.println("Dziękujemy za zamówienie pizzy " + pizza.name());
        in.close();
    }
}
