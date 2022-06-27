package month3.lesson32;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Tom", 4);
        Cat cat2 = new Cat("John", 5);
        Cat cat3 = new Cat("Jack", 3);
        Cat cat4 = new Cat("Jerry", 6);
        Cat cat5 = new Cat("Barsik", 7);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(null);

       Cat cat6 = getAgeName(cats, 4, "Tom");
       if (cat6 != null) {
           System.out.println("I Found!!!" + cat6.getName());
       }
        Cat[] catsArray = mass(cats);
        System.out.println(catsArray[4].getName());
    }

    private static Cat getAgeName(ArrayList<Cat> cats, Integer age, String name) {
        for (Cat c: cats) {
            if (c != null && c.getName().equals(name) && c.getAge().equals(age)) {
                return c;
            }
        }
        return null;
    }

    private static Cat[] mass(ArrayList<Cat> cats) {
        return cats.toArray(new Cat[cats.size()]);
    }
}
