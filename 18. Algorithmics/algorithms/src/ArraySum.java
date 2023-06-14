public class ArraySum {
    public static void main(String[] args) {

        int[] arraySum = {4,7,9,12,16};
        int sum = 0;

        for (int index = 0; index < arraySum.length; index++) {
            if (arraySum[index] % 2 == 0) {
                sum += arraySum[index];
            }
        }
        System.out.println(sum);
    }
}
