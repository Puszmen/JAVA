import java.util.Scanner;

class DebugExample {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int size = getArraySize();
        int[] numbers = createArray(size);
        int multiplier = getMultiplier();
        multiplyAllNumbersBy(numbers,multiplier);
        printNumbers(numbers);
    }

    private static int getArraySize () {
        System.out.println("Podaj ilość liczb do wczytania");
        int result = scanner.nextInt();
        return result;
    }

    private static int[] createArray (int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj kolejną liczbę");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static int getMultiplier () {
        System.out.println("Podaj mnożnik");
        return scanner.nextInt();
    }

    private static void multiplyAllNumbersBy (int[] numbers, int multiply) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * multiply;
        }
    }

    private static void printNumbers (int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}