package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;
import pl.javastart.library.model.Library;
import pl.javastart.library.model.Magazine;

public class LibraryControl {

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop () {
        Option option;

        do {
            printOptions();
            option = Option.createFromInt(dataReader.getInt());
            switch (option) {
                case ADD_BOOKS:
                    addBook();
                    break;
                case ADD_MAGAZINES:
                    addMagazines();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Wybrano nieprawidłową opcję, wybierz ponownie");
            }
        } while (option != Option.EXIT);
    }

    private void printMagazines() {
        library.printMagazines();
    }

    private void addMagazines() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
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
        for (Option value : Option.values()) {
            System.out.println(value);
        }
    }
}
