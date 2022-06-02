package month2.Praktik15;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println("s: " + Circle.getS(1));

        Circle circle = new Circle(1);
        double s = circle.getRadius() * circle.getRadius() * Math.PI;
        System.out.println("s: " + s);

    }
}
