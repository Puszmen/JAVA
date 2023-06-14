package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;
import pl.javastart.library.model.Library;

public class LibraryControl {
    private static final int EXIT = 0;
    private static final int ADD_BOOKS = 1;
    private static final int PRINT_BOOKS = 2;

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop () {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case ADD_BOOKS:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Wybrano nieprawidłową opcję, wybierz ponownie");
            }
        } while (option != EXIT);
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
        System.out.println(EXIT +" - wyjście z programu");
        System.out.println(ADD_BOOKS +" - dodaj książkę");
        System.out.println(PRINT_BOOKS +" - wyświetl dostępne książki");
    }
}
