package month3.lesson36.zadacha2;


import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person(28, "Высшее");
        System.out.println(person);
        FileWriter fileWriter = new FileWriter("fileAgeEat.txt");
        fileWriter.write(person.getAge());
        fileWriter.write(person.eat());
        fileWriter.close();
        person.go();
        person.eat();
    }
}

