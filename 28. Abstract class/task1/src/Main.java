import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Shape shape = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                printOptions();
                shape = shapeCalculator.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś dane w złym formacie, spróbuj ponownie");
            } catch (NoSuchElementException e) {
                System.out.println("Wybrany identyfikator kształu jest niepoprawny, spróbuj ponownie");
            } finally {
                shapeCalculator.clearBuffer();
            }
        }

        System.out.println(shape);
        shapeCalculator.closeScanner();

    }

    private static void printOptions () {
        System.out.println("Wybierz figurę dla której chcesz obliczyć obwód i pole");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.CIRCLE + " - koło");
    }
}
