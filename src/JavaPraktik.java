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

//Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
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
                "Валет", "Королева", "Король", "Туз"
        };
        int n = suits.length * rank.length; // количество карт
        // часть 2 - ввод с консоли
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");

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

//Напишите программу HowMany.java, которая определит, сколько слов Вы ввели с консоли.
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
        System.out.println("Вы ввели " + count + "слов");
    }
}

//Напишите программу Transpose.java, которая будет транспонировать заданную квадратную матрицу без использования дополнительного массива.
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