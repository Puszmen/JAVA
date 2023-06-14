package pl.javastart.library.model;

public class Library {

    private static final int MAX_BOOKS = 10;
    private Book[] books = new Book[MAX_BOOKS];
    private int booksNumber = 0;

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
}
