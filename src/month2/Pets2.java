package month2;

public class Pets2 extends Pets{
    public static void main(String[] args) {
        Pets parrot = new Pets("parrot", "flies", "ara", 50);
        System.out.println("Животное: " + parrot.getAnimal() + " (попугай)");
        System.out.println("Что делает: " + parrot.getAction() + " (летает)");
        System.out.println("Порода: " + parrot.getBreed() + " (ара)");
        System.out.println("Продолжительность жизни: " + parrot.getLifespan() + " лет");
        System.out.println();
        Pets dog = new Pets("dog", "barks", "sheper", 13);
        System.out.println("Животное: " + dog.getAnimal() + " (собака)");
        System.out.println("Что делает: " + dog.getAction() + " (лает)");
        System.out.println("Порода: " + dog.getBreed() + " (овчарка)");
        System.out.println("Продолжительность жизни: " + dog.getLifespan() + " лет");
        System.out.println();
        Pets cat = new Pets("cat", "meows", "ragdoll", 15);
        System.out.println("Животное: " + cat.getAnimal() + " (кошка)");
        System.out.println("Что делает: " + cat.getAction() + " (мяукает)");
        System.out.println("Порода: " + cat.getBreed() + " (рэгдолл)");
        System.out.println("Продолжительность жизни: " + cat.getLifespan() + " лет");
        System.out.println();
        Pets fish = new Pets("fish", "swims", "scalar", 10);
        System.out.println("Животное: " + fish.getAnimal() + " (рыбка)");
        System.out.println("Что делает: " + fish.getAction() + " (плавает)");
        System.out.println("Порода: " + fish.getBreed() + " (скалярия)");
        System.out.println("Продолжительность жизни: " + fish.getLifespan() + " лет");
    }
}
