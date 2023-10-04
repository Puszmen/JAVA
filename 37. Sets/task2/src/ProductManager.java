import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductManager {
    private static final int ADD_PRODUCT = 1;
    private static final int EXIT = 0;
    private static final int DISCARD_PRODUCT = 1;
    private static final int REPLACE_PRODUCT = 0;

    private final Set<Product> products = new HashSet<>();
    private final Scanner sc = new Scanner(System.in);

    void mainLoop () {
        int option;
        do {
            printOptions();
            option = readOption();
            evaluateOption(option);
        } while (option != EXIT);
    }

    private void evaluateOption(int option) {
        if (option == ADD_PRODUCT)
            addNextProduct();
        else if (option == EXIT)
            printProducts();
        else
            System.out.println("Nieznana opcja");
    }

    private void printProducts() {
        System.out.println("Wszystkie produkty");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private void addNextProduct() {
        Product product = createProduct();
        if (products.contains(product))
            askAndReplaceProducts(product);
        else
            addProduct(product);
    }


    private void askAndReplaceProducts(Product product) {
        System.out.println("Znaleziono produkt o takiej samej nazwie co chcesz zrobić ?");
        System.out.println("Zignoruj produkt wybierz " + DISCARD_PRODUCT);
        System.out.println("Zamień produkt wybierz " + REPLACE_PRODUCT);
        int option = readOption();
        sc.nextLine();
        if (option == REPLACE_PRODUCT) {
            products.remove(product);
            addProduct(product);
        } else {
            System.out.println("W bazie pozostawiono poprzedni produkt");
        }
    }

    private void addProduct(Product product) {
        products.add(product);
        System.out.println("Produkt dodany do bazy");
    }

    private Product createProduct() {
        System.out.println("Podaj nazwę produktu");
        String name = sc.nextLine();
        System.out.println("Podaj cenę produktu");
        double price = sc.nextDouble();
        return new Product(name, price);
    }

    private int readOption() {
        System.out.println("Wybierz opcję");
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    private void printOptions() {
        System.out.println("Dostępne opcje:");
        System.out.println("Dodaj nowy produkt wybierz " + ADD_PRODUCT);
        System.out.println("Wyjście z programu wybierz " + EXIT);
    }

}
