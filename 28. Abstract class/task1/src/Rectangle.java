public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double calculateArea () {
        return a * b;
    }

    public double calculatePerimeter () {
        return 2 * (a + b);
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Prostokąt");
        sb.append(", bok A: " + a);
        sb.append(", bok B: " + b);
        sb.append(", pole: " + calculateArea());
        sb.append(" obwód: " + calculatePerimeter());
        return sb.toString();
    }

}
