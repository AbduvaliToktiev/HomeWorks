package month3.lesson36.zadacha3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person person1 = new Person(21, "Azamat");
        Person person2 = new Person(22, "Nurik");
        Person person3 = new Person(23, "Abduvali");
        Person person4 = new Person(24, "Aziz");
        Person person5 = new Person(22, "Ruslan");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        System.out.println(people);
    }
}
