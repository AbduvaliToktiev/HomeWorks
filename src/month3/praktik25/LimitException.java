package month3.praktik25;

public class LimitException extends Exception{
    private double amount;
    public LimitException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
