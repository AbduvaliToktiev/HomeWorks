package month2.Bread;

public class Bread {
    private double weight;
    private double price;
    private String produceCompany;

    public Bread () {

    }

    public Bread(double weight, double price, String produceCompany) {
        this.weight = weight;
        this.price = price;
        this.produceCompany = produceCompany;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduceCompany() {
        return produceCompany;
    }

    public void setProduceCompany(String produceCompany) {
        this.produceCompany = produceCompany;
    }

    void bake(){
        System.out.println("Хлеб готов!");
    }
    void pack() {
        System.out.println("Хлеб упакован!");
    }
}
