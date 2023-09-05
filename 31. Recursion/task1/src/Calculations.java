public class Calculations {
    public static void main(String[] args) {

        int number = 4;
        System.out.println(factorial(number));

    }
    static int factorial(int n) {
//        if (n == 1 || n == 0 ) {
//            return 1;
//        }  else {
//            return n * factorial(n - 1);
//        }
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}
