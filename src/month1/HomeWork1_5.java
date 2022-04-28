package month1;

import java.util.Scanner;
import java.util.Random;

public class HomeWork1_5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 != 0) {
            System.out.println(a);
        }

    }
}

class B1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 10) {
            System.out.println("Положительное число больше 10 или\n" +
                    "отрицательное");
        } else if (a == 10) {
            System.out.println("Это число равно 10");
        } else {
            System.out.println("Положительное число меньше 10");
        }

    }
}

class C1_5 {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a == 1) {
            System.out.println("Понедельник");
        } else if (a == 2) {
            System.out.println("Вторник");
        } else if (a == 3) {
            System.out.println("Среда");
        } else if (a == 4) {
            System.out.println("Четверг");
        } else if (a == 5) {
            System.out.println("Пятница");
        } else if (a == 6) {
            System.out.println("Выходной");
        } else if (a == 7) {
            System.out.println("Выходной");
        }

    }
}

class D1_5 {
    public static void main(String[] args) {
        int min;
        Scanner sc = new Scanner(System.in);
        min = sc.nextInt();
        if (min <= 15) {
            System.out.println("Первая четверть часа");
        } else if (min <= 30) {
            System.out.println("Вторая четверть часа");
        } else if (min <= 45) {
            System.out.println("Третья четверть часа");
        } else if (min <= 59) {
            System.out.println("Четвёртая четверть часа");
        }


    }
}

class E1_5 {
    public static void main(String[] args) {
        short day;
        Scanner sc = new Scanner(System.in);
        day = sc.nextShort();
        if (day <= 10) {
            System.out.println("Первая декада");
        } else if (day <= 20) {
            System.out.println("Вторая декада");
        } else if (day <= 31) {
            System.out.println("Третья декада");
        }

    }
}

class F1_5 {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}

class H1_5 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Выходной");
                break;
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}


