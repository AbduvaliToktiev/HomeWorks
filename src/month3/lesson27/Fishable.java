package month3.lesson27;

public interface Fishable {
    boolean isSwim = true;
    double max = 11000;
    default String swim() {
        return "I can swim";
    }
}
