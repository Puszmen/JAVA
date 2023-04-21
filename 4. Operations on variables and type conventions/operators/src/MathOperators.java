public class MathOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;

        int sum = x + y;

        System.out.println(x - y);
        System.out.println(sum);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

//        y = y * 2;
        y *= 2;

        System.out.println("New Y: " + y);
    }
}
