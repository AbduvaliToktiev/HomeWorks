package month2.lesson22;

public final class Circle extends Figure{
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

    @Override
    public String speak() {
        return "Радиус: " + radius + "\n" +
                "Это круг!";
    }
}
