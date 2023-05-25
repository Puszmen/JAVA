package pl.javastart.library.app;

import pl.javastart.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.7";

        Book[] books = new Book[1000];
        books[0] = new Book("Lord of The Rings","J.R.R. Tolkien",1995,1500,
                "Peter","326-59-8784-512-0");
        books[1] = new Book("Milczenie owiec","Thomas Harris",2015,432,
                "Andre","978-83-7985-693-0");
        books[2] = new Book("Żywot Nunczako","Mariano Italiano",2018,100,
                "Pietraszek");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
    }
}