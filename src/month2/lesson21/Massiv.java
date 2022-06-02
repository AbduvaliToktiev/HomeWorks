package month2.lesson21;

import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {
        final int[] MASS1 = new int[10];
        MASS1[0] = 1;
        MASS1[1] = 9;
        MASS1[2] = 3;
        MASS1[3] = 9;
        MASS1[4] = 6;
        MASS1[5] = 8;
        int[] Mass2 = MASS1;
        System.out.println(Arrays.toString(Mass2));

    }
}
