import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OfferReader {

    private static final int OFFERS_IN_FILE = 10;

    static Offer[] readOffers(String fileName) throws FileNotFoundException {
        Offer[] offers = new Offer[OFFERS_IN_FILE];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            for (int i = 0; i < OFFERS_IN_FILE; i++) {
                offers[i] = createOffer(scanner.nextLine());
            }
        }
        return offers;
    }

    private static Offer createOffer(String line) {
        String[] split = line.split(";");
        return new Offer(split[0], Double.parseDouble(split[1]), Double.parseDouble(split[2]));
    }
}
