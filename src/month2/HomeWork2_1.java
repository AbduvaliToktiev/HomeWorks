package month2;

public class HomeWork2_1 {
    public static void main(String[] args) {
    }
}

class Student1 {
    int well;
    String university;
    String direction;
    public static void main(String[] args) {
    Student1 student = new Student1();
    student.well = 3;
    student.direction = "Engineer";
    student.university = "Politeh";
    System.out.println("Студент обучается на: " + student.well + " курсе\n" +
            "Направление: " + student.direction + "\n" +
            "Студет обучается в университете под названием: " + student.university);
    }
}

