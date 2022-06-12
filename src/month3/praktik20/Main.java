package month3.praktik20;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введи имя: ");
        System.out.println(getName());
        System.out.print("Введите фамилию: ");
        System.out.println(getSurname());
        System.out.print("Введите свой год рождения: ");
        System.out.println(getAgeDataBirthday());
        System.out.print("Введите год начала работы: ");
        System.out.println(getAgeDataWork());
    }

    private static String getName() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static String getSurname() {
        Scanner sc2 = new Scanner(System.in);
        return sc2.nextLine();
    }

    private static int getAgeDataBirthday() {
        Scanner data = new Scanner(System.in);
        try {
           return data.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Введи дату ещё раз!");
            return getAgeDataBirthday();
        }
    }

    private static int getAgeDataWork() {
        Scanner work = new Scanner(System.in);
        try {
            return work.nextInt();
        } catch (Exception e) {
            System.out.println("Введи дату ещё раз!");
            return getAgeDataWork();
        }
    }
}

