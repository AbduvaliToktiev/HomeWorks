package month3.lesson26;

public class Main {
    public static void main(String[] args) {
        Desk desk1 = new Black("Black");
        Desk desk2 = new WhiteDesk("White");
        Desk desk3 = new Black("Black");

        System.out.println(desk1.write() + "\n" + desk2.write() + "\n" + desk3.write());
    }
}


