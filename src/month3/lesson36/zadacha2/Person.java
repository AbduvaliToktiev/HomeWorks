package month3.lesson36.zadacha2;

import java.util.Scanner;

public class Person {
    private int age;
    private String education;

    public Person() {

    }

    public Person(int age, String education) {
        this.age = age;
        this.education = education;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Я: " + " | Мой возраст = " + age + " | Моё образование = " + education;
    }

    int eat() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите название еды: ");
        String eat = sc.nextLine();
        if (eat.equals("мёд")) {
            throw new Exception("Мёд нельзя!");
        } else {
            System.out.println(eat);
        }

        return 0;
    }

    void go() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("В какую сторону идти: ");
        String side = sc.nextLine();
        switch (side) {
            case "север":
                System.out.println(side);
                break;
            case "юг":
                System.out.println(side);
                break;
            case "запад":
                System.out.println(side);
                break;
            case "восток":
                System.out.println(side);
                break;
            default:
                throw new Exception("Укажи сторону, например: север");
        }
    }
}
