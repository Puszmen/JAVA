public class PrintService {
    public void printSummary (Client client, double originalPrice, double discountPrice){
        welcomeMessage(client);
        printPrices(originalPrice, discountPrice);
    }
    private void welcomeMessage(Client client) {
        String firstName = client.getName();
        String lastName = client.getSurname();
        if(firstName != null && lastName == null)
            System.out.println("Witaj " + firstName);
        else if(firstName != null && lastName != null)
            System.out.println("Witaj " + firstName + " " + lastName);
        else if(firstName == null && lastName != null)
            System.out.println("Dzień dobry panie/pani " + lastName);
        else
            System.out.println("Witaj nieznajomy");
    }
    private void printPrices (double originalPrice, double discountPrice) {
        System.out.println("Kwota pzed rabatem: "+originalPrice);
        System.out.println("Kwota po rabacie: "+discountPrice);
    }
}