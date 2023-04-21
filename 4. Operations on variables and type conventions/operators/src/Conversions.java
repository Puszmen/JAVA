public class Conversions {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.8;
        int c = (int) b; // narrowing conversion
        double d = a;    // widening conversion
        System.out.println(c);
        System.out.println(d);
    }
}
