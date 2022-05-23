package month2.Lesson20;

public class Megacom extends Operators{
    @Override
    public String toString() {
        return "Мегаком: " +
                "Звонок 1 мин = " + getZvonok() +
                " сом, 1 CMC = " + getCMC() +
                " сом, Интернет 1 гб = " + getInternet() +
                " сом" + '}';
    }
}
