package month2.lesson22;

public final class Rectangle extends Figure{
    private double height;
    private double width;
    public static int count;

    public Rectangle() {

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        count++;
    }

    public Rectangle(double width) {
        this.height = width;
        this.width = width;
        count++;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String speak() {
        if (width == height){
        return "Это Квадрат!";
        }else {
            return "Это Прямоугольник!";
        }
    }
}
