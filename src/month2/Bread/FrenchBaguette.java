package month2.Bread;

import java.util.Scanner;

public class FrenchBaguette extends Bread{
    Scanner sc = new Scanner(System.in);

    private double length;
    private int scarring;

    public FrenchBaguette() {

    }

    public FrenchBaguette(double length, int scarring) {
        this.length = length;
        this.scarring = scarring;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getScarring() {
        return scarring;
    }

    public void setScarring(int scarring) {
        this.scarring = scarring;
    }

    void TitleBaguette() {
        System.out.println("Фирменное название: Провансальский багет");
    }

    void scarring(){
            System.out.print("Введите 1 если хотите рубцевать или 2 если нет: ");
        scarring = sc.nextInt();
        if (scarring == 1) {
            System.out.println("Хлеб теперь имеет рубцы");
        } else {
            System.out.println("Хлеб не имеет рубцов");
        }
    }

    void packBaguette(){
        System.out.println("Только в экологичный пакет");
    }

    @Override
    public String toString() {
        return "Вес: " + getWeight() + " грамм" +
                "\nЦена: " + getPrice() + " $" +
                "\nКомпания: " + getProduceCompany() +
                "\nДлина: " + length + " см";
    }
}
