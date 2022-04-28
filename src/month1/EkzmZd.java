package month1;

import java.util.Scanner;

public class EkzmZd {
    public static void main(String[] args) {
        System.out.print("Если вам от 0 до 9 напишите - 0\n" +
                "Если вам от 10 до 18 напишите - 1\n" +
                "Если вам от 19 до 27 напишите - 2\n" +
                "Если вам от 28 до 36 напишите - 3\n" +
                "Если вам от 37 до 45 напишите - 4\n" +
                "Если вам от 46 до 54 напишите - 5\n");
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("1 где нибудь (все след операции тоже можете записать), \n" +
                "2) а затем умножьте на 9. \n" +
                "3) Теперь добавьте ваш возраст. \n" +
                "4) Далее вам нужно будет сложить все числа что у вас получилось после добавления вашего возраста \n" +
                "до тех пор пока не получится однозначное число (от 1 до 9)\n" +
                "Например: 12345 -> 1+2+3+4+5 = 15 -> 1+5 = 6\n + ");

        System.out.println("Прошу ввести это число: ");
        age(num);
        System.out.println(sumNum(age(num)));
    }

    public static int age(int num) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Вам: " + (9 * num + age));
        return num;
    }

    public static int sumNum(int num) {
        int num2 = 0;
        while (true) {
            if (String.valueOf(sumNum2(num)).length() > 1) {
                num = sumNum2(num);
                num2 = sumNum2(num);
            } else {
                return num2;
            }
        }
    }

    public static int sumNum2(int num) {
        int num3 = 0;
        String num1 = String.valueOf(num);
        for (int i = 0; i <= num1.length() - 1; i++) {
            num3 += Integer.parseInt(String.valueOf(num1.charAt(i)));
        }
        return num3;
    }
}

class Zadacha2 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        String[] pyt = {"right", "right", "left", "top", "top", "left", "down", "down"};
        for (int i = 0; i < pyt.length; i++) {
            switch (pyt[i]) {
                case "right":
                    x++;
                    break;
                case "left":
                    x--;
                    break;
                case "down":
                    y--;
                    break;
                case "top":
                    y++;
                    break;
            }
        }
        if (x == 0 && y == 0) {
            System.out.println("0 metr");
        } else if (x == 0) {
            System.out.println(Math.abs(y) + " metr");
        } else if (y == 0) {
            System.out.println(Math.abs(x) + " metr");
        } else {
            double sqrt = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            System.out.println(sqrt + " metr");
        }
    }
}

