package app;
import controller.PointController;
import data.Point;

import java.util.Scanner;
public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(25, 30);
        PointController pointController = new PointController();
        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        int option = addX;

        switch (option) {
            case addX:
                pointController.addX(point1);
                break;
            case addY:
                pointController.addY(point1);
                break;
            case minusX:
                pointController.minusX(point1);
                break;
            case minusY:
                pointController.minusY(point1);
                break;
            default:
                System.out.println("Błędna wartość");
        }
        System.out.println("Punkt po zmianie: ("+point1.getX()+"), ("+point1.getY()+")");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Proszę wybrać wartośc od 0 do 3 aby przesunąć punkty");
//        final int addX = 0;
//        final int addY = 1;
//        final int minusX = 2;
//        final int minusY = 3;
//        int option = Integer.parseInt(scanner.nextLine());
//
//        switch (option) {
//            case addX -> pointController.addX(point1);
//            case addY -> pointController.addY(point1);
//            case minusX -> pointController.minusX(point1);
//            case minusY -> pointController.minusY(point1);
//            default -> System.out.println("Podano błędną wartość");
//        }
//        System.out.println("Punkt po zmianie: ("+point1.getX()+"), ("+point1.getY()+")");
    }
}