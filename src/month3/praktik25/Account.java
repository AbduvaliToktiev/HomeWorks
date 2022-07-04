package month3.praktik25;

public class Account implements AccountActions {
    private double balance;

    @Override
    public void add(double amount) {
        this.balance = amount + this.balance;
    }

    @Override
    public void minus(double amount) throws LimitException {
        if ((this.balance - amount) < 0) {
            throw new LimitException("Not Enough money", this.balance);
        }
    }

    @Override
    public double getAmount() {
        return this.balance;
    }
}
