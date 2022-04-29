package month2;

public class Lion extends Animal {
    String family;
    int number;
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.view = "Mammal";
        lion.habitat = "Africa";
        lion.family = "Feline";
        lion.number = 20000;
        System.out.println("Лев животное: " + lion.view + " (Млекопитающее)\n" +
                "Место обитание: " + lion.habitat + " (Африка)\n" +
                "Относится к семейству: " + lion.family + " (Кошачьих)\n" +
                "Численность в мире состовляет: " + lion.number);
    }
}
