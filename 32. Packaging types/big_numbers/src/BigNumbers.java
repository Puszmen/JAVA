import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {

//        BigInteger big1 = new BigInteger("99999999999999999999999999");
//        BigInteger big2 = new BigInteger("5555555555555555");
//
//        BigInteger result = big1.add(big2);
//        System.out.println(result);

        double a = 0.7;
        double b = 0.3;
        System.out.println(a - b);

        BigDecimal big1 = new BigDecimal("0.7");
        BigDecimal big2 = BigDecimal.valueOf(0.3);
        System.out.println(big1.subtract(big2));

        double pow = Math.pow(9, 2);
        System.out.println("9 ^ 2 = " + pow);

        double sqrt = Math.sqrt(9);
        System.out.println("Pierwiastek z 9 to " + sqrt);

        System.out.println("Pole koła o promieniu 5 cm to " + Math.PI * Math.pow(5,2) + " cm");
    }
}
