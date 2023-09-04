public class NumberAdderRecursion {
    public static void main(String[] args) {
        int number = sum(5);
        System.out.println(number);

    }

    static int sum (int n) {
//        if (n > 1) {
//            System.out.println(n + " + " + "sum(" + (n - 1) + ")");
//            return n + sum(n - 1);
//        } else {
//            return 1;
//        }
        return n > 1 ? n + sum(n - 1) : 1;
    }
}

// sum(3) = 3 + sum(2)
// sum(2) = 2 + sum(1)
// sum(1) = 1