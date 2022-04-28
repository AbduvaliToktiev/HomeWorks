package month1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class HomeWrk1_8 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Массив: ");
        int A = 6;
        int[] N = new int[A];
        for (int i = 0; i < N.length; i++) {
            N[i] = r.nextInt(6);
        }
        System.out.println(Arrays.toString(N));
        System.out.println("Есть: ");
        for (int i = 0; i < N.length - 1; i++) {
            if (N[i] == N[i + 1]) {
                System.out.print(N[i]);
                break;
            }
        }

    }
}

class B1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите размер массива: ");
        int a = sc.nextInt();
        int[] n = new int[a];
        System.out.print("Ваш массив = ");
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(13);
        }
        System.out.println(Arrays.toString(n));
        System.out.println();
        for (int i = 0; i < n.length; i++) {
            switch (n[i]) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    System.out.println("Ошибка");
            }
        }
    }
}

class C1_8 {
    public static void main(String[] args) {
        int Sum1 = 0;
        int Sum1_1 = 0;
        int Sum2 = 0;
        int Sum2_2 = 0;
        int Sum3 = 0;
        int Sum3_3 = 0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите размер массива: ");
        int A = sc.nextInt();
        int[] N = new int[A];
        System.out.print("Ваш массив = ");
        for (int i = 0; i < N.length; i++) {
            N[i] = r.nextInt(101);
            if (N[i] <= 30) {
                Sum1 += N[i];
                Sum2_2++;
            } else if (N[i] > 61) {
                Sum2 += N[i];
                Sum3_3++;
            } else if (N[i] <= 60) {
                Sum3 += N[i];
                Sum1_1++;
            }
        }
        System.out.println(Arrays.toString(N));
        System.out.println("От 1 до 30 => " + (float) (Sum1 / Sum2_2) + " Количество " + (Sum2_2));
        System.out.println("От 31 до 60 => " + (float) (Sum3 / Sum1_1) + " Количество " + (Sum1_1));
        System.out.println("От 61 до 100 => " + (float) (Sum2 / Sum3_3) + " Количество " + (Sum3_3));

    }
}


