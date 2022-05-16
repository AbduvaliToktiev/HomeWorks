package month2.Computer;

public class Keyboard extends USB {
    private boolean backlight = false;
    private boolean additionalDigits = false;

    public Keyboard() {

    }

    public Keyboard(boolean backlight, boolean additionalDigits) {
        this.backlight = backlight;
        this.additionalDigits = additionalDigits;
    }

    public boolean isAdditionalDigits() {
        return additionalDigits;
    }

    public void setAdditionalDigits(boolean additionalDigits) {
        this.additionalDigits = additionalDigits;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

}
