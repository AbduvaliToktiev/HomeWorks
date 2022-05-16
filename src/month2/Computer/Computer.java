package month2.Computer;

public class Computer {
    private String display;
    private String brand;
    private String color;
    private int RAM;
    private String videosCard;
    private String keyboard;



    public Computer() {

    }

    public Computer(String display, String brand, String color, int RAM, String videosCard, String keyboard){
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.RAM = RAM;
        this.videosCard = videosCard;
        this.keyboard = keyboard;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getVideosCard() {
        return videosCard;
    }

    public void setVideosCard(String videosCard) {
        this.videosCard = videosCard;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
