public class Test {
    private final void flipper() {
        System.out.println("Clidder");
    }
}

class Clidlet extends Test {
    public final void flipper() {
        System.out.println("Clidlet");
    }

    public static void main(String[] args) {
        new Clidlet().flipper();
    }
}

class Mixer {
    Mixer m1;

    Mixer() {
    }

    Mixer(Mixer m) {
        m1 = m;
    }

    public static void main(String[] args) {
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer(m2);
        m3.go();
        Mixer m4 = m3.m1;
        m4.go();
        Mixer m5 = m2.m1;
        m5.go();
    }

    void go() {
        System.out.print("hi ");
    }
}

class Dem{
    public static void display(){}
}
 class Sample extends Dem {
    public static void display(){
        System.out.println("Hello this is a static method");
    }
    public static void main(String args[]) throws Exception{
        new Sample().display();
    }
}
