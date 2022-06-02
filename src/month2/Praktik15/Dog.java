package month2.Praktik15;

public class Dog {
    private String name;
    private int weight;
    private int age;
    private static int counter;

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Dog.counter = counter;
    }

    static void howManyDogsInTheWorld() {
        System.out.println("Dogs counter: " + counter);
    }
}

