import java.util.Scanner;

public class WordsStatistic {
    public static void main(String[] args) {

        String words = readWordsFromUser();
        int digits = countDigits(words);
        System.out.println("Liczba cyfr w tekście: " + digits);
        int letters = countLetters(words);
        System.out.println("Liczba liter w tekście: " + letters);
        try {
            int biggestDigitInText = findBiggestDigit(words);
            System.out.println("Największa liczba w tekście to: " + biggestDigitInText);
        } catch (DigitNotFoundException e) {
            System.err.println("W tekście nie ma żadnych cyfr");
        }
    }

    private static int findBiggestDigit(String words) {
        char[] chars = words.toCharArray();
        final int notFound = -1;
        int biggestNumber = notFound;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                int digit = Character.getNumericValue(aChar);
                biggestNumber = Integer.max(biggestNumber, digit);
            }
        }
        if (biggestNumber == notFound)
            throw new DigitNotFoundException();
            return biggestNumber;
    }


    private static int countLetters(String words) {
        char[] chars = words.toCharArray();
        int letters = 0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                letters++;
            }
        }
        return letters;
    }

    private static int countDigits(String words) {
        char[] chars = words.toCharArray();
        int digits = 0;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                digits++;
            }
        }
        return digits;
    }

    private static String readWordsFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolne zdanie (zawierające cyfry)");
        return scanner.nextLine();
    }

    private static class DigitNotFoundException extends RuntimeException {
    }
}
