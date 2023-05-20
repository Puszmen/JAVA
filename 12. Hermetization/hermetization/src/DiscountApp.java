class DiscountApp {
    public static void main(String[] args) {

        Client client1 = new Client(null,null,true);
        double price = 1500;
        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client1, price);

        PrintService printService = new PrintService();

        printService.printSummary(client1,price,discountPrice);
    }
}