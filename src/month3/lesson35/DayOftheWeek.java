package month3.lesson35;

public enum DayOftheWeek {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private String translate;

    DayOftheWeek(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

}
