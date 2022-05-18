package month2.Bread;

public class ChamomileBread extends Bread{
    private int numChamomile;

    public ChamomileBread() {

    }

    public ChamomileBread(int numChamomile) {
        this.numChamomile = numChamomile;
    }

    public int getNumChamomile() {
        return numChamomile;
    }

    public void setNumChamomile(int numChamomile) {
        this.numChamomile = numChamomile;
    }

    @Override
    public String toString() {
        return "Вес: " + getWeight() + " грамм" +
                "\nЦена: " + getPrice() + " $" +
                "\nКомпания: " + getProduceCompany() +
                "\nКоличество лепестков: " + numChamomile + " шт";

    }
}
