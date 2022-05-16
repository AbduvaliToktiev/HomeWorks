package month2.HomeWork2_5_6;

import  java.util.Scanner;

public class ShapeMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Введите 1 если хотите ввести круг или введите что-то(именно число) если хотите квадрат");
        int a = sc.nextInt();

        if (a == 1) {
            Сircle crObj = new Сircle();
            System.out.println("Введите из каких символов будет фигура");
            char c = sc.next().charAt(0);
            crObj.setSymbol(c);
            crObj.draw(crObj.getSymbol());


        }else {
            Square sqObj = new Square();
            System.out.println("Введите из каких символов будет фигура");
            char c = sc.next().charAt(0);
            sqObj.setSymbol(c);
            sqObj.draw(sqObj.getSymbol());
        }
    }
}
