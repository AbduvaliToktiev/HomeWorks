package month2.Praktik15;

public class Circle {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    static  double getS(double radius){
        return radius * radius * Math.PI;
    }
}
