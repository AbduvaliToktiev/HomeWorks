package month2.month2Praktik12;

public class CatBarsik {
    private String name;
    private int age;

    public CatBarsik() {

    }

    public CatBarsik(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
        this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным или равным нулю");
        }
    }
}
