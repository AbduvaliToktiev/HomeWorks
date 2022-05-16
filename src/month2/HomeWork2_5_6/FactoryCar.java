package month2.HomeWork2_5_6;

public class FactoryCar extends Brand{
    private FactoryCar factoryCar;

    private int amount;
    private int country;
    private String model1;
    private String model2;
    private String model3;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCountry() {
        return country;
    }

    public FactoryCar getFactoryCar() {
        return factoryCar;
    }

    public void setFactoryCar(FactoryCar factoryCar) {
        this.factoryCar = factoryCar;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getModel1() {
        return model1;
    }

    public void setModel1(String model1) {
        this.model1 = model1;
    }

    public String getModel2() {
        return model2;
    }

    public void setModel2(String model2) {
        this.model2 = model2;
    }

    public String getModel3() {
        return model3;
    }

    public void setModel3(String model3) {
        this.model3 = model3;
    }

    @Override
    public String toString() {
        return "Количество в мире: " + amount + " автомобилей \n" +
                "Количество стран: " + country + " \n" +
                "Класс автомобиля: " + model1 + " \n" +
                "Класс автомобиля: " + model2 + " \n" +
                "Класс автомобиля: " + model3;
    }
}
