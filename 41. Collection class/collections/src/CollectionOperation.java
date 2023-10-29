import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperation {
    public static void main(String[] args) {


        String sentence = "Strona testowa służy dwóm celom: stanowi wizualne potwierdzenie "
                + "działania drukarki i może również zawierać informacje pomocne podczas "
                + "rozwiązywania problemów, takie jak szczegóły dotyczące sterownika drukarki.";

        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.println("Lista oryginalna");
        printCollection(words);

        System.out.println("Lista shuffle:");
        Collections.shuffle(words);
        printCollection(words);

        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Lista sort");
        printCollection(words);

        int position = Collections.binarySearch(words, "drukarki");
        System.out.println("Słowo \"drukarki\" znajduje się na " + position + " pozycji");

        int freq = Collections.frequency(words, "drukarki");
        System.out.println("Słowo \"drukarki\" znajduje się " + position + " razy");

        System.out.println("Najmniejszy element na liście: " + Collections.min(words, String.CASE_INSENSITIVE_ORDER));
    }

    private static void printCollection(List<String> collection) {
        for (String word : collection) {
            System.out.print(word + "; ");
        }
        System.out.println();
    }
}
