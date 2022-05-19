package month2.HeroDragon;

public class GameHeroDragon {
    private int hp;
    private int strength;
    private int defence;
    private int weapon;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public GameHeroDragon(int hp, int strength, int defence, int weapon) {
        this.hp = hp;
        this.strength = strength;
        this.defence = defence;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "GameHeroDragon{" +
                "hp=" + hp +
                ", strength=" + strength +
                ", defence=" + defence +
                ", weapon=" + weapon +
                '}';
    }
}
