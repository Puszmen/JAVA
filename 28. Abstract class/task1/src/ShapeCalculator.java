import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {

    Scanner sc = new Scanner(System.in);

    public void closeScanner () {
        sc.close();
    }

    private Triangle readTriangleData () {
        System.out.println("Podaj informacje o trójkącie");
        System.out.println("Podaj długość boku A");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku B");
        double b = sc.nextDouble();
        System.out.println("Podaj długość boku C");
        double c = sc.nextDouble();
        System.out.println("Podaj wysokość");
        double height = sc.nextDouble();
        return new Triangle(height,a,b,c);
    }

    private Rectangle readRectangleData () {
        System.out.println("Podaj informacje o prostokącie");
        System.out.println("Podaj długość boku A");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku B");
        double b = sc.nextDouble();
        return new Rectangle(a,b);
    }

    private Circle readCircleData () {
        System.out.println("Podaj informację o kole");
        System.out.println("Podaj promień koła");
        double r = sc.nextDouble();
        return new Circle(r);
    }

    public Shape createShape () {
        int shapeType = sc.nextInt();
        switch (shapeType) {
            case Shape.TRIANGLE:
                return readTriangleData();
            case Shape.RECTANGLE:
                return readRectangleData();
            case Shape.CIRCLE:
                return readCircleData();
            default:
                throw new NoSuchElementException();
        }
    }
    public void clearBuffer () {
        sc.nextLine();
    }
}
