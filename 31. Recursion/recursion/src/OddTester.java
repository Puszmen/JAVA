public class OddTester {
    public static void main(String[] args) {

        checkNumber(10);
        checkNumber(11);
    }

    private static void checkNumber(int i) {
        String check = i % 2 == 0 ? "Parzysta" : "Nieparzysta";
        System.out.println(i + " " + check);
    }
}
