package month2.Praktik13;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
    Student[] students = {new Student("1"), new Student("2"), new Student("3")};
    Group group = new Group();

        System.out.println();

        Student [] newStudents = new Student[group.getStudents().length + 2];

        for (int i = 0; i < group.getStudents().length; i++) {
            newStudents[i] = group.getStudents()[i];
        }

        newStudents[group.getStudents().length] = new Student("newS");
        newStudents[group.getStudents().length + 1] = new Student("newS2");

        group.setStudents(newStudents);

        System.out.println(Arrays.toString(students));
        System.out.println();
    }
}
