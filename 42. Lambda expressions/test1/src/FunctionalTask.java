import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalTask {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        generate(randomNumbers, 10, () -> random.nextInt(1000));
        consume(randomNumbers, x -> System.out.print(x + " "));
        System.out.println();
        filterList(randomNumbers, x -> x % 2 == 0);
        consume(randomNumbers, x -> System.out.print(x + " "));

    }
    private static <T> void generate(List<T> list, int toGenerate, Supplier<T> supplier) {
        for (int i = 0; i < toGenerate; i++) {
            list.add(supplier.get());
        }
    }
    private static <T> void consume (List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
    private static <T> void filterList(List<T> list, Predicate<T> predicate) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.test(next)) {
                iterator.remove();
            }
        }
    }

}
