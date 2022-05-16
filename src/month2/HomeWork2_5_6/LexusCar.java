package month2.HomeWork2_5_6;

public class LexusCar extends FactoryCar {
    private LexusCar lexusCar;

    public LexusCar getLexusCar() {
        return lexusCar;
    }

    public void setLexusCar(LexusCar lexusCar) {
        this.lexusCar = lexusCar;
    }


    private int lxAge;
    private int gxAge;
    private int rxAge;

    public int getLxAge() {
        return lxAge;
    }

    public void setLxAge(int lxAge) {
        this.lxAge = lxAge;
    }

    public int getGxAge() {
        return gxAge;
    }

    public void setGxAge(int gxAge) {
        this.gxAge = gxAge;
    }

    public int getRxAge() {
        return rxAge;
    }

    public void setRxAge(int rxAge) {
        this.rxAge = rxAge;
    }

    @Override
    public String toString() {
        return "Год выпуска автомобиля класса Lx: " + lxAge + " \n" +
                "Год выпуска автомобиля класса Gx: " + gxAge + " \n" +
                "Год выпуска автомобиля класса Rx: " + rxAge;
    }
}
