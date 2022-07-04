package month3.lesson36.zadacha2;

public class Person2 {
    private String eat;
    private String go;

    public Person2() {

    }

    public Person2(String eat, String go) {
        this.eat = eat;
        this.go = go;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getGo() {
        return go;
    }

    public void setGo(String go) {
        this.go = go;
    }

    @Override
    public String toString() {
        return "Я:" +" | Еда = " + eat +  " | Иду = " + go;
    }

    void growUp() {
        for (int age = 20; age < 30; age++) {
            System.out.println("Я взраслею и мой возраст состовляет: " + age);
        }
    }

    void learning() {
        System.out.println("Я обучаюсь!");
    }
}
