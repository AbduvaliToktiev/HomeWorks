package month2.Figures;

public class RadiysCircle extends Circle {
    public static void main(String[] args) {
        Circle circle = new Circle(8,"blue", true, 5);
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Радиус: " + circle.getRadius() + " Цвет: " + circle.getColor());
        System.out.println("Радиус: " + circle.getRadius() + " Цвет: " + circle.getColor() + " Прозрачен: " + circle.isInVisible());
        System.out.println("Длина круга: " + circle.getPerimeter());
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Число для увеличения длины и площади круга: " + circle.getIncrease());
        System.out.println("Длина круга после увеличения: " + circle.getPerimeter2());
        System.out.println("Площадь круга после увеличения: " + circle.getArea2());
        hundredCyrcle(8,5);
    }
}
