package month3.praktik18;

public abstract class Animal {
    private int age;
    private double price;

    public Animal(int age, double price) {
        this.age = age;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    abstract String makeSound();

    abstract String action();
}


