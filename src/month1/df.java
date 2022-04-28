package month1;

import java.util.Scanner;
public class df {
    public static void main(String[] args) {
                System.out.println("Введите 3 числа");
                int a,b,c;
                double d = 3;
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                System.out.println(a + b + c);
                System.out.println(a * b * c);
                System.out.println((a + b + c) / d);
            }
        }

        class B {
            public static void main(String[] args) {
                System.out.println("Ввещественное число tC");
                short tC;
                Scanner sc = new Scanner(System.in);
                tC = sc.nextShort();
                System.out.println("Ввещественное число tF");
                System.out.println((tC * 9 / 5) + 32);
            }
        }

        class C {
            public static void main(String[] args) {
                System.out.println("Введите трёхзначное число");
                short a;
                Scanner sc = new Scanner(System.in);
                a = sc.nextShort();
                System.out.println(a % 100 / 7 + "," + a % 100 / 10 + "," + a % 10);
            }
}


