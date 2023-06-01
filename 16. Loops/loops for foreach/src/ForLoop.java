import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + 1;
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Podaj liczbę");
//            int tmp = scanner.nextInt();
//            if (tmp % 2 == 0) {
//                System.out.println("Liczba "+tmp+" jest parzysta");
//            } else {
//                System.out.println("Liczba "+tmp+" jest nieparzysta");
//            }
//        }
//        scanner.close();

//        int[] numbers = {1,2,3,4,5};
//
//        for (int tmp: numbers) {
//            System.out.println(tmp);
//        }
//
//        int[] numbers1 = new int[3];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < numbers1.length; i++) {
//            System.out.println("Podaj liczbę");
//            numbers1[i] = sc.nextInt();
//        }
//        sc.close();
//
//        for (int i = 0; i < numbers1.length; i++){
//            System.out.println(numbers1[i]);
//        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Pierwsza pętla liczby nieparzyste: "+i);
         }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Druga pętla: "+i);
        }
        System.out.println("Koniec programu");

    }
}
