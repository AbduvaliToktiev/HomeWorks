package month2.HeroDragon;

public class Hero extends GameHeroDragon {
    private int shield;


    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public Hero(int hp, int strength, int defence, int weapon, int shield) {
        super(hp, strength, defence, weapon);
        this.shield = shield;
    }

    @Override
    public String toString() {
        return super.toString() + "Hero{" +
                "shield=" + shield +
                '}';
    }
}
