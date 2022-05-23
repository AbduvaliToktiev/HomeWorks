package month2.Lesson20;

import java.util.Scanner;

public class MainOperator {
    public static void main(String[] args) {
            O o = new O();
            o.setZvonok(0.95);
            o.setCMC(2);
            o.setInternet(30);
            System.out.print("О: ");

            Megacom megacom = new Megacom();
            megacom.setZvonok(1.05);
            megacom.setCMC(1.7);
            megacom.setInternet(40);
            System.out.print("Мегаком: ");

            Beeline beeline = new Beeline();
            beeline.setZvonok(1);
            beeline.setCMC(1.2);
            beeline.setInternet(30);
            System.out.print("Билайн: ");
        int g;
        int f = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("У тебя есть 2 сим телефон:");
        System.out.println("Выбери 1 симкарту: ");
        System.out.println("Нажмите 1, если хотите Билайн" + " \n" +
                "Нажмите 2, если хотите Мегаком" + " \n" +
                "Нажмите 3, если хотите О");
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.println("Вы выбрали симкарту Билайн");
        } else if (choice1 == 2) {
            System.out.println("Вы выбрали симкарту Мегаком");
        } else if (choice1 == 3) {
            System.out.println("Вы выбрали симкарту О");
        }
        System.out.println();
        System.out.println("Выбери 2 симкарту: ");
        System.out.println("Нажмите 1, если хотите Билайн" + " \n" +
                "Нажмите 2, если хотите Мегаком" + " \n" +
                "Нажмите 3, если хотите О");
        int choice2 = sc.nextInt();
        if (choice1 == choice2) {
            System.out.println("Две симкарты одинаковы");
        } else if (choice2 == 1) {
            System.out.println("Вы выбрали симкарту Билайн");
        } else if (choice2 == 2) {
            System.out.println("Вы выбрали симкарту Мегаком");
        } else if (choice2 == 3) {
            System.out.println("Вы выбрали симкарту О");
        }
        System.out.println();
        System.out.println("Ваша первая симкарта: " + choice1 + " \n" +
                "Ваша вторая симкарта: " + choice2);
        System.out.println();
        System.out.print("Введите ваш номер: ");
        System.out.print("+996");
        int phoneNumber = sc.nextInt();
        if (phoneNumber >= 1000000000) {
            System.out.println("вы ввели неправельный номер");
        } else if (phoneNumber < 200000000) {
            System.out.println("вы ввели неправельный номер");
        } else {
            g = phoneNumber / 10000000;
            if (g == 77) {
                f = 1;
            } else if (g == 55) {
                f = 2;
            } else if (g == 70) {
                f = 3;
            }
                System.out.println("Это ваш номер: " + phoneNumber + "\nНомер вашего оператора: " + f);
            System.out.println();
            System.out.print("Введите номер кому вы звоните: ");
            System.out.print("+996");
            int phoneNumber2 = sc.nextInt();
            if (phoneNumber2 >= 1000000000) {
                System.out.println("вы ввели неправельный номер");
            } else if (phoneNumber2 < 200000000) {
                System.out.println("вы ввели неправельный номер");
            } else {
                g = phoneNumber / 10000000;
                if (g == 77) {
                    f = 1;
                } else if (g == 55) {
                    f = 2;
                } else if (g == 70) {
                    f = 3;
                }
                System.out.println("Это номер на который вы звоните: " + phoneNumber2 + "\nНомер оператора которому вы звоните: " + f);
            }
            if (f == 1) {
                System.out.println(o);
            System.out.print("Сколько минут будете разговаривать: ");
            double time = sc.nextDouble();
            time = time * o.getZvonok();
            System.out.println("Стоимость вашего разговора составляет: " + time + " сом");
                System.out.print("Сколько СМС будете отправлять: ");
                double message = sc.nextDouble();
                message = message * o.getCMC();
                System.out.println("Стоимость ваших отправленных СМС составляет: " + message + " сом");
                System.out.println("Сколько Гб интернета вам необходимо: ");
                int gb = sc.nextInt();
                gb = gb * o.getInternet();
                System.out.print("Стоимость вашего интернета составляет: " + gb + " сом");
            } else if (f == 2) {
                System.out.println(megacom);
                System.out.print("Сколько минут будете разговаривать: ");
                double time2 = sc.nextDouble();
                time2 = time2 * megacom.getZvonok();
                System.out.println("Стоимость вашего разговора составляет: " + time2 + " сом");
                System.out.print("Сколько СМС будете отправлять: ");
                double message2 = sc.nextDouble();
                message2 = message2 * megacom.getCMC();
                System.out.println("Стоимость ваших отправленных СМС составляет: " + message2 + " сом");
                System.out.println("Сколько Гб интернета вам необходимо: ");
                int gb2 = sc.nextInt();
                gb2 = gb2 * megacom.getInternet();
                System.out.print("Стоимость вашего интернета составляет: " + gb2 + " сом");
            } else {
                System.out.println(beeline);
                System.out.print("Сколько минут будете разговаривать: ");
                double time3 = sc.nextDouble();
                time3 = time3 * beeline.getZvonok();
                System.out.println("Стоимость вашего разговора составляет: " + time3 + " сом");
                System.out.print("Сколько СМС будете отправлять: ");
                double message3 = sc.nextDouble();
                message3 = message3 * beeline.getCMC();
                System.out.println("Стоимость ваших отправленных СМС составляет: " + message3 + " сом");
                System.out.print("Сколько Гб интернета вам необходимо: ");
                int gb3 = sc.nextInt();
                gb3 = gb3 * beeline.getInternet();
                System.out.print("Стоимость вашего интернета составляет: " + gb3 + " сом");
            }
        }
    }
}
