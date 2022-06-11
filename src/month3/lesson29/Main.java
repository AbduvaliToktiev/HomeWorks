package month3.lesson29;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[2];
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.setName("Name1");
        cat2.setName("Name2");
        cats[0] = cat1;
        cats[1] = cat2;
        for (Cat c : cats) {
            try {
                System.out.println(c.getName());
        cats[2] = null;
            } catch (NullPointerException e) {
                System.out.println(e.getMessage() + " I am here Exception");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage() + " error");
            }
        }
    }
}