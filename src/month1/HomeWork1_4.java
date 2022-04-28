package month1;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a, b, c;
        a = random.nextInt(180);
        b = random.nextInt(180);
        c = random.nextInt(180);
        Scanner sc = new Scanner(System.in);
        a = sc.nextShort();
        b = sc.nextShort();
        c = sc.nextShort();
        if (a == b && c != 180) {
            System.out.println("Нет");
        } else if (a + b + c == 180) {
            System.out.println("Да");
        }
    }
}

class B1_4 {
    public static void main(String[] args) {
        int N, A;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        if (N % A == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }
    }
}

class C1_4 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == b && a == c) {
            System.out.println("Они одинаковые");
        } else if (a >= c && b == c) {
            System.out.println("Два числа одинаковые");
        } else if (a <= b && a >= c) {
            System.out.println("Два числа одинаковые");
        } else if (a >= b && a <= c) {
            System.out.println("Два числа одинаковые");
        } else {
            System.out.println("Нет одинаковых чисел");
        }
    }
}


