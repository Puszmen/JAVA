class Library {
    public static void main(String[] args) {
        final String appName = "Library v0.4";

        Book book1 = new Book("Lord of The Rings","J.R.R. Tolkien",1995,1500,
                "Peter","326-59-8784-512-0");
        Book book2 = new Book("Milczenie owiec","Thomas Harris",2015,432,
                "Andre","978-83-7985-693-0");
        Book book3 = new Book("Żywot Nunczako","Mariano Italiano",2018,100,
                "Pietraszek");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}