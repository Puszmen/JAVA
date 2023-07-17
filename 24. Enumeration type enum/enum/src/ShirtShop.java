import java.util.Scanner;

public class ShirtShop {

    public static void main(String[] args) {

//        System.out.println("XSMALL - " + Tshirt.XSMALL);
//        System.out.println("SMALL - " + Tshirt.SMALL);
//        System.out.println("MEDIUM - " + Tshirt.MEDIUM);
//        System.out.println("LARGE - " + Tshirt.LARGE);

//        System.out.println(Size.SMALL.getDescription() + " " + Size.SMALL.name() + " " + Size.SMALL.ordinal());
//        System.out.println(Size.MEDIUM.getDescription());
//        System.out.println(Size.LARGE.getDescription());

        Size[] values = Size.values();
        System.out.println("Dostępne rozmiary T-shirtów");
        for (Size value : values) {
            System.out.println(value.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar");

        String size = sc.nextLine();
        Size shortSize = Size.fromDescription(size);


        Tshirt tshirt = new Tshirt();
        tshirt.setSize(shortSize);
        System.out.println(tshirt.getSize());
        System.out.println("Rozmiar T-shirta: " + tshirt.getSize().getDescription());

    }
}
