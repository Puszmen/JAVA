import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        String[] names = {"Kasia", "Wojtek", "Zosia", "Tosia", "Zenek"};
        Integer[] numbers = {4,33,1,67,12,9,55};

        System.out.println("Names:");
//        printArray(names);
        System.out.println(Arrays.toString(names));

        System.out.println("Numbers:");
//        printArray(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] names2 = Arrays.copyOf(names, names.length);
        Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names2));

//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(numbers2));

        System.out.println(Arrays.equals(numbers, numbers2));

        String[] arrays = new String[5];
        Arrays.fill(arrays, "Mietek");
        printArray(arrays);

    }

    public static <T> void printArray (T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

}
