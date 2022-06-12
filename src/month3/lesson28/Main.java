package month3.lesson28;

public class Main {
    public static void main(String[] args) {
        Rulenable mayor = new Mayor();
        System.out.println(((Mayor)mayor).road());
        System.out.println(((Mayor)mayor).trafficLight());
        System.out.println();
        CarRulenable driver = new Drivers();
        System.out.println(((Drivers)driver).turn());
        System.out.println(((Drivers)driver).stop());
        System.out.println();
        ParentsRulenable parents = new Parents();
        System.out.println(((Parents)parents).getReady());
        System.out.println(((Parents)parents).getDressed());

    }
}
