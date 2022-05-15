package JavaPraktik;

import java.util.Scanner;

//Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.
//Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.
public class JavaPraktikMethods {
    static int minNumberPrint(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }

    public static void main(String[] args) {
        System.out.println(minNumberPrint(7, 3));
    }
}

//Напишите метод, который бы проверял, делится ли число на 2 без остатка или нет. Например,
//если число 4, тогда метод должен возвращать true
//если число 5, тогда метод должен возвращать false
//если число 6, тогда метод должен возвращать true
//и т.д.
class EvenOdd {
    static boolean Number(int num) {
        return (num % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Number(num));
    }
}

//Написать метод возведения числа в квадрат. Например,
//И далее к результату прибавить число 2. Например,
//если Вы ввели число 2, тогда в консоль должно быть выведено число 4 и 6
//если Вы ввели число 3, тогда в консоль должно быть выведено число 9 и 11
//если Вы ввели число 5, тогда в консоль должно быть выведено число 25 и 27 и т.д.
class Square {
    static int number(int num) {
        int result = num * num;
        return result;
    }

    public static void main(String[] args) {
        int a1 = number(5);
        System.out.println(a1);
        System.out.println(a1 + 2);
    }
}


//Программа выводит квадрат введёного числа
class NumberSquare {
    static int Square(int num) {
        int result = num * num;
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Квадрат введёного числа: " + Square(num));
    }
}