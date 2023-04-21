import java.io.Closeable;
import  java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random number = new Random();
        int x = number.nextInt(10);
        int y = number.nextInt(10);
        boolean result = x > y;

        System.out.println("Is X greater than Y ?");
        System.out.println(x + " > " + y + " " + result);

        x = x * 2;
        boolean result1 = x > y;
        System.out.println("Is X multiplied by 2 is greater than Y ?");
        System.out.println(x + " > " + y + " " + result1);

        boolean result2 = y < (x+3) && (x+3) > x - 2;
        System.out.println("Is Y smaller than sum x+3 and also greater than x minus 2 ?");
        System.out.println("The y is: " + y + ", and the x is " + x);
        System.out.println(result2);


    }
}
