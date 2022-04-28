package month1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1_9 {
    public static void main(String[] args) {
        int[] N = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 1; i <= N.length; i++) {
            for (int k = 1; k <= i; k++) {
                if (i * k == 0) {
                    count++;
                }
                if (count < 1) {
                    System.out.println(i + " * " + k + " = " + i * k);
                }
                count = 0;
            }
        }
    }
}

class B1_9 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 15; i++) {
            for (int a = 0; a <= 13; a++) {
                for (int b = 0; b <= 10; b++) {
                    for (int c = 0; c <= 9; c++) {
                        for (int d = 0; d <= 9; d++) {
                            if ((i * 15) + (a * 13) + (b * 21) + (c * 23) + (d * 25) == 225) {
                                count++;
                                System.out.println(i + " * 15 + " + a + " * 13 + " + b + " * 21 + " + " * 23 + " + d + " * 25 = 225");
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Возможных вариантов: " + count);
    }
}

class C1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] N = new int[A];
        for (int i = 1; i <= N.length - 1; i++) {
            for (int k = 0; k <= i; k++) {
                if (k % i == 0) ;
                N[i] = i;
            }
        }
        System.out.println(Arrays.toString(N));
    }
}

