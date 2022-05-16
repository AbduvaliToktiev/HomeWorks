package month2.month2Praktik12;

public class Food {
    private String name;
    private int satiety;

    public Food(String name, int satiety, int thirsty) {
        this.name = name;
        this.satiety = satiety;
        this.thirsty = thirsty;
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

    private int thirsty;

}
