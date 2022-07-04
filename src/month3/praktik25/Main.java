package month3.praktik25;

public class Main {
    public static void main(String[] args) throws LimitException {
        Account account = new Account();

        account.add(20000);

        while (true) {
            try {
                account.minus(6000);
                System.out.println("got 6000");
            } catch (LimitException exception) {
                System.out.println(exception.getMessage());
                account.minus(exception.getAmount());
                System.out.println("got " + account.getAmount());
                break;
            }
        }
    }
}
