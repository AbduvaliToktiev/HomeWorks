package month3.lesson27;

public class Shark implements Movable {
    @Override
    public String swiming() {
        return "Всегда Плаваю";
    }

    @Override
    public String voice() {
        return "Не издаю звуки я злодей";
    }

    public String Hunt() {
        return "Я охочусь!";
    }
}
