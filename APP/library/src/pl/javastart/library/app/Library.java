package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;

import java.util.Scanner;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();

        System.out.println(appName);
        System.out.println("Proszę wprowadzić książkę do systemu");
        books[0] = dataReader.readAndCreateBook();
        dataReader.close();
        books[0].printInfo();
    }
}