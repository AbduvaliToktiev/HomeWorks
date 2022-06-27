package month3.praktik24;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        printMonth(Month.getByCount(2));
        printMonth(Month.getEnum("JULY"));
        printMonths(Month.getByDaysInMonth(30));
    }

    private static void printMonths(ArrayList<Month> byDaysInMonth) {
        for (Month month : byDaysInMonth) {
            System.out.println(month);
        }
    }

    private static void printMonth(Month secondMonth) {
        System.out.println(secondMonth);
        System.out.println(secondMonth.getCount());
        System.out.println(secondMonth.getDaysInMonth());
        System.out.println(secondMonth.getRu());
    }
}
