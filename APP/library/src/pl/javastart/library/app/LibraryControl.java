package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;
import pl.javastart.library.model.Library;

public class LibraryControl {
    private final int exit = 0;
    private final int addBooks = 1;
    private final int printBooks = 2;

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop () {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case addBooks:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Wybrano nieprawidłową opcję, wybierz ponownie");
            }
        } while (option != exit);
    }

    private void exit() {
        System.out.println("Koniec programu ! :(");
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję:");
        System.out.println(exit+" - wyjście z programu");
        System.out.println(addBooks+" - dodaj książkę");
        System.out.println(printBooks+" - wyświetl dostępne książki");
    }
}
