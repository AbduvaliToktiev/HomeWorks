package month2;

public class TheCountry {
    String name;
    String neighbours;
    int vvp;
    int army;
    String thePrezident;
    public static void main(String[] args) {
        TheCountry country = new TheCountry();
        country.name = "Kazahstan";
        country.neighbours = "Kyrgyzstan, Uzbekistan, Russia";
        country.vvp = 27867;
        country.army = 70000;
        country.thePrezident = "Kasym Joomart Tokaev";
        System.out.println("Страна: " + country.name + "\n" +
                "Соседи: " + country.neighbours + "\n" +
                "ВВП на душу населения: " + country.vvp + " $ \n" +
                "Численность армии: " + country.army + " человек\n" +
                "Президент страны: " + country.thePrezident);
    }
}

