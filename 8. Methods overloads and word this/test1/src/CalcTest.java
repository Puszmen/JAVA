public class CalcTest {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        Calculator calc = new Calculator();
        System.out.println("A:"+a+", B:"+b+", C:"+c);
        System.out.println("A + B = "+calc.add(a,b));
        System.out.println("A + B + C = "+calc.add(a,b,c));
        System.out.println("B - A = "+calc.subtract(b,a));
        System.out.println("C - B - A = "+calc.subtract(c,b,a));
    }
}