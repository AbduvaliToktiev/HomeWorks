package month2.Praktik13;

import java.util.Arrays;

public class Group {
    Student[] students;

public Group(Student[] students) {
    this.students = students;
}

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}

