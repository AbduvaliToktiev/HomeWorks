package month3.lesson36.zadacha1;

import java.util.Scanner;

public class Hostel extends Family {
    private int id;

    public Hostel() {

    }

    public Hostel(int countFamily, int idFamily, int id) {
        super(countFamily, idFamily);
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
        return  "Семья: " + " | Кол-во людей в семье = " + getCountFamily() + " | Адрес семьи = " + getId() +
                "\nОбщежитие: " + " | Адрес общежития = " + id;
    }

    void paymentForAccommodation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы оплатили за проживание?");
        String pay = sc.nextLine();
        switch (pay) {
            case "да":
                System.out.println("Хорошо!");
                break;
            case "нет":
                System.out.println("Пожалуйста оплатите за проживание!");
                break;
            default:
        }
    }
}
