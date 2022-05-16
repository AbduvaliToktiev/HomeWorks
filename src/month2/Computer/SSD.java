package month2.Computer;

public class SSD extends HDD {
    private int memory;
    private String brand1;

    public SSD() {

    }
    public SSD(int memory, String brand1) {
        this.memory = memory;
        this.brand1 = brand1;

    }

    public String getBrand1() {
        return brand1;
    }

    public void setBrand1(String brand1) {
        this.brand1 = brand1;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
