package month3.praktik18;

public class ZooShop {
    private Dog dog;
    private Hamster hamster;
    private Parrot parrot;

    public ZooShop() {
        this.dog = new Dog(1, 10.0);
        this.hamster = new Hamster(2, 100.0);
        this.parrot = new Parrot(3, 1000.0);
    }

    public String actions(String action) {
        switch (action) {
            case "What do you have?":
                return allAnimals();
            case "sound Dog":
                return dog.makeSound();
            case "sound Hamster":
                return hamster.makeSound();
            case "sound Parrot":
                return parrot.makeSound();
            case "action Dog":
                return dog.action();
            case "action Hamster":
                return hamster.action();
            case "action Parrot":
                return parrot.action();
            default:
                return "Good Bye";
        }
    }

    private String allAnimals() {
        return "Dog, Hamster and Parrot";
    }

}

