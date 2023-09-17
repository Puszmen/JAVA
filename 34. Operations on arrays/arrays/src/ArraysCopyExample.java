import java.util.Arrays;

public class ArraysCopyExample {
    public static void main(String[] args) {

        int[] numbers = {2,65,6,87,12,6,7,1,91};

        int[] numbers2 = new int[numbers.length];

        System.arraycopy(numbers, 4, numbers2, 0, numbers.length - 4);
        System.out.println(Arrays.toString(numbers2));
    }
}
