package month2.HeroDragon;

import month2.HeroDragon.Dragon;
import month2.HeroDragon.Hero;

import java.util.Random;
public class MainGame {
    public static void main(String[] args) {
        boolean game = true;
        Hero hero = new Hero(1000, 100, 120, 250, 150);
        Dragon dragon = new Dragon(2000, 400, 150, 0);
        int count = 1;
        while (game) {
            startGame(hero, dragon, count);
            System.out.println("------Action Hero--------");

            //hero
            if (hero.getHp() > 0) {
                if (getRandom(1, 4) <= 3) {
                    heroHit(hero, dragon);
                } else {
                    heroMissed();
                }
                if (dragon.getHp() <= 0) {
                    System.out.println("Hero win");
                    game = false;
                }
            }
            //dragon
            if (dragon.getHp() > 0) {
                System.out.println("------Action Dragon--------");
                if (getRandom(1, 2) == 1) {
                    dragonHit(hero, dragon);
                } else {
                    System.out.println("Dragon is sleeping");
                }
                if (hero.getHp() <= 0) {
                    System.out.println("Dragon win");
                    game = false;
                }
            }

            count++;
        }
    }
    private static void dragonHit(Hero hero, Dragon dragon) {
        int uron = dragon.getStrength() + dragon.getWeapon() - hero.getDefence();
        int newHP = hero.getHp() - uron;
        hero.setHp(newHP);
        System.out.println("Dragon hit");
    }
    private static void heroMissed() {
        System.out.println("Hero missed");
    }
    private static void heroHit(Hero hero, Dragon dragon) {
        int uron = hero.getStrength() + hero.getWeapon() - dragon.getDefence();
        int newHP = dragon.getHp() - uron;
        dragon.setHp(newHP);
        System.out.println("Hero hit");
    }
    private static int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt((max + 1) - min) + 1;
    }

    private static void startGame(Hero hero, Dragon dragon, int count) {
        System.out.println(String.format("----------ROUND:%s------------------", count));
        System.out.println();
        System.out.println("dragon : "+ dragon.toString());
        System.out.println();
        System.out.println("hero: " + hero.toString());
    }
}
