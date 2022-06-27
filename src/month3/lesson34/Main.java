package month3.lesson34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
        System.out.println(line.replace('а', 'б'));
    }
}

class Slova {
    public static void main(String[] args) {
        int count = -1;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String lineSplit = sc.nextLine();
        String[] strings = lineSplit.split(" +");
        System.out.println("Вы ввели " + strings.length + " слов");

        for (String st : strings) {
            if (st.length() > temp) {
                temp = st.length();
                count++;
            }
        }
        System.out.println("Самое длиное слово: " + strings[count].indexOf("sd") + " длина " + temp);
    }
}

class FIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя фамилию и очество, через пробел");
        String line = sc.nextLine();
        String[] strings = line.split(" ");
        if (strings.length == 2) {
            System.out.println(strings[0] + strings[1].charAt(0));
        } else if (strings[1].equalsIgnoreCase("уулу") || strings[1].equalsIgnoreCase("кызы")) {
            System.out.println(strings[0] + strings[1].charAt(0) + strings[2]);
        } else {
            System.out.println(strings[0] + strings[1].charAt(0) + strings[2].charAt(0));
        }
    }
}