package month1;

import java.util.Random;

public class HomeWork1_10 {
    public static void main(String[] args) {
        Random r = new Random();
        int N = 4, M = 4;
        int[][] tabl = new int[4][4];
        int numMax = 0;
        int numMin = 0;
        int min = 10;
        int max = 99;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                tabl[i][k] = r.nextInt((max - min) + 1) + min;
                System.out.print(tabl[i][k] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                if (tabl[i][k] > numMin)
                    numMin = tabl[i][k];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                if (tabl[i][k] < numMin) {
                    numMin = tabl[i][k];
                }
            }
        }
        System.out.println("Минимальный элемент: " + numMin);
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                if (tabl[i][k] > numMax)
                    numMax = tabl[i][k];
            }
        }
        System.out.println("Максимальный элемент: " + numMax);
    }
}

class B1_10 {
    public static void main(String[] args) {
        Random r = new Random();
        int N = 4, M = 4;
        double count = 0;
        int sum = 0;
        int[][] matrica = new int[4][4];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                matrica[i][k] = r.nextInt(256);
                System.out.print(matrica[i][k] + " ");
                sum = sum + matrica[i][k];
                count++;
            }
            System.out.println("");
        }
        count = sum / count;
        System.out.println("Средняя яркость: " + count);
        System.out.println("Результат ");
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                if (count > matrica[i][k]) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print("255" + " ");
                }
            }
            System.out.println();
        }
    }
}

