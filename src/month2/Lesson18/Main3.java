package month2.Lesson18;

public class Main3 {
    public static void main(String[] args) {
        double sum = 0;
        double count = 0;
        Student[] students = new Student[3];
        Student student1 = new Student();
        student1.setFIO("Testov Test Testovich");
        student1.setAge(18);
        student1.setGrade(5);
        Student student2 = new Student();
        student2.setFIO("Testova Test Testovna");
        student2.setAge(17);
        student2.setGrade(5);
        Student student3 = new Student();
        student3.setFIO("Testovo Test Testovnovich");
        student3.setAge(20);
        student3.setGrade(3);
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getGrade();
            count += 1;

            System.out.println("Count1 = " + count);
            System.out.println("Sum1 = " + sum);
            System.out.println("AVG = " + (double) sum / count);
        }
        for (Student st : students) {
            sum += st.getGrade();
            count += 1;
        }
        System.out.println("Count2 = " + count);
        System.out.println("Sum2 = " + sum);
        System.out.println("AVG = " + (double) sum / count);
    }
}