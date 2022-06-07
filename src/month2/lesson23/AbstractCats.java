package month2.lesson23;

abstract public class AbstractCats extends AbstractAnimal {
    private int kogti;
    private double hvost;
    private double usy;

    public AbstractCats() {

    }

    public AbstractCats(double weight, int age, String color, String voice, int kogti, double hvost, double usy) {
        super(weight, age, color);
        this.kogti = kogti;
        this.hvost = hvost;
        this.usy = usy;
    }

    public int getKogti() {
        return kogti;
    }

    public void setKogti(int kogti) {
        this.kogti = kogti;
    }

    public double getHvost() {
        return hvost;
    }

    public void setHvost(double hvost) {
        this.hvost = hvost;
    }

    public double getUsy() {
        return usy;
    }

    public void setUsy(double usy) {
        this.usy = usy;
    }

    abstract void tochKogti();

    abstract void prizeml();

    abstract void murlyk();


    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "weight=" + getWeight() +
                ", age=" + getAge() +
                ", color='" + getColor() +
                " kogti=" + kogti +
                ", hvost=" + hvost +
                ", usy=" + usy +
                '}';
    }
}
