package calc;
public class Calc {
    public double Calculate (double a, double b, String operator) {
        double result = 0;
        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "/" -> result = a / b;
            case "*" -> result = a * b;
            default -> System.out.println("Nieznane działanie");
        } return result;
    }
}