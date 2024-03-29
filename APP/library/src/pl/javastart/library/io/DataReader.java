package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.LibraryUser;
import pl.javastart.library.model.Magazine;

import java.util.Scanner;

public class DataReader {

    private Scanner sc = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }

    public Book readAndCreateBook () {
        printer.printLine("Tytuł");
        String title = sc.nextLine();
        printer.printLine("Autor");
        String author = sc.nextLine();
        printer.printLine("Wydawnictwo");
        String publisher = sc.nextLine();
        printer.printLine("ISBN");
        String isbn = sc.nextLine();
        printer.printLine("Rok wydania");
        int releaseDate = getInt();
        printer.printLine("Liczba stron");
        int pages = getInt();
        return new Book(title,author,releaseDate,pages,publisher,isbn);
    }

    public Magazine readAndCreateMagazine () {
        printer.printLine("Tytuł");
        String title = sc.nextLine();
        printer.printLine("Wydawnictwo");
        String publisher = sc.nextLine();
        printer.printLine("Język");
        String language = sc.nextLine();
        printer.printLine("Rok wydania:");
        int year = getInt();
        printer.printLine("Miesiąc:");
        int month = getInt();
        printer.printLine("Dzień:");
        int day = getInt();
        return new Magazine (title, publisher, year, month, day, language);
    }

    public LibraryUser createLibraryUser() {
        System.out.println("Imię");
        String firstName = sc.nextLine();
        System.out.println("Nazwisko");
        String lastName = sc.nextLine();
        System.out.println("PESEL");
        String pesel = sc.nextLine();
        return new LibraryUser(firstName,lastName,pesel);
    }

    public int getInt () {
        try {
            return sc.nextInt();
        } finally {
            sc.nextLine();
        }
    }

    public String getString () {
        return sc.nextLine();
    }

    public void close () {
        sc.close();
    }
}