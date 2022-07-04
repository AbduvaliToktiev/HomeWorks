package month3.lesson36.zadacha4;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> cats = new LinkedList<>();
        Random random = new Random();
        int cat = random.nextInt(2);
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Не поймал мышку, пью молоко");
            } else {
                System.out.println("Поймал мышку и съел!");
            }
            cats.addFirst(cat);
            cats.addLast(cat);

        }
    }
}
