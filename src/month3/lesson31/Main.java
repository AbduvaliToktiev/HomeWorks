package month3.lesson31;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            mass.add(i * i);
        }
        for (Integer i : mass) {
            System.out.println(i);
        }

        System.out.println(mass.size());
    }
}

class Proverka {
    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                mass.add(count, i);
                count++;
            } else {
                mass.add(i);
            }
        }
        for (Integer i : mass) {
            System.out.print(i + " ");
        }
    }
}

class Test {
    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            mass.add(i * i);
        }
        for (Integer i : mass) {
            if (i % 3 == 0) {
                ArrayList<Integer> mass3 = new ArrayList<>();
                mass3.add(i);
                System.out.print(mass3 + " ");
            }
            if (i % 2 == 0) {
                ArrayList<Integer> mass2 = new ArrayList<>();
                mass2.add(i);
                System.out.print(mass2 + " ");
            }
        }
    }
}

class Continue {
    public static void main(String[] args) {
        int count = 0;
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                mass.add(count, i);
                count++;
            } else {
                mass.add(i);
            }
        }
        for (Integer i: mass) {
            System.out.println(i + " ");
        }
        for (Integer i: mass) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
