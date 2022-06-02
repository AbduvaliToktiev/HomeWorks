package month2.praktik16;

public class Hand extends Deck {
    @Override
    void printMyCards() {
        System.out.println("---Your cards---");
        System.out.printf("%4s|%4s|%4s|%4s|%4s", 1, 2, 3, 4, 5);
        System.out.println();
        super.printMyCards();
    }

    void changeCard(int a) {
        if (a > 0 && a < 6) {
            makeFalse(a - 1);
            sortTheDesk();
        } else {
            System.out.println(a + " is Wrong Enter you have Only 5 Cards ");
        }
    }
}


