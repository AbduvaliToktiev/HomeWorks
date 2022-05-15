package month2.Praktik13;

public class Student {
    private String name;

    public Student(String newS) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
