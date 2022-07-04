package month3.lesson36.zadacha5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый приём пищи:");
        eat("Каша", "Творог", "Аткян чай");
        System.out.println("Второй приём пищи:");
        eat("Котлеты с пюре", "Пельмени", "Сюгаш");
        int eat1 = 150;
        int eat2 = 200;
        int eat3 = 250;
        int sum = eat1 + eat2 + eat3;
        System.out.println("Сумма блюд за второй приём пищи: " + sum);
        System.out.println("Третий приём пищи:");
        eat("Бистроган", "Плов");
    }


    private static void eat(String... eat) {
        System.out.println(Arrays.toString(eat));
    }
}
