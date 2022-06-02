package month2.praktik16;

    public class Card {
        final String[] namesArray = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        final String[] suitsArray = {"\u2660", "\u2665", "\u2666", "\u2663"};
        private String name;
        private String suit;
        boolean whom = true;

        Card(int a, int b) {
            name = namesArray[a];
            suit = suitsArray[b];
        }

        public String getName() {
            return name;
        }

        public String getSuit() {
            return suit;
        }

        void deScribe() {

            if (getWhom() == true) {
                System.out.printf("|%2s%s|", name, suit);
            } else {
                System.out.printf("|%2s%s|", " ", " ");
            }
        }

        boolean getWhom() {
            return whom;
        }
    }

