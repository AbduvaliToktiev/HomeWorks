package month3.praktik18;

public class Parrot extends Animal {
    public Parrot(int age, double price) {
        super(age, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    String makeSound() {
        return "I'm parrot";
    }

    @Override
    String action() {
        return "Parrot is speaking";
    }
}

