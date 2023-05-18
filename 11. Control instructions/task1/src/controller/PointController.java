package controller;
import data.Point;

public class PointController {
    public void addX (Point p) {
        int sum = p.getX();
        p.setX(sum + 1);
    }
    public void minusX (Point p) {
        int sub = p.getX();
        p.setX(sub - 1);
    }
    public void addY (Point p) {
        int sum = p.getY();
        p.setY(sum + 1);
    }
    public void minusY (Point p) {
        int sub = p.getY();
        p.setY(sub - 1);
    }
}
