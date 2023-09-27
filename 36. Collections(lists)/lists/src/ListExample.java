import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

//        double[] numbers = new double[3];
//        numbers[0] = 2.2;
//        numbers[1] = 3.3;
//        numbers[2] = 4.4;
//        numbers = Arrays.copyOf(numbers, 5);
//        System.out.println(Arrays.toString(numbers));

//        List<Double> list1 = new ArrayList<>();
//        List<Double> list2 = new LinkedList<>();
//
//
//        for (int i = 0; i < 100; i++) {
//            list1.add((double) i);
//            list2.add((double) i);
//        }
//
//        printList(list1);
//        printList(list2);

        List<Integer> list = List.of(5, 10, 15);
        System.out.println(list);

    }

    private static void printList(List<Double> list) {
        for (Double element : list) {
            System.out.println(element);
        }
    }
}
