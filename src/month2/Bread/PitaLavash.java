package month2.Bread;

import java.util.Scanner;

public class PitaLavash extends Bread {
    Scanner sc = new Scanner(System.in);

    private double radius;
    private double thickness;

    public PitaLavash() {

    }

    public PitaLavash(double radius, double thickness) {
        this.radius = radius;
        this.thickness = thickness;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    void TitleLavash() {
        System.out.println("Фирменное название: Элитный лаваш из Дилижана");
    }

    void WrapUp() {
        System.out.print("Если хотите завернуть лаваш нажмите 1 если нет нажмите любую другую: ");
        int wrapUp = sc.nextInt();
        if (wrapUp == 1) {
            System.out.println("Лаваш завёрнут");
        } else {
            System.out.println("Лаваш не завёрнут");
        }
    }

    void Baked() {
        System.out.println("Я лаваш, меня испекли!");
    }

    @Override
    public String toString() {
        return "Вес: " + getWeight() + " грамм" +
                "\nЦена: " + getPrice() + " $" +
                "\nКомпания: " + getProduceCompany() +
                "\nРадиус: " + radius + " см" +
                "\nТолщина: " + thickness + " см";
    }
}
