class DiscountApp {
    public static void main(String[] args) {

        Client client1 = new Client("Jan","Kowalski",true);
        double price = 1500;
        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client1, price);

        System.out.println("Witaj "+client1.getName()+" "+client1.getSurname());
        System.out.println("Cena przed obniżką: "+price+" zł");
        System.out.println("Cena po obniżce: "+discountPrice+" zł");
        System.out.println("Rabat wyniosi: "+(price-discountPrice)+" zł");
    }
}