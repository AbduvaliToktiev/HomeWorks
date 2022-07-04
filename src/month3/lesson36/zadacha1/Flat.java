package month3.lesson36.zadacha1;

import java.util.Scanner;

public class Flat extends Family {
    private int id;

    public Flat() {

    }

    public Flat(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Семья: " + " | Кол-во людей в семье = " + getCountFamily() + " | Адрес семьи = " + getId() +
                "\nКвартира: " + " | Адрес квартиры = " + id;
    }

    void utilityServices() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы оплатили коммуслуги?");
        String pay = sc.nextLine();
        switch (pay) {
            case "да":
                System.out.println("Хорошо!");
                break;
            case "нет":
                System.out.println("Пожалуйста оплатите коммуслуги!");
                break;
            default:
        }
    }
}

