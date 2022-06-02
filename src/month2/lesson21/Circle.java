package month2.lesson21;

public class Circle {
    final private double PI = 3.14;
    private String color;
    private double radius;
    private double square;
    private double perimetr;
    private double X;
    private double Y;

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public Circle() {

    }

    public Circle(String color, double radius, double square, double perimetr, double x, double y) {
        this.color = color;
        this.radius = radius;
        this.square = square;
        this.perimetr = perimetr;
        X = x;
        Y = y;
    }

    public double getPerimetr() {
        return 2 * PI * radius;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public double getSquare() {
        return PI * radius * radius;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPI() {
        return PI;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "PI = " + PI +
                " color = " + color +
                " radius = " + radius +
                " X = " + X +
                " Y = " + Y;
    }
}
