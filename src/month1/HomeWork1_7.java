package month1;

import java.util.Scanner;

public class HomeWork1_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


    }
}

class B1_7 {
    public static void main(String[] args) {
        int a = 10000;
        int b = 99999;

        for (int i = a; i <= b; i++) {
            if (i % 133 == 125 && i % 134 == 111) {
                System.out.println(i);
            }
        }
    }
}