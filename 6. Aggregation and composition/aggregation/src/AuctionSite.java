public class AuctionSite {
    public static void main(String[] args) {

        Auction auction1 = new Auction();
        auction1.title = "Xbox One";
        auction1.description = "Konsola dla wymagających graczy";
        auction1.price = 999.99;
        auction1.seller = new Seller();
        auction1.seller.firstName = "Jan";
        auction1.seller.lastName = "Kowalski";
        auction1.seller.address = new Address();
        auction1.seller.address.city = "Wrocław";
        auction1.seller.address.street = "Kościuszki";
        auction1.seller.address.homeNumber = "24A";

        Auction auction2 = new Auction();
        auction2.title = "Play Station 5";
        auction2.description = "Jedyna słuszna konsola";
        auction2.price = 3000;
        auction2.seller = new Seller();
        auction2.seller.firstName = "Justyna";
        auction2.seller.lastName = "Adamska";

        System.out.println("Nasza aukcja to: "+auction1.title+" czyli: "+auction1.description);
        System.out.println("Cena: "+auction1.price+" zł");
        System.out.println("Sprzedajacy: "+auction1.seller.firstName+" "+auction1.seller.lastName);
        System.out.println("Adres: "+auction1.seller.address.city+" "+auction1.seller.address.street+" "+
                auction1.seller.address.homeNumber);
        System.out.println("");
        System.out.println("Nasza aukcja to: "+auction2.title+" czyli: "+auction2.description);
        System.out.println("Cena: "+auction2.price+" zł");
        System.out.println("Sprzedajacy: "+auction2.seller.firstName+" "+auction2.seller.lastName);
    }
}
