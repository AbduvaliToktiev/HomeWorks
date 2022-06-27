package month3.lesson35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DayOftheWeek monday = DayOftheWeek.valueOf("MONDAY");
        DayOftheWeek tuesday = DayOftheWeek.valueOf("TUESDAY");
        DayOftheWeek wednesday = DayOftheWeek.valueOf("WEDNESDAY");
        DayOftheWeek thursday = DayOftheWeek.valueOf("THURSDAY");
        DayOftheWeek friday = DayOftheWeek.valueOf("FRIDAY");
        DayOftheWeek saturday = DayOftheWeek.valueOf("SATURDAY");
        DayOftheWeek sunday = DayOftheWeek.valueOf("SUNDAY");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите день недели на английском: ");
        String choice = sc.nextLine();
        System.out.print("День недели на русском языке: ");
        switch (choice) {
            case "monday":
                System.out.println(monday.getTranslate() + "\nЯ учусь!");
                break;
            case "tuesday":
                System.out.println(tuesday.getTranslate() + "\nЯ учусь!");
                break;
            case "wednesday":
                System.out.println(wednesday.getTranslate() + "\nЯ учусь!");
                break;
            case "thursday":
                System.out.println(thursday.getTranslate() + "\nЯ учусь!");
                break;
            case "friday":
                System.out.println(friday.getTranslate() + "\nЯ учусь!");
                break;
            case "saturday":
                System.out.println(saturday.getTranslate() + "\nЯ не учусь!");
                break;
            case "Sunday":
                System.out.println(sunday.getTranslate() + "\nЯ не учусь!");
                break;
            default:
        }
    }
}
