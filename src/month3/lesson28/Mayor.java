package month3.lesson28;

public class Mayor implements Rulenable {
    @Override
    public String road() {
        return "Построить дорогу!";
    }

    @Override
    public String trafficLight() {
        return "Отремонтировать сфетофор!";
    }
}
