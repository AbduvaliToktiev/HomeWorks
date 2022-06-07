package month3.lesson26;

import month3.lesson26.Desk;

public class WhiteDesk extends Desk {
    public WhiteDesk(String deskColor) {
        super(deskColor);
    }

    @Override
    String write() {
        return "Пишем маркером";
    }
}

