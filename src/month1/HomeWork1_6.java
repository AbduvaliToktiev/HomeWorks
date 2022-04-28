package month1;

import java.util.Scanner;

public class HomeWork1_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a % 2 != 1) || (b % 2 != 1)) {
            while (a < b) {
                if (a % 2 == 0)
                    System.out.println(a);
                a++;
            }
        }
    }
}

class B1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        if (b < a && a < 1000000) ;
        while (a != 0) {
            b = b + (a % 10);
            a = a / 10;
        }
        System.out.println(b);
    }
}

class C1_6 {
    public static void main(String[] args) {
        int a = 10000;
        int b = 99999;
        while (a < b) {
            a++;
            if (a % 133 == 125 && a % 134 == 111) ;
            System.out.println(a);
        }
    }
}

