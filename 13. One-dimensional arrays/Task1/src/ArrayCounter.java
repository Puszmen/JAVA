public class ArrayCounter {
    public static void main(String[] args) {

        int[] array1 = {5,10,15};
        int[] array2 = {25,50,100};

        int sum1 = array1[0]+array1[1]+array1[2]+array2[0]+array2[1]+array2[2];
        System.out.println("Suma liczb z dwóch tabel wynosi: "+sum1);

        ArrayUtils arrayUtils = new ArrayUtils();

        int sum2 = arrayUtils.sumArrays(array1,array2);
        System.out.println("Suma wyciągnięta z metody: "+sum2);
    }
}