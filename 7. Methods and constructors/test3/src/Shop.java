class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Czekolda mleczna", "Milka");
        Offer offer1 = new Offer(product1, 3.99, true);
        offer1.info();
        System.out.println(" ");

        Product product2 = new Product("Baton", "Snickers");
        Offer offer2 = new Offer(product2, 2.99, true);
        offer2.info();
    }
}