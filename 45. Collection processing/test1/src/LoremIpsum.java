import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoremIpsum {
    public static void main(String[] args) throws IOException {
        final String fileName = "loremipsum-129.txt";

        List<String> words = readFile(fileName);
        showWordsStats(words);
    }
    private static void showWordsStats(List<String> words) {
        long wordsWithS = words.stream()
                .filter(s -> s.startsWith("s"))
//                .peek(System.out::println)
                .count();

        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
                .peek(System.out::println)
                .count();

        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);
        System.out.println("Liczba wyrazów z s na początku: " + wordsWithS);
    }
    private static List<String> readFile(String fileName) throws IOException {
        try (var reader = new BufferedReader(new FileReader(fileName))) {
            List<String> words = new ArrayList<>();
            return reader.lines()
                    .map(s -> s.split(" "))
                    .flatMap(Arrays::stream)
                    .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                    .collect(Collectors.toList());
        }
    }
}
