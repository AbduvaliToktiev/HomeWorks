package month3.lesson27;

public class Turtle implements TirtleService{
    @Override
    public String makeEgg() {
        return "I made egg";
    }

    @Override
    public String shield() {
        return "I have shield";
    }

    @Override
    public String egg() {
        return "I lay eggs";
    }
}
