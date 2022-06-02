package month2.praktik16;

import java.util.Random;

public class Deck {
        Card[] card = new Card[52];
        Card[] myCards = new Card[5];

        Deck() {
        }

        void fillMyCards() {
            for (int i = 0; i < myCards.length; i++) {
                myCards[i] = new Card(1, 1);
                myCards[i].whom = false;
            }
        }

        void fillDeck() {
            int counter = 0;
            for (int i = 0; i < 13; i++) {
                for (int j = 0; j < 4; j++) {
                    card[counter] = new Card(i, j);
                    counter = counter + 1;
                }
            }
        }

        void printDesk() {
            System.out.println();
            System.out.println("----TEST.Deck---");
            int counter = 0;
            for (int i = 0; i < card.length; i++) {
                card[i].deScribe();
                counter = counter + 1;
                if (counter == 10) {
                    System.out.println();
                    counter = 0;
                }
            }
        }

        void printMyCards() {
            for (int i = 0; i < myCards.length; i++) {
                myCards[i].deScribe();
            }
            System.out.println();
        }

        void mixDeck() {
            Card card2;
            for (int i = 51; i >= 0; i--) {
                card2 = card[i];
                int rnd = getRnd(i);
                card[i] = card[rnd];
                card[rnd] = card2;
            }
            sortTheDesk();
        }

        void sortTheDesk() {
            Card card2;
            int counter = 0;
            for (int j = 51; j >= 0; j--) {
                if (card[j].whom == false) {
                    card2 = card[51 - counter];
                    card[51 - counter] = card[j];
                    card[j] = card2;
                    counter++;
                }
            }
        }

        int getRnd(int a) {
            if (a > 0) {
                Random rnd = new Random();
                int c = rnd.nextInt(a);
                return c;
            }
            return 0;

        }

        void takeCard() {

            int counter = 0;
            for (int i = 0; i < 5; i++) {
                if (myCards[i].whom == false) {
                    makeFalse(i);
                    break;
                } else {
                    counter = counter + 1;
                }
            }
            if (counter == 5) {
                System.out.println("You cant take a card");
            }
        }

        void makeFalse(int a) {
            Card b = myCards[a];
            myCards[a] = card[0];
            for (int i = 0; i < 51; i++) {
                card[i] = card[i + 1];
            }
            card[51] = b;
        }
    }

