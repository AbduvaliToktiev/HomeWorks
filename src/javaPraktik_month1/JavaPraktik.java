package javaPraktik_month1;

import java.util.Scanner;
import java.util.Arrays;

//Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
// Не используйте дополнительный массив для хранения результатов.
public class JavaPraktik {
    public static void main(String[] args) {
        String[] a = {"Каждый ", " охотник ", " желает ", " знать ", " где ", " сидит ", " фазан "};
        //Выводим изначальный массив в консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}

//Напишите программу .java, которая должна имитировать раздачу карт для игры в покер.
// Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков (по 5 карт каждому) из рассортированной колоды.
// Разделяйте пять карт, выданных каждому игроку, пустой строкой.
class Deal {
    public static void main(String[] args) {
        // часть 1 - инициализация переменных
        int cardsPerPlayer = 5;
        int players = 0;
        String[] suits = {
                "Пики", "Буби", "Черви", "Крести"
        };
        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"
        };
        int  n = suits.length * rank.length; // количество карт
        // часть 2 - ввод с консоли
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество игроков: ");

            if (sc.hasNextInt()) {

                players = sc.nextInt();
                if (cardsPerPlayer * players <= n) {
                    break;
                } else {
                    if (players == 0) {

                        System.out.println("Игра прекращена.");
                        break;

                    } else if (players < 0) {

                        System.out.println("Число игроков не может быть меньше 0");

                    } else {

                        System.out.println("Слишком много игроков!");
                    }
                }

            } else {
                System.out.println("Вы ввели не число, или Ваше число слишком большое!");

            }
        }
        // часть 3 - инициализация колоды
        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        // часть 4 - перетасовка колоды
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i)); // случайная карта в колоде
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        // часть 5 - перетасованная колода выводится на экран
        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1)
                System.out.println();
        }
    }
}

//Напишите программу .java, которая определит, сколько слов Вы ввели с консоли.
class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        //Начальное количество слов равно 0
        int count = 0;
        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
        if (input.length() != 0) {
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + count + " слов");
    }
}

//Напишите программу .java, которая будет транспонировать заданную квадратную матрицу без использования дополнительного массива.
//Напоминаем, что такое транспонирование матрицы.
//Транспонированная матрица - это матрица, полученная из исходной матрицы путем замены строк на столбцы.
//Ниже приводим 2 примера транспонированной матрицы.
class Transpose {
    public static void main(String[] args) {
        // часть 1 - создаем матрицу n на n
        int n = 3;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n * i + j;
            }
        }
        // часть 2 - выводит на экран начальную матрицу
        System.out.println("Начальная матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        // часть 3 - транспонирование матрицы
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // часть 4 - выводит на экран транспонированную матрицу
        System.out.println();
        System.out.println("Новая матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}

// Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
class Test {
    public static void main(String[] args) {
        int[] mas = new int[12];
        int maxNumber = -16;
        int maxIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 31) - 15;
            if (maxNumber <= mas[i]) {
                maxNumber = mas[i];
                maxIndex = i;
            }
        }

        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}

//1. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
//2. Выведите массив на экран в строку
//3. Замените каждый элемент с нечётным индексом на ноль
//4. Снова выведете массив на экран на отдельной строке
class Test2 {
    public static void main(String[] args) {
        int[] mas = new int[8];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 1) {
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

//1. Создайте массив из 4 случайных целых чисел из отрезка [10;99]
//2. Выведите его на экран в строку.
//3. Далее определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью
class Ascending {
    public static void main(String[] args) {
        int[] mass = new int[4];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(mass));
        boolean flag = true;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] <= mass[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}

//1. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
//2. Выведите массивы на экран в двух отдельных строках
//3. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
class Average {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        double average1 = 0;
        double average2 = 0;
        int[] mass1 = new int[5];
        int[] mass2 = new int[5];

        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (int) (Math.random() * 5) + 1;
            average1 = mass1.length;
            sum1 = sum1 + mass1[i];
            average1 = sum1 / average1;
        }
        System.out.println(Arrays.toString(mass1));
        System.out.println("Среднее арифмитическое первого массива: " + average1);
        System.out.println();
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = (int) (Math.random() * 4) + 1;
            average2 = mass2.length;
            sum2 = sum2 + mass2[i];
            average2 = sum2 / average2;
        }
        System.out.println(Arrays.toString(mass2));
        System.out.println("Среднее арифмитическое второго массива: " + average2);
        if (average1 < average2 || average1 > average2) {
            System.out.println("Среднее значение массивов разное");
        } else {
            System.out.println("Среднее значение массивов одинаковое");
        }
    }
}

//1. Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3. Введенное пользователем число сохраняется в переменную n.
//2. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//3. Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//4. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = 0;
        while (n <= 3) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 3) {
                    System.out.print("Введенное число должно быть больше 3. Повторите ввод: ");
                }
            } else {
                System.out.print("Вы ввели не число. Повторите ввод: ");
                sc.next();
            }
        }
        int[] mas1 = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            mas1[i] = (int) (Math.random() * (n + 1));
            if (mas1[i] % 2 == 0) {
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(mas1));
        int[] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (mas1[i] % 2 == 0) {
                mas2[index] = mas1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}
