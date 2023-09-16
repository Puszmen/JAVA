public class Test {
    public static void main(String[] args) {

        Pair<String, Integer> p1 = new Pair<>("Ania", 10);
        Pair<String, Double> p2 = new Pair<>("Piotr", 32.5);
        Pair<String, String> p3 = new Pair<>("Piotr", "Kinga");

        printPair(p1);
        printPair(p2);
        printPair(p3);
    }

    private static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println("< " + pair.getT() + " ; " + pair.getV() + " >");
    }
}
