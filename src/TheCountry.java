public class TheCountry {
        String name;
        String neighbours;
        int number;
        double vvp;
        int army;
        String thePrezident;
    public static void main(String[] args) {
        TheCountry country = new TheCountry();
        country.name = "Kazahstan";
        country.neighbours = "Kyrgyzstan,Uzbekistan,Russia";
        country.vvp = 27.867;
        country.army = 70000;
        country.thePrezident = "Kasym Joomart Tokaev";
        System.out.println(country.name + ": " + country.neighbours + "; "
                + country.vvp + "; "
                + country.army + "; "
                + country.thePrezident);
    }
}
