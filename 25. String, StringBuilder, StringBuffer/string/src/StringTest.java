import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

//        String s1 = "Ania";
//        String s2 = "Ania";
//        System.out.println("s1 == s2 " + (s1 == s2));
//        System.out.println("s1.equals(s2) " + (s1.equals(s2)));
//
//        String s3 = new String("Ania");
//        String s4 = new String("Ania");
//        System.out.println("s3 == s4 " + (s3 == s4));
//        System.out.println("s3.equals(s4) " + (s3.equals(s4)));

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj napis 1");
        String str1 = sc.nextLine();
        System.out.println("Podaj napis 2");
        String str2 = sc.nextLine();

        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str1.equals(str2) " + (str1.equals(str2)));

    }
}
