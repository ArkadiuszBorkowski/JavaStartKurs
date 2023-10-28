package Abstrakcja.interfaces;

class ShapeCalculator {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 10);

        System.out.println("Pole koła " + circle.calculateArea());
        System.out.println("Obwód trójkąta " + rectangle.calculatePerimeter());
        System.out.println(circle.getData());
        System.out.println(rectangle.getData());
        System.out.println();

        System.out.println(StringUtils.reverseString("abc"));
    }
}
