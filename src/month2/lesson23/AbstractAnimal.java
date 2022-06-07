package month2.lesson23;

abstract public class AbstractAnimal {
    private double weight;
    private int age;
    private String color;

    public AbstractAnimal() {

    }

    public AbstractAnimal(double weight, int age, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void voice();

    abstract void eat();

    abstract void sleep();


    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
