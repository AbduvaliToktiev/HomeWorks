package month2;

public class Lesson2_3 {
}

class Rectangle {

    private double x;
    private double y;

    public Rectangle() {

    }

    public Rectangle(double a, double b){
        x = a;
        y = b;
    }

    public double getArea() {
        return x * y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}


