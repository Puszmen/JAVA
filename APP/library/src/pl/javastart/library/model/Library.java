package pl.javastart.library.model;

public class Library {

    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MAGAZINES = 1000;
    private Book[] books = new Book[MAX_BOOKS];
    private Magazine[] magazines = new Magazine[MAX_MAGAZINES];
    private int booksNumber = 0;
    private int magazinesNumbers = 0;

    public void addBook (Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Osiągnięto maksymalną liczbę książek w bibliotece");
        }
    }
    public void printBooks () {
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }

    public void addMagazine (Magazine magazine) {
        if (magazinesNumbers < MAX_MAGAZINES) {
            magazines[magazinesNumbers] = magazine;
            magazinesNumbers++;
        } else {
            System.out.println("Osiągnięto maksymalną liczbę magazynów w bibliotece");
        }
    }

    public void printMagazines () {
        if (magazinesNumbers == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }
        for (int i = 0; i < magazinesNumbers; i++) {
            magazines[i].printInfo();
        }
    }
}
