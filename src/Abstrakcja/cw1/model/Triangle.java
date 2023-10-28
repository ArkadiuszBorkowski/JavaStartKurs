package Abstrakcja.cw1.model;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //wzór Herona na pole
    // P = pierwiastek z ( (p(p-a)(p-b)(p-c)), gdzie p = (a + b + c ) / 2

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Trójkąt o bokach:" + '\n' +
                " a = " + a + '\n' +
                " b = " + b + '\n' +
                " c = " + c + '\n' +
                " posiada pole = " + calculateArea() + " oraz obwód = " + calculatePerimeter();
    }
}
