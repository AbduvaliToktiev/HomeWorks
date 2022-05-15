package month2.month2Praktik12;

public class CatBarsik2 {
    public static void main(String[] args) {
        CatBarsik catBarsik = new CatBarsik("Barsik", 6);
        System.out.println("Первое имя кота: " + catBarsik.getName());
        catBarsik.setName("Tom");
        System.out.println("Второе имя кота: " + catBarsik.getName());
        catBarsik.setAge(-11);
        System.out.println("Возраст кота: " + catBarsik.getAge() + " лет");
    }
}
