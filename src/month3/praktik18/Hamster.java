package month3.praktik18;

public class Hamster extends Animal {
    public Hamster(int age, double price) {
        super(age, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    String makeSound() {
        return "Pip";
    }

    @Override
    String action() {
        return "Hamster is running";
    }
}

