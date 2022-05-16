package month2.month2Praktik12;

public class Cat {
    private String name;
    private int satiety;
    private int thirsty;
    private int maxThirsty;
    private int maxSatiety;
    private int minSatiety;
    private int minThirsty;

    public Cat(String name, int satiety, int thirsty) {
        this.name = name;
        this.satiety = satiety;
        this.thirsty = thirsty;
        this.maxThirsty = 100;
        this.maxSatiety = 100;
        this.minSatiety = 20;
        this.minThirsty = 30;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getThirsty() {
        return thirsty;
    }

    public void setThirsty(int thirsty) {
        this.thirsty = thirsty;
    }

    public int getMaxThirsty() {
        return maxThirsty;
    }

    public void setMaxThirsty(int maxThirsty) {
        this.maxThirsty = maxThirsty;
    }

    public int getMaxSatiety() {
        return maxSatiety;
    }

    public void setMaxSatiety(int maxSatiety) {
        this.maxSatiety = maxSatiety;
    }

    public int getMinSatiety() {
        return minSatiety;
    }

    public void setMinSatiety(int minSatiety) {
        this.minSatiety = minSatiety;
    }

    public int getMinThirsty() {
        return minThirsty;
    }

    public void setMinThirsty(int minThirsty) {
        this.minThirsty = minThirsty;
    }
}
