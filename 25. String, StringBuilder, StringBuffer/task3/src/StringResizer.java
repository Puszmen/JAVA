import java.util.Scanner;

public class StringResizer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź dowolny tekst");
        String text = input.nextLine();

        char firstCharacter = text.charAt(0);
        if (Character.isUpperCase(firstCharacter)) {
            text = text.toUpperCase();
        } else if (Character.isLowerCase(firstCharacter)) {
            text = text.toLowerCase();
        }
        System.out.println("Tekst po transormacji");
        System.out.println(text);
    }
}
