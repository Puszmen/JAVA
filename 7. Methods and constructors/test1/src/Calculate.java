public class Calculate {
    public static void main(String[] args) {
        double a = 4;
        double b = 2;

        Calculator calc = new Calculator();
        double sum = calc.add(a, b);
        double sub = calc.subtract(a, b);
        double mul = calc.multiply(a, b);
        double div = calc.divide(a, b);

        System.out.println("Wynik dodawania: "+a+" + "+b+" = "+sum);
        System.out.println("Wynik odejmowania: "+a+" - "+b+" = "+sub);
        System.out.println("Wynik mnożenia: "+a+" * "+b+" = "+mul);
        System.out.println("Wynik dzielenia: "+a+" / "+b+" = "+div);
    }
}
