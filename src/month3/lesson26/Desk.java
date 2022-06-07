package month3.lesson26;

public abstract class Desk {
    private String deskColor;

    public Desk(String deskColor) {
        this.deskColor = deskColor;
    }

    public String getDeskColor() {
        return deskColor;
    }

    public void setDeskColor(String deskColor) {
        this.deskColor = deskColor;
    }

    abstract String write();

}
