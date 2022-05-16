package month2.month2Praktik12;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Cat cat = new Cat("TOM", 50, 50);
        Food lagman = new Food("Lagman", 30, 5);
        Food water = new Food("water", 0, 50);
        Food cheaps = new Food("cheaps", 5, -30);
        boolean game = true;
        Scanner scanner = new Scanner(System.in);
        while (game) {
            System.out.println("Start game");
            System.out.println("-----------------");
            System.out.println(String.format("%s Satiety: %s, Thirsty : %s", cat.getName(), cat.getSatiety(), cat.getThirsty()));
            System.out.println("Action: ");
            String action = scanner.nextLine();
            switch (action) {
                case "1":
                    eat(cat, lagman);
                    break;
                case "2":
                    eat(cat, water);
                    break;
                case "3":
                    eat(cat, cheaps);
                    break;
                case "4":
                    System.out.println("Ne dal edy");
                    break;
                default:
                    game = false;
                    break;
            }
            if (cat.getThirsty() < cat.getMinThirsty() || cat.getSatiety() < cat.getMinSatiety()) {
                System.out.println(cat.getName() + " died");
                game = false;
            } else {
                System.out.println(cat.getName() + " is happy");
            }
            cat.setSatiety(cat.getSatiety() - 10);
            cat.setThirsty(cat.getThirsty() - 10);
        }
    }
    private static void eat(Cat cat, Food food) {
        cat.setThirsty(cat.getThirsty() + food.getThirsty());
        cat.setSatiety(cat.getSatiety() + food.getSatiety());
    }
}
