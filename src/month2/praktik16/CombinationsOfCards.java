package month2.praktik16;

import java.util.Arrays;

public class CombinationsOfCards {
    String[] arrayName;
    String[] arraySuit;
    int[] intArray = new int[5];


    CombinationsOfCards(String[] arrayName, String[] arraySuit) {
        this.arrayName = arrayName;
        this.arraySuit = arraySuit;
        fillIntArray();
    }

    void start() {
        highCard();
        bonusWithNames();
        bonusWithSuits();
    }

    void bonusWithSuits() {
        int counter = 0;

        for (int i = 1; i < 5; i++) {
            if (!arraySuit[0].equals("No")) {
                if (arraySuit[0].equals(arraySuit[i])) {
                    counter = counter + 1;
                }
            }
        }

        Arrays.sort(intArray);
        int counter2 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (intArray[j] == (intArray[i] + j)) {
                    counter2 = counter2 + 1;
                }
            }
        }

        if (counter == 4) {
            if (counter2 == 4) {
                if (intArray[0] == 10) {
                    System.out.println("Bonus:Royal Flesh");
                } else {
                    System.out.println("Bonus:Strit Flesh");
                }
            } else {
                System.out.println("Bonus: Flesh");
            }
        } else {
            if (counter2 == 4) {
                System.out.println("Bonus: Strit");
            }
        }
    }

    void highCard() {
        for (int i = 0; i < 5; i++) {
            if (arrayName[i].equals("A")) {
                System.out.println("Bonus: High TEST.Card");
            }
        }
    }

    void fillIntArray() {

        for (int i = 0; i < 5; i++) {
            if (arrayName[i].equals("J")) {
                intArray[i] = 11;
            } else if (arrayName[i].equals("Q")) {
                intArray[i] = 12;
            } else if (arrayName[i].equals("K")) {
                intArray[i] = 13;
            } else if (arrayName[i].equals("A")) {
                intArray[i] = 14;
            } else if (arrayName[i].equals("No")) {
                intArray[i] = 0;
            } else {
                intArray[i] = Integer.parseInt(arrayName[i]);
            }
        }
    }

    void bonusWithNames() {
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            if (!arrayName[i].equals("No")) {
                for (int j = i + 1; j < 5; j++) {
                    if (arrayName[i].equals(arrayName[j])) {
                        counter = counter + 1;
                    }
                }
            }
        }
        if (counter == 1) {
            System.out.println("Bonus: Pair");
        } else if (counter == 2) {
            System.out.println("Bonus: Two Pairs");
        } else if (counter == 3) {
            System.out.println("Bonus: Three of Kind (Тройка)");
        } else if (counter == 6) {
            System.out.println("Bonus: Four of Kind (Каре)");
        } else if (counter == 4) {
            System.out.println("Bonus: Full House");
        }
    }
}

