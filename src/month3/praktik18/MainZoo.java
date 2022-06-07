package month3.praktik18;

import java.util.Scanner;

public class MainZoo {
    public static void main(String[] args) {
        ZooShop zooShop = new ZooShop();
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to zoo shop");
        while (b) {
            System.out.println("can i help you?");
            String actions = zooShop.actions(scanner.nextLine());

            if (actions.equals("Good Bye")) {
                b = false;
            }
            System.out.println(actions);
        }
    }
}

