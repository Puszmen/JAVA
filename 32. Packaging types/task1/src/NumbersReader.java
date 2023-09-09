import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumbersReader {
    public static void main(String[] args) {

        final String fileName = "numbers.txt";

        try (
            var fr = new FileReader(fileName);
            var br = new BufferedReader(fr);
            ) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            BigInteger bigA = new BigInteger(br.readLine());
            BigInteger bigB = new BigInteger(br.readLine());
            BigInteger add = bigA.add(bigB);
            System.out.println("A:" + a + ", B: " + b + ", C: " + c);
            System.out.println("a + b + c = " + (a + b + c));
            System.out.println();
            System.out.println("bigA: " + bigA + ", bigB: " + bigB);
            System.out.println("bigA + bigB = " + add);

        } catch (FileNotFoundException e) {
            System.out.println("Nie odnaleziono pliku");
        } catch (IOException e) {
            System.out.println("Błąd odczytu danych");;
        }
    }
}
