package javaPraktik_month1;

import java.util.Scanner;

//Необходимо вывести на экран числа от 1 до 5. На экране должно быть:
//1 2 3 4 5
public class JavaPraktikCycles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}

//Необходимо, чтоб программа выводила на экран вот такую последовательность:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98
class TestCycles2 {
    public static void main(String[] args) {
        int num = 7;
        while (num <= 98) {
            System.out.print(num + " ");
            num += 7;
        }
    }
}

//Программа складывает предыдущее число
class Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        while (num < 90000) {
            System.out.print(num + " ");
            num += num;
        }
    }
}

//Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как на картинке ниже.
class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        int height = sc.nextInt();
        System.out.print("Введите ширину: ");
        int width = sc.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
//первый и второй члены последовательности равны единицам
//а каждый следующий — сумме двух предыдущих
//То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
class Fibonacci {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i <= 11; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }
}

//Представим, что у нас есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?"
//Ответ: троллейбус. Можно возражать, конечно, какого цвета сейчас троллейбусы - но мы не об этом.
//Представим, что Вы загадываете эту загадку пользователю. Создайте программу, которая будет считывать с консоли ответ:
//у пользователя есть 3 попытки. После трех ответов программа должна завершиться;
//если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
//если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
//если пользователь вводит любой другой ответ, мы выводим в консоль "Подумай еще." и продолжаем цикл.
class Trolleybus {
    public static void main(String[] args) {
        String answer;
        boolean exit;
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner inputAnswer = new Scanner(System.in);
        exit = false;
        for (int i = 1; i <= 3; i++) {
            if (exit == true)
                break;
            answer = inputAnswer.next();
            switch (answer) {
                case ("Троллейбус"):
                    System.out.println("Правильно!");
                    exit = true;
                    break;
                case ("троллейбус"):
                    System.out.println("правильно!");
                    exit = true;
                    break;
                case ("Сдаюсь"):
                    System.out.println("Правильный ответ: Троллейбус.");
                    exit = true;
                    break;
                case ("сдаюсь"):
                    System.out.println("Правильный ответ: троллейбус.");
                    exit = true;
                    break;
                default:
                    System.out.println("Подумай еще.");
            }
        }
    }
}

//Существует такая традиция: при приготовлении пельменей в один из них кладут монетку на счастье.
//Считается, что тому, кому попадется пельмень с монеткой, улыбнется удача.
//Представим, что у нас есть кастрюля, в которой лежит 10 пельменей. Один из них счастливый —  а именно пятый пельмень.
//Давайте напишем программу, которая ищет счастливый пельмень.
//Программа перебирает пельмени в кастрюле по одному, и когда доходит до пятого пельменя —  напишет "Вот счастливый пельмень!" и выходит из цикла.
class Dumpling {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println("Вот счастливый пельмень!");
                break;
            }
            i++;
        }
    }
}
