package month1;

import java.util.Scanner;

public class HomeWork1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = num * (num + 1) / 2;
        System.out.println(num2);
    }
}

class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d, e, f, k, p, g;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        e = scanner.nextDouble();
        f = scanner.nextDouble();
        k = scanner.nextDouble();
        p = scanner.nextDouble();
        g = scanner.nextDouble();
        System.out.println(a + b + c + d - e - f / k + p + g);


    }
}

class C4_3 {
    public static void main(String[] args) {
        double d = Math.round(
                Math.sqrt(
                        Math.pow(5.5 - 1.5, 2) + Math.pow(3.5 - 2, 2)
                ) * 1000.0) / 1000.0;

        System.out.println(d);
    }
}

class D4_3 {
    public static void main(String[] args) {
        String a = "Сабина";
        short b = 1994;
        System.out.println("Привет, как тебя зовут?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Сабина, приятно познакомиться");
        System.out.println("В каком году ты родилась?");
        String birthday = sc.nextLine();
        System.out.println("Вам 24 лет");
    }
}


