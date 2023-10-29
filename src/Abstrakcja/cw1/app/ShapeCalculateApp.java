package Abstrakcja.cw1.app;

public class ShapeCalculateApp {

    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        shapeCalculator.run();

        int i = 1;
        do  {
            System.out.println(i);
            i++;
        } while (i<=10);

    }

}
