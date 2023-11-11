import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class SimpleStringComparator {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Wojtek", "Pietrek", "Memek", "Zbych", "Krzych");

        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);

        System.out.println(names);
    }
}
