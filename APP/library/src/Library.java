public class Library {
    public static void main(String[] args) {
        final String appName = "Library v0.2";

        Book book1 = new Book();
        book1.title = "Lord of The Rings";
        book1.author = "J.R.R. Tolkien";
        book1.relaseDate = 1955;
        book1.pages = 1500;
        book1.publisher = "Peter";
        book1.isbn = "326598784512";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.relaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);



    }
}
