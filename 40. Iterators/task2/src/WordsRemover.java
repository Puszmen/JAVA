import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class WordsRemover {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj wyraz nr: " + (i + 1));
            words.add(scanner.nextLine());
        }

        System.out.println("Podaj tekst do odflitrowania");
        String filteredWord = scanner.nextLine();
        Iterator<String> wordsIterator = words.iterator();
        while (wordsIterator.hasNext()) {
            String next = wordsIterator.next();
            if (next.toLowerCase().contains(filteredWord.toLowerCase())) {
                wordsIterator.remove();
            }
        }
        System.out.println(words);
    }
}