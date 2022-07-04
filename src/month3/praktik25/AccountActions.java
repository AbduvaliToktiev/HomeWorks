package month3.praktik25;

public interface AccountActions {
    void add(double amount);
    void minus(double amount) throws LimitException;
    double getAmount();
}
