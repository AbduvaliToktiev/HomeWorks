package month3.lesson27;

public class Oceanarium {
    public static void main(String[] args) {
        Movable[] oceanarium = new Movable[]{new Tutle(), new Shark(), new Duck()};
        System.out.println(((Shark) oceanarium[1]).Hunt());
    }
}
