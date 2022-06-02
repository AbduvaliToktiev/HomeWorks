package month2.praktik16;

import java.util.Scanner;

public class Game extends Hand {

    void startGame() {
        fillDeck();
        fillMyCards();
        mixDeck();
        takeFiveCards();

        boolean tr = true;
        while (tr) {

            System.out.println();
            commands();
            printMyCards();
            Scanner in = new Scanner(System.in);
            String command = in.next();
            switch (command) {
                case "1":
                    changeCardGame(changeString());
                    break;
                case "2":
                    printDesk();
                    break;
                case "3":
                    changePosition();
                    break;
                case "E":
                    tr = false;
                    break;
                default:
                    break;
            }
        }
    }

    void commands() {
        System.out.println();
        System.out.println("+---------------Commands--------------+");
        System.out.println("Press 1 to change your card");
        System.out.println("Press 2 to print TEST.Deck ");
        System.out.println("Press 3 to change Position of TEST.Card");
        System.out.println("Press E to exit");
        System.out.println("+------------------------------------+");
        checkCombinations();
    }

    void checkCombinations() {

        String[] arrayforNames = new String[5];
        String[] arrayforSuits = new String[5];
        for (int i = 0; i < 5; i++) {
            if (myCards[i].whom == true) {
                arrayforNames[i] = myCards[i].getName();
                arrayforSuits[i] = myCards[i].getSuit();
            } else {
                arrayforNames[i] = "No";
                arrayforSuits[i] = "No";
            }
        }

        CombinationsOfCards cc = new CombinationsOfCards(arrayforNames, arrayforSuits);
        cc.start();
    }

    String changeString() {

        System.out.println("Enter numbers of Cards with space");
        System.out.println("For example: ''1 2 3'' ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }

    void takeFiveCards() {
        for (int i = 0; i < 5; i++) {
            takeCard();
        }
    }

    void changePosition() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: Number of TEST.Card to change Position");
        int a = in.nextInt();
        if (a > 0 && a < 6) {
            System.out.println("Enter Number of Position  where you want to change ");
            int b = in.nextInt();
            if (b > 0 && b < 6) {
                Card rn;
                rn = myCards[a - 1];
                myCards[a - 1] = myCards[b - 1];
                myCards[b - 1] = rn;
            } else {
                System.out.println("Wrong Enter: you have only 5 cards");
            }
        } else {
            System.out.println("Wrong enter... you have only 5 cards");
        }
    }

    void changeCardGame(String a) {
        String[] subStr;
        String delimeter = " ";
        subStr = a.split(delimeter);
        for (int i = 0; i < subStr.length; i++) {
            changeCard(Integer.parseInt(subStr[i]));
        }
    }
}


