import java.util.Arrays;
import java.util.Comparator;

public class NumberComparator {
    public static void main(String[] args) {

        Integer[] numbers = {1,68,85,33,2,857,68,45,9,98,16,364,58,81,67,8,657,21,36,5};

        System.out.println("Nieposortowane:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Posortowane rosnąco");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1,o2);
            }
        });

        System.out.println("Posortowane malejąco");
        System.out.println(Arrays.toString(numbers));
    }
}