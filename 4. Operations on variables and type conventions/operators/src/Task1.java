import java.io.Closeable;
import  java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random number = new Random();
// obtain number between 0-9
        int x = number.nextInt(10);
        int y = number.nextInt(10);

        System.out.println("x = " + x + " , y = " + y);

        boolean result = x > y;
        System.out.println("Czy x jest większe od y ? " + result);

        int xMultipliedBy2 = x * 2;
        result = xMultipliedBy2 > y;

        System.out.println("x * 2 = " + xMultipliedBy2 + " , y = " + y);
        System.out.println("Czy x jest większe od y ? " + result);

        result = y < (x + 3) && (x + 3) > (x - 2);
        System.out.println("y < (x + 3) && (x + 3) > (x - 2) " + result);

        int multiply = x * y;
        int modulo = multiply % 2;
        result = modulo == 0;
        System.out.println("Czy x * y jest parzyste ? " + result);

    }
}