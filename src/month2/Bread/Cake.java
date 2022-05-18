package month2.Bread;

import java.util.Scanner;

public class Cake extends Bread {
    Scanner sc = new Scanner(System.in);
    private double radius;

    public Cake() {

    }

    public Cake(double weight) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void Patterns() {
        System.out.print("Узор на лепёшке: ");
        System.out.println("\n    " + "*" + "*" + "*" + "*" + "\n  " +
                "*" + "      " + "*" + "\n " +
                "*" + "        " + "*" + "\n " +
                "*" + "        " + "*" + "\n  " +
                "*" + "      " + "*" + "\n    " +
                "*" + "*" + "*" + "*");
    }

    void Varnish() {
        System.out.println("Лепёшка лакирована!");
    }

    void Weight() {
        System.out.print("Какой вес имеет лепёшка: ");
        double weightAll = 900000;
        double weight = sc.nextDouble();
        if (weight <= 0) {
            System.out.println("Лепёшка без веса - это подделка!");
            System.exit(0);
        } else if (weight <= weightAll) {
            System.out.println("Лепёшка имеет вес: " + weight + " гр/кг");
        }
    }

    @Override
    public String toString() {
        return "Цена: " + getPrice() + " $" +
                "\nКомпания: " + getProduceCompany() +
                "\nРадиус: " + radius + " см";
    }
}
