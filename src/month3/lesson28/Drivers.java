package month3.lesson28;

public class Drivers implements CarRulenable {
    @Override
    public String turn() {
        return "Поверни!";
    }

    @Override
    public String stop() {
        return "Остановись!";
    }
}
