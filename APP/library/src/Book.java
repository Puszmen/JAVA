class Book {
    String title;
    String author;
    int relaseDate;
    int pages;
    String publisher;
    String isbn;
    Book(String bookTitle,String bookAuthor,int bookRelaseDate,int bookPages,String bookPublisher,String bookIsbn) {
        title = bookTitle;
        author = bookAuthor;
        relaseDate = bookRelaseDate;
        pages = bookPages;
        publisher = bookPublisher;
        isbn = bookIsbn;
    }

    void printInfo() {
        String info = title+", "+author+", "+relaseDate+", "+pages+", "+publisher+", "+isbn;
        System.out.println(info);
    }
}