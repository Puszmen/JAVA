import java.util.Arrays;

public class StringTest2 {
    public static void main(String[] args) {

        String words = "  Jeden dwa trzy cztery pięć sześć siedem ";
        String sub1 = words.substring(2, 7);
        String sub2 = words.replaceAll("dwa", "hehe");
        String sub3 = words.trim();
        char charAt = words.charAt(2);

        System.out.println(words);
        System.out.println("words.substring(2, 7)");
        System.out.println(sub1);
        System.out.println("words.replaceAll(\"dwa\", \"hehe\")");
        System.out.println(sub2);
        System.out.println("words.trim()");
        System.out.println(sub3);
        System.out.println("words.charAt(2)");
        System.out.println(charAt);

        System.out.println(words.toUpperCase());
        System.out.println(words.toLowerCase());
        System.out.println(words.length());
        String[] split = sub3.split(" ");
        System.out.println(split.length);
        System.out.println(Arrays.toString(split));
    }
}
