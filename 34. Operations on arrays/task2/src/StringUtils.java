import java.util.Arrays;
import java.util.Scanner;

public class StringUtils {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź pierwsze słowo");
        String word1 = input.nextLine();
        System.out.println("Wprowadź drugie słowo");
        String word2 = input.nextLine();
        boolean compareWords = compareWords(word1,word2);
        if (compareWords) {
            System.out.println("Wpisane słowa są identyczne");
        } else {
            System.out.println("Wpisane słowa nie są identyczne");
        }
    }

    private static boolean compareWords(String s1, String s2) {
        if (s1 == null && s2 == null )
            return false;
        if (s1 == null || s2 == null || s1.length() != s2.length())
            return false;
        char[] chars1 = s1.toUpperCase().toCharArray();
        char[] chars2 = s2.toUpperCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }

}
