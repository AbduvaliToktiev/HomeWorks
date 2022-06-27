package month3.lesson35;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Element400 {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 100; j++) {
                integers.add(j);
            }
        }
        for (Integer i: integers) {
            System.out.println(i);
        }
    }
}
