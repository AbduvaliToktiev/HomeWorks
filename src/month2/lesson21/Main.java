package month2.lesson21;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       final Circle[] circles = new Circle[7];
        Circle circle1 = new Circle();
        circle1.setRadius(5);
        circle1.setColor("blue");
        circle1.setX(3.5);
        circle1.setY(2.5);
        circles[0] = circle1;

        Circle circle2 = new Circle();
        circle2.setRadius(6);
        circle2.setColor("red");
        circle2.setX(4.5);
        circle2.setY(3.5);
        circles[1] = circle2;

        Circle circle3 = new Circle();
        circle3.setRadius(7);
        circle3.setColor("black");
        circle3.setX(3);
        circle3.setY(2);
        circles[2] = circle3;

        Circle circle4 = new Circle();
        circle4.setRadius(9);
        circle4.setColor("green");
        circle4.setX(5);
        circle4.setY(6.5);
        circles[3] = circle4;

        Circle circle5 = new Circle();
        circle5.setRadius(2);
        circle5.setColor("brown");
        circle5.setX(1.2);
        circle5.setY(2.4);
        circles[4] = circle5;

        Circle circle6 = new Circle();
        circle6.setRadius(10);
        circle6.setColor("White");
        circle6.setX(3.3);
        circle6.setY(2.7);
        circles[5] = circle6;

        Circle circle7 = new Circle();
        circle7.setRadius(15);
        circle7.setColor("blue");
        circle7.setX(5);
        circle7.setY(2.5);
        circles[6] = circle7;
        System.out.println(Arrays.toString(circles));

        System.out.println("1 circle perimetr: " + circle1.getPerimetr());
        System.out.println("1 circle square: " + circle1.getSquare());
        System.out.println();
        System.out.println("2 circle perimetr: " + circle2.getPerimetr());
        System.out.println("2 circle square: " + circle2.getSquare());
        System.out.println();
        System.out.println("3 circle perimetr: " + circle3.getPerimetr());
        System.out.println("3 circle square: " + circle3.getSquare());
        System.out.println();
        System.out.println("4 circle perimetr: " + circle4.getPerimetr());
        System.out.println("4 circle square: " + circle4.getSquare());
        System.out.println();
        System.out.println("5 circle perimetr: " + circle5.getPerimetr());
        System.out.println("5 circle square: " + circle5.getSquare());
        System.out.println();
        System.out.println("6 circle perimetr: " + circle6.getPerimetr());
        System.out.println("6 circle square: " + circle6.getSquare());
        System.out.println();
        System.out.println("7 circle perimetr: " + circle7.getPerimetr());
        System.out.println("7 circle square: " + circle7.getSquare());

        Circle[] circles2 = circles;
        System.out.println(Arrays.toString(circles2));
    }
}
