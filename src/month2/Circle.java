package month2;

public class Circle {
    private int increase;
    private double radius;
    private String color;
    private boolean isInVisible = false;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color, boolean isInVisible) {
        this.radius = radius;
        this.color = color;
        this.isInVisible = isInVisible;
    }

    public Circle(double radius, String color, boolean isInVisible, int increase){
        this.radius = radius;
        this.color = color;
        this.isInVisible = isInVisible;
        this.increase = increase;
    }


    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter2() {
        return 2 * 3.14 * (increase * radius);
    }

    public double getArea2() {
        return 3.14 * (increase * radius) * (radius * increase);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public int getIncrease() {
        return increase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isInVisible() {
        return isInVisible;
    }

    public void setInVisible(boolean visible) {
        isInVisible = visible;
    }

    public void setIncrease(int increase) {
        this.increase = increase;
    }
    public static void hundredCyrcle(double radius, int increase) {
        for (int i = 0; i < radius * increase; i++) {
            if (i <= 100) {
                radius++;
            }
            if ((radius * increase) % 3 == 0) {
                System.out.print((radius * increase) + " ");
            }
        }
    }
}
