package month3.praktik18;

public class Dog extends Animal {
    public Dog(int age, double price) {
        super(age, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    String makeSound() {
        return "Bark";
    }

    @Override
    String action() {
        return "Dog is jumping";
    }
}

