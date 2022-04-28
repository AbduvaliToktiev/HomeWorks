package month1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class HomeWork1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        numtabl(num);
    }

    public static void numtabl(int num) {
        String num2 = String.valueOf(num);
        for (int i = 0; i <= num2.length() - 1; i++) {
            System.out.println(num2.charAt(i));
        }
    }
}

class B1_11 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Массив: ");
        int mass = 8;
        int[] mass1 = new int[mass];
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(mass1));
        System.out.print("Минимальный элемент: ");
        minEl(mass1);
        System.out.print("Максимальный элемент: ");
        maxEl(mass1);

    }

    public static void minEl(int[] mass) {
        int num = mass[0];
        for (int i = 0; i <= mass.length - 1; i++) {
            num = Math.min(mass[i], num);
        }
        System.out.println(num);
    }

    public static void maxEl(int[] mass) {
        int num1 = mass[0];
        for (int i = 0; i <= mass.length - 1; i++) {
            num1 = Math.max(mass[i], num1);
        }
        System.out.println(num1);
    }
}