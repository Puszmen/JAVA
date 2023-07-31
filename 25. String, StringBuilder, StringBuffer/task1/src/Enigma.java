import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Result result = getResult();
        String finalWord = createWordFromLastLetters(result);
        System.out.println("Nowe słowo to: " + finalWord);
    }

    private static String createWordFromLastLetters(Result result) {
        StringBuilder build = new StringBuilder();

        for (int i = 0; i < result.wordNumbers(); i++) {
            int index = result.words()[i].length() - 1;
            build.append(result.words()[i].charAt(index));
        }
        String finalWord = build.toString();
        return finalWord;
    }

    private static Result getResult() {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę wyrazów");
        int wordNumbers = input.nextInt();
        input.nextLine();

        String[] words = new String[wordNumbers];

        for (int i = 0; i < wordNumbers; i++) {
            System.out.println("Podaj kolejne słowo");
            words[i] = input.nextLine();
        }
        input.close();
        Result result = new Result(wordNumbers, words);
        return result;
    }

    private record Result(int wordNumbers, String[] words) {
    }
}
