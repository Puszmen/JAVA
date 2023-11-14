import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws FileNotFoundException {
//        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5);
//        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
//        int[] evenNumbers = stream
//                .filter(x -> x % 2 == 0)
//                .toArray();
//        System.out.println(Arrays.toString(evenNumbers));

//        Stream<String> letters = Stream.of("a", "b", "c");
//        String[] array = letters
//                .map(s -> s.toUpperCase())
//                .toArray(String[]::new);
//        System.out.println(Arrays.toString(array));

//        int[] numbers = IntStream
//                .iterate(0, x -> x + 1)
//                .limit(100)
//                .map(x -> x * x)
//                .filter(x -> x % 2 == 0)
//                .toArray();
//        System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(new File("file.txt"));
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }

        scanner.tokens()
                .map(String::toUpperCase)
                .filter(t -> t.contains("F"))
                .forEach(System.out::println);

    }
}
