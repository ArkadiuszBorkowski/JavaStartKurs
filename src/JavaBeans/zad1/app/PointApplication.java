package JavaBeans.zad1.app;

import JavaBeans.zad1.controller.PointController;
import JavaBeans.zad1.data.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point p1 = new Point(5,5);
        PointController pointController = new PointController();
        System.out.println("Punkt x wynosi " + p1.getX() + ", " + "natomiast punkty Y = " + p1.getY());
        pointController.addX(p1);
        System.out.println("Punkt x wynosi " + p1.getX() + ", " + "natomiast punkty Y = " + p1.getY());
        pointController.addY(p1);
        System.out.println("Punkt x wynosi " + p1.getX() + ", " + "natomiast punkty Y = " + p1.getY());

        pointController.changePoint(p1);

        System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
    }

}
