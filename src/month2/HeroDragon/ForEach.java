package month2.HeroDragon;

public class ForEach {
    public static void main(String[] args) {
        String[] names = {"1", "2", "3"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
