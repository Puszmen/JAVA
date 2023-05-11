package app;
import controller.PointController;
import data.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(10, 15);
        System.out.println("X wynosi: "+point1.getX()+", Y wynosi: "+point1.getY());
        point1.setX(25);
        point1.setY(50);
        System.out.println("X wynosi: "+point1.getX()+", Y wynosi: "+point1.getY());
        PointController pointController = new PointController();
        pointController.addX(point1);
        pointController.minusY(point1);
        System.out.println("X wynosi: "+point1.getX()+", Y wynosi: "+point1.getY());
    }
}