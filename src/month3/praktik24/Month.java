package month3.praktik24;

import java.util.ArrayList;

public enum Month {
    JANUARY(1, 31, "january"),
    FEBRUARY(2, 28, "february"),
    MARCH(3, 31, "march"),
    APRIL(4, 30, "april"),
    MAY(5, 31, "may"),
    JUNE(6, 30, "june"),
    JULY(7, 30, "july"),
    AUGUST(8, 31, "august"),
    SEPTEMBER(9, 30, "september"),
    OCTOBER(10, 31, "october"),
    NOVEMBER(11, 30, "november"),
    DECEMBER(12, 31, "december"),
    ;
    private int count;
    private int daysInMonth;
    private String ru;
    Month(int count, int daysInMonth, String ru) {
        this.count = count;
        this.daysInMonth = daysInMonth;
        this.ru = ru;
    }
    public static Month getEnum(String name) {
        return Month.valueOf(name);
    }
    public static Month getByCount(int count) {
        Month m = null;
        for (Month month : Month.values()) {
            if (month.count == count) {
                m = month;
            }
        }
        return m;
    }
    public static ArrayList<Month> getByDaysInMonth(int daysInMonth) {
        ArrayList<Month> months = new ArrayList<>();
        for (Month month : Month.values()) {
            if(month.daysInMonth == daysInMonth){
                months.add(month);
            }
        }
        return months;
    }
    public int getCount() {
        return count;
    }
    public int getDaysInMonth() {
        return daysInMonth;
    }
    public String getRu() {
        return ru;
    }
}
