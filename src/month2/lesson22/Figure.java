package month2.lesson22;

public class Figure {
    private String color;
    private boolean invisible;

    public Figure() {

    }

    public Figure(String color, boolean invisible) {
        this.color = color;
        this.invisible = invisible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isInvisible() {
        return invisible;
    }

    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
    }

    public String speak() {
        return "Это фигура!";
    }
}




