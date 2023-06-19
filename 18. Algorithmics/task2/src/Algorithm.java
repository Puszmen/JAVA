import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {

//        int index = 0;
        int multi = 1;
//        int next = 0;

        Scanner scanner = new Scanner(System.in);

//        while (index < 5) {
//            next = scanner.nextInt();
//            multi = multi * next;
//            index++;
//        }

        for (int index = 0; index < 5; index++) {
            int next = scanner.nextInt();
            multi *= next;
        }

        if (multi >= 0) {
            System.out.println(multi + " - liczba dodatnia");
        } else {
            System.out.println(multi + " - liczba ujemna");
        }

    }
}
