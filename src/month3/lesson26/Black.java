package month3.lesson26;

public class Black extends Desk {
    public Black(String deskColor) {
        super(deskColor);
    }

    @Override
    String write() {
        return "пишем мелом";
    }
}

